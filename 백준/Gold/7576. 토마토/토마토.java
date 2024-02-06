import java.io.*;
import java.util.*;

public class Main {

    static int[][] graph;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int n, m;
    static Queue<int[]> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
                if(graph[i][j] == 1) q.offer(new int[] {i, j});
            }
        }
        bw.write(bfs() + "");
        bw.close();
    }

    static int bfs() {
        while(!q.isEmpty()) {
            int[] tmp = q.poll();
            int px = tmp[0];
            int py = tmp[1];

            for(int i=0;i<4;i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];

                if(nx < 0 || ny < 0 || nx > n-1 || ny > m-1) continue;
                if(graph[nx][ny] == 0) {
                    graph[nx][ny] = graph[px][py] + 1;
                    q.offer(new int[] {nx, ny});
                }
            }
        }

        int day = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(graph[i][j] == 0) return -1;
                day = Math.max(day, graph[i][j]);
            }
        }
        return day - 1;
    }
}