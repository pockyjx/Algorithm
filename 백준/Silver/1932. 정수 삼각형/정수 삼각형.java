import java.io.*;
import java.util.*;
public class Main {
	
	static int[][] triangle;
	static int[][] dp;
	static int n;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		n = Integer.parseInt(br.readLine());
		triangle = new int[n][n];
		dp = new int[n][n];
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
		
			for(int j=0;j<=i;j++) {
				triangle[i][j] = Integer.parseInt(st.nextToken());
				dp[i][j] = -1;
			}
		}
		
		for(int i=0;i<n;i++) {
			dp[n-1][i] = triangle[n-1][i];
		}
		
		bw.write(cal(0, 0) + "");
		
		br.close();
		bw.close();
	}
	
	static int cal(int col, int row) {

		if(col == n-1) return dp[col][row];
		
		if(dp[col][row] == -1) {
			dp[col][row] = triangle[col][row] + 
					Math.max(cal(col+1, row), cal(col+1, row+1) );
		}

		return dp[col][row];
	}
}