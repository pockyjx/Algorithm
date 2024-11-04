import java.io.*;
public class Main {
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int cnt = (int)Math.pow(2, n) - 1;

		hanoi(n, 1, 2, 3);
		System.out.println(cnt);
		System.out.println(sb.toString());
	}

	static void hanoi(int n, int from, int tmp, int to) {
		if(n == 1) {
			sb.append(from + " " + to + "\n");
			return;
		}

		hanoi(n-1, from, to, tmp);
		sb.append(from + " " + to + "\n");
		hanoi(n-1, tmp, from, to);
	}
}
