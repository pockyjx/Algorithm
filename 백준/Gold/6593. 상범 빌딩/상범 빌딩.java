import java.util.*;
import java.io.*;

public class Main {
	static char[][][] graph;
	static boolean[][][] visited;
	static int l, r, c;
	static int[] dx = {-1, 1, 0, 0, 0, 0};
	static int[] dy = {0, 0, -1, 1, 0, 0};
	static int[] dz = {0, 0, 0, 0, -1, 1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		while(true) {
			st = new StringTokenizer(br.readLine());
			l = Integer.parseInt(st.nextToken());
			r = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());

			if(l == 0 && r == 0 && c == 0) {
				return;
			}

			graph = new char[l][r][c];
			visited = new boolean[l][r][c];

			int sx = 0, sy = 0, sz = 0;
			for(int i=0;i<l;i++) {
				for(int j=0;j<r;j++) {
					String s = br.readLine();

					for(int k=0;k<c;k++) {
						graph[i][j][k] = s.charAt(k);
						if(graph[i][j][k] == 'S') {
							sx = i; sy = j; sz = k;
						}
					}
				}
				br.readLine();
			}

			bfs(sx, sy, sz);
		}
	}

	static void bfs(int x, int y, int z) {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {x, y, z, 0});
		visited[x][y][z] = true;

		while (!q.isEmpty()) {
			int[] p = q.poll();
			int px = p[0], py = p[1], pz = p[2], cnt = p[3];

			if (graph[px][py][pz] == 'E') {
				System.out.println("Escaped in " + cnt + " minute(s).");
				return;
			}

			for (int i = 0; i < 6; i++) {
				int nx = px + dx[i], ny = py + dy[i], nz = pz + dz[i];
				if (nx < 0 || ny < 0 || nz < 0 || nx >= l || ny >= r || nz >= c)
					continue;

				if ((graph[nx][ny][nz] == '.' || graph[nx][ny][nz] == 'E') && !visited[nx][ny][nz]) {
					q.offer(new int[] {nx, ny, nz, cnt+1});
					visited[nx][ny][nz] = true;
				}
			}
		}
		System.out.println("Trapped!");
	}
}
