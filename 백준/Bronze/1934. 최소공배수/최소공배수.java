import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		int a, b, gcd, lcm;
	
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<t;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			gcd = eucd(Math.max(a, b), Math.min(a, b));
			lcm = (a/gcd) * (b/gcd) * gcd;
			sb.append(lcm).append("\n");
		}
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
	
	static int eucd(int x, int y) {
		int z = x % y;
		
		if(z == 0) return y;
		return eucd(y, z);
	}
}