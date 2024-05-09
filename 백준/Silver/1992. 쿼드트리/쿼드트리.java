import java.io.*;

public class Main {

	static char[][] video;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		video = new char[n][n];
		for(int i=0;i<n;i++) {
			String s = br.readLine();

			for(int j=0;j<n;j++) {
				video[i][j] = s.charAt(j);
			}
		}

		divided(0, 0, n);
		System.out.println(sb.toString());
	}

	static void divided(int x, int y, int n) {
		if(check(x, y, n)) {
			sb.append(video[x][y]);
			return;
		}

		int half = n / 2;

		sb.append("(");
		
		divided(x, y, half);
		divided(x, y + half, half);
		divided(x + half, y, half);
		divided(x + half, y + half, half);

		sb.append(")");
	}

	static boolean check(int x, int y, int n) {
		int tmp = video[x][y];

		for(int i=x;i<x+n;i++) {
			for(int j=y;j<y+n;j++) {
				if(video[i][j] != tmp) return false;
			}
		}

		return true;
	}
}