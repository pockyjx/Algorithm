import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		long[] mem = new long[n+1];
		mem[0] = 0; mem[1] = 1;

		for(int i=2;i<=n;i++) {
			mem[i] = mem[i-2] + mem[i-1];
		}

		System.out.println(mem[n]);
	}
}