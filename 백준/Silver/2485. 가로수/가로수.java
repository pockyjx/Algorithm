import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		int gcd = 0;
		for(int i=0;i<n-1;i++) {
			int distance = arr[i+1] - arr[i];
			gcd = gcd(Math.max(distance, gcd), Math.min(distance, gcd));
		}
		bw.write((arr[n-1] - arr[0]) / gcd + 1 - n + "");
		
		br.close();
		bw.close();
	}
	
	static int gcd(int x, int y) {
		if(y == 0) return x;
		int z = x % y;

		if(z == 0) return y;
		return gcd(y, z);
	}
}