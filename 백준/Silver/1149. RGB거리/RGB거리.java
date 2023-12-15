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
		
		int result = Math.min(paint(n-1, 0), 
								Math.min(paint(n-1, 1), paint(n-1, 2)));
		
		bw.write(result + "");
		
		br.close();
		bw.close();
	}
	
	static int paint(int n, int color) {
		
		if(dp[n][color] == 0) {
			// 빨강
			if(color == 0)
				dp[n][color] = Math.min(paint(n-1, 1) , paint(n-1, 2)) + cost[n][color];
			
			// 초록
			else if(color ==  1)
				dp[n][color] = Math.min(paint(n-1, 0), paint(n-1, 2)) + cost[n][color];
			
			// 파랑
			else
				dp[n][color] = Math.min(paint(n-1, 0), paint(n-1, 1)) + cost[n][color];
		}
		
		return dp[n][color];
	}
}