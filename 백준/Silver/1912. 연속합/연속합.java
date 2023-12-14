import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[]  arr = new int[n];
		Integer[] memo = new Integer[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		memo[0] = arr[0];
		int max = arr[0];
		
		for(int i=1;i<n;i++) {
			memo[i] = Math.max(memo[i-1] + arr[i], arr[i]);
			max = Math.max(max, memo[i]);
		}
		bw.write(max + "");
		
		br.close();
		bw.close();
	}
}