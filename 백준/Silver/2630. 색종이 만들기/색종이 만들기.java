import java.util.*;
import java.io.*;

public class Main {
	static int blue, white;
	static int[][] paper;

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

		divide(0, 0, n);
		System.out.println(white);
		System.out.println(blue);
	}

	static void divide(int x, int y, int n) {
		if(check(x, y, n)) {
			if(paper[x][y] == 1) blue++;
			else white++;
			return;
		}

		int half = n / 2;

		divide(x+half, y, half);
		divide(x, y, half);
		divide(x, y+half, half);
		divide(x+half, y+half, half);
	}

	static boolean check(int x, int y, int n) {
		int color = paper[x][y];

		for(int i=x;i<x+n;i++) {
			for(int j=y;j<y+n;j++) {
				if(paper[i][j] != color) return false;
			}
		}
		return true;
	}
}