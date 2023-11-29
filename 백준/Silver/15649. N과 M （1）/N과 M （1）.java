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
		arr = new int[m+1];
		
		dfs(0);
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
	
	static void dfs(int idx) {
		
		if(idx == m) {
			for(int i=0;i<m;i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=1;i<=n;i++) {
			if(!isUsed[i]) {
				isUsed[i] = true;  
				arr[idx] = i;
				dfs(idx+1);
				isUsed[i] = false;
			}
		}
	}
}