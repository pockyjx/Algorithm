import java.io.*;
import java.util.*;

public class Main {

	static int[][] paper;
	static int minus = 0, zero = 0, plus = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		paper = new int[n][n];

		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<n;j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		divided(0, 0, n);

		System.out.println(minus);
		System.out.println(zero);
		System.out.println(plus);


	}

	static void divided(int x, int y, int n) {
		if(check(x, y, n)) {
			if(paper[x][y] == -1) minus++;
			else if(paper[x][y] == 0) zero++;
			else plus++;

			return;
		}

		int d = n / 3;

		divided(x, y, d); // 1
		divided(x+d, y, d); // 2
		divided(x+2*d, y ,d); // 3

		divided(x, y+d, d); // 4
		divided(x+d, y+d, d); // 5
		divided(x+2*d, y+d, d); // 6

		divided(x, y+2*d, d); // 7
		divided(x+d, y+2*d, d); // 8
		divided(x+2*d, y+2*d, d); // 9
	}

	static boolean check(int x, int y, int n) {
		for(int i=x;i<x+n;i++) {
			for(int j=y;j<y+n;j++) {
				if(paper[x][y] != paper[i][j]) return false;
			}
		}
		return true;
	}
}