import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] num = new int[n+1];
		int[] dp = new int[n+1];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=1;i<=n;i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}

		int max = dp[1];
		for(int i=1;i<=n;i++) {
			dp[i] = num[i];

			for(int j=1;j<i;j++) {
				if(num[j] < num[i]) {
					dp[i] = Math.max(dp[j]+num[i], dp[i]);
				}
			}
			max = Math.max(max, dp[i]);
		}

		System.out.println(max);
	}
}