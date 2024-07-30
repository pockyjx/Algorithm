import java.util.*;
import java.io.*;

public class Main {

	static int n;
	static int[][] graph;
	static boolean[][] isVisit;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		n = Integer.parseInt(br.readLine());
		graph = new int[n][n];

		int max = 0;
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());

			for(int j=0;j<n;j++) {
				graph[i][j] = Integer.parseInt(st.nextToken());
				max = Math.max(max, graph[i][j]); // 최대 높이
			}
		}

		int cnt = 0;
		int answer = 1; // 전체가 안 잠긴 경우

		for(int i=0;i<max;i++) {
			isVisit = new boolean[n][n];
			cnt = 0;

			for(int j=0;j<n;j++) {
				for(int k=0;k<n;k++) {
					if(!isVisit[j][k] && graph[j][k] > i) {
						dfs(j, k, i);
						cnt++;
					}
				}
			}

			answer = Math.max(cnt, answer);
		}

		System.out.println(answer);
	}

	static void dfs(int x, int y, int h) {
		isVisit[x][y] = true;

		for(int i=0;i<4;i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if(nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
			if(!isVisit[nx][ny] && graph[nx][ny] > h) dfs(nx, ny, h);
		}
	}
} 