import java.io.*;
import java.util.*;
public class Main {

    static int[] dx = {-2, -2, 1, -1, 2, 2, 1, -1};
    static int[] dy = {1, -1, -2, -2, 1, -1, 2, 2};
    static int[][] graph;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            n = Integer.parseInt(br.readLine());
            graph = new int[n][n];

            st = new StringTokenizer(br.readLine());
            int sx = Integer.parseInt(st.nextToken());
            int sy = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int ex = Integer.parseInt(st.nextToken());
            int ey = Integer.parseInt(st.nextToken());

            graph[sx][sy] = 1;
            bfs(sx, sy);
            System.out.println(graph[ex][ey]-1);
        }
    }

    static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {x, y});

        while(!q.isEmpty()) {
            int[] poll = q.poll();
            int px = poll[0]; int py = poll[1];

            for(int i=0;i<8;i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];

                if(nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
                if(graph[nx][ny] == 0) {
                    graph[nx][ny] = graph[px][py] + 1;
                    q.offer(new int[] {nx, ny});
                }
            }
        }
    }
}