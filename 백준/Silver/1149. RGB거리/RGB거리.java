import java.io.*;
import java.util.*;
public class Main {
	
	static int[][] cost, dp;
			
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		cost = new int[n][3];
		dp = new int[n][3];
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			cost[i][0] = Integer.parseInt(st.nextToken()); // R
			cost[i][1] = Integer.parseInt(st.nextToken()); // G
			cost[i][2] = Integer.parseInt(st.nextToken()); // B
		}
		
		dp[0][0] = cost[0][0];
		dp[0][1] = cost[0][1];
		dp[0][2] = cost[0][2];
		
		paint(n);
		int result = Math.min(dp[n-1][0], Math.min(dp[n-1][1], dp[n-1][2]));
		
		bw.write(result + "");
		
		br.close();
		bw.close();
	}
	
	static void paint(int n) {
		for(int i=1;i<n;i++) {
			dp[i][0] = cost[i][0] + Math.min(dp[i-1][1], dp[i-1][2]); // 빨
			dp[i][1] = cost[i][1] + Math.min(dp[i-1][0], dp[i-1][2]); // 초
			dp[i][2] = cost[i][2] + Math.min(dp[i-1][0], dp[i-1][1]); // 파
		}
	}
}