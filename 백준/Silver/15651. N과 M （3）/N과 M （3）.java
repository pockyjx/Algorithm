import java.io.*;
import java.util.*;
public class Main {
	
	static int n, m;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		
		dfs(0);
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
	
	static void dfs(int depth) {
		if(depth == m) {
			for(int i=0;i<m;i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=1;i<=n;i++) {
			arr[depth] = i;
			dfs(depth+1);
		}
	}
}