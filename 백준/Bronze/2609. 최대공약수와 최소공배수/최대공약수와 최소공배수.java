import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int gcd = eucd(Math.max(a, b), Math.min(a, b)); // 최대공약수
		int lcm = (a/gcd) * (b/gcd) * gcd;
		bw.write(gcd + "\n"+ lcm);
		
		br.close();
		bw.close();
	}
	
	static int eucd(int x, int y) {
		int z = x % y;
		
		if(z == 0) return y;
		return eucd(y, z);
	}
}