import java.io.*;
import java.util.*;
public class Main {
	
	static int n;
	static int[][] power;
	static boolean[] isPossible;
	static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		power = new int[n][n];
		isPossible = new boolean[n];
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<n;j++) {
				power[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dfs(0, 0);
		bw.write(min + "");
		
		br.close();
		bw.close();
	}
	
	static void diff() {
		int start = 0, link = 0;
		
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(isPossible[i] && isPossible[j]) 
					start += power[i][j] + power[j][i];
				else if(!isPossible[i] && !isPossible[j])
					link += power[i][j] + power[j][i];
			}
		}
		
		min = Math.min(Math.abs(start-link), min);
	
	}
	 
	static void dfs(int idx, int depth) {
		
		if(depth == n/2) {
			diff(); return;
		}
		 
		for(int i=idx;i<n;i++) {
			isPossible[i] = true;
			dfs(i+1, depth+1);
			isPossible[i] = false;
		}
	}
}