import java.util.*;
import java.io.*;

public class Main {

	static int[][] graph;
	static boolean[][] visited;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int n, m;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		graph = new int[n][m];
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<m;j++) {
				graph[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int year = 0;
		while(true) {
			visited = new boolean[n][m];
			int cnt = 0;

			for(int i=0;i<n;i++) { // 1. 덩어리 개수 세기
				for(int j=0;j<m;j++) {
					if(graph[i][j] > 0 && !visited[i][j]) {
						countIce(i, j);
						cnt++;
					}
				}
			}

			if(cnt == 0) { // 쪼개지기 전에 다 녹음
				System.out.println(0); return;
			} else if(cnt > 1) { // 쪼개짐
				System.out.println(year); return;
			}

			melt(); // 2. 빙하 녹이기
			year++;
		}
	}

	static void countIce(int x, int y) {
		visited[x][y] = true;

		for(int i=0;i<4;i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
			if(graph[nx][ny] > 0 && !visited[nx][ny]) {
				countIce(nx, ny);
			}
		}
	}

	static void melt() {
		Queue<int[]> q = new LinkedList<>();
		visited = new boolean[n][m];

		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(graph[i][j] > 0) {
					q.offer(new int[] {i, j});
					visited[i][j] = true;
				}
			}
		}

		while(!q.isEmpty()) {
			int[] p = q.poll();
			int px = p[0]; int py = p[1];

			for(int i=0;i<4;i++) {
				int nx = px + dx[i];
				int ny = py + dy[i];

				if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
				if(graph[nx][ny] == 0 && !visited[nx][ny] && graph[px][py] > 0) {
					graph[px][py]--;
				}
			}
		}
	}
}