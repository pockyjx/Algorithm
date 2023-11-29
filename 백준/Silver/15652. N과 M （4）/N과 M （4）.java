import java.io.*;
import java.util.*;
public class Main {
	
	static int n, m;
	static boolean[] isUsed;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		isUsed = new boolean[n+1];
		arr = new int[m];
		
		dfs(0, 1);
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
	
	static void dfs(int depth, int num) {
		if(depth == m) {
			for(int i=0;i<m;i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=num;i<=n;i++) {
			arr[depth] = i;
			dfs(depth+1, i);
		}
	}
}