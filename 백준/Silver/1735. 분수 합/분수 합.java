import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		int deno = lcm(b, d, gcd(Math.max(b, d), Math.min(b, d))); // 분모 : 최소공배수
		int nume = (a * (deno/b)) + (c * (deno/d)); // 분자 합
		
		int gcd = gcd(deno, nume); // 분자, 분모의 최대공약수
		bw.write((nume/gcd) + " " + (deno/gcd)); // 기약분수 출력
		
		br.close();
		bw.close();
	}
	
	static int gcd(int x, int y) { // 최대공약수
		int z = x % y;
		
		if(z == 0) return y;
		return gcd(y, z);
	}
	
	static int lcm(int a, int b, int gcd) { // 최소공배수
		return (a/gcd) * (b/gcd) * gcd;
	}
}