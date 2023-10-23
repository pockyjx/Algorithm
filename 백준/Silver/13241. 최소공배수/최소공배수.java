import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		
		long gcd = eucd(Math.max(a, b), Math.min(a, b));
		long lcm = (a/gcd) * (b/gcd) * gcd;
		bw.write(lcm + "");
		
		br.close();
		bw.close();
	}
	
	static long eucd(long x, long y) {
		long z = x % y;
		
		if(z == 0) return y;
		return eucd(y, z);
	}
}