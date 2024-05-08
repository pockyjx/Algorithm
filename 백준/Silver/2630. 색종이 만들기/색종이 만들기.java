import java.io.*;
import java.util.*;

public class Main {

	static int[][] paper;
	static int white = 0, blue = 0;

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
		System.out.println(white);
		System.out.println(blue);
	}

	static void divided(int x, int y, int n) {
		if(check(x, y, n)) {
			if(paper[x][y] == 0) {
				white++;
			}
			else {
				blue++;
			}
			return;
		}

		int half = n / 2;

		divided(x, y, half); // 2사분면
		divided(x, y + half, half); // 3사분면
		divided(x + half, y, half); // 1사분면
		divided(x + half, y + half, half); // 4사분면
	}

	static boolean check(int x, int y, int n) {
		for(int i=x;i<x+n;i++) {
			for(int j=y;j<y+n;j++) {
				if(paper[i][j] != paper[x][y]) return false;
			}
		}

		return true;
	}
}