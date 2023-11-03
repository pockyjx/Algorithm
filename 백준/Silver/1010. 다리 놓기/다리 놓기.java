import java.io.*;
import java.util.*;
public class Main {
	
	static final int MAX = 30;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		int[][] dp = new int[MAX+1][MAX+1];
		
		for(int i=1;i<=MAX;i++) {
			dp[i][1] = i;
		}
		
		for(int i=2;i<=MAX;i++) {
			for(int j=2;j<=MAX;j++) {
				dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
			}
		}
		
		for(int i=0;i<t;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			sb.append(dp[m][n] + "\n");
		}
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
}