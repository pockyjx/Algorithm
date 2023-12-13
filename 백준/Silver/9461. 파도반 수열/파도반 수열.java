import java.io.*;
public class Main {
	
	static long[] memo = new long[100];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		memo[0] = memo[1] = memo[2] = 1;
		
		for(int i=0;i<t;i++) {
			int k = Integer.parseInt(br.readLine());
			sb.append(dp(k)).append("\n");
		}
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
	
	static long dp(int n) {
		
		if(memo[n-1] != 0) return memo[n-1];
		
		for(int i=3;i<n;i++) {
			memo[i] = memo[i-2] + memo[i-3];
		}
		return memo[n-1];
	}
}