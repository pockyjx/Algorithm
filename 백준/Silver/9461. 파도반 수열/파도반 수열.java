import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for(int i=0;i<t;i++) {
			int n = Integer.parseInt(br.readLine());

			if(n < 3) {
				System.out.println(1); continue;
			}

			long[] mem = new long[n];
			mem[0] = mem[1] = mem[2] = 1;

			for(int j=3;j<n;j++) {
				mem[j] = mem[j-2] + mem[j-3];
			}

			System.out.println(mem[n-1]);
		}
	}
}