import java.io.*;
import java.util.*;

public class Main {

    static int[][] graph;
    static boolean[][] isVisit;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int n, m;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        isVisit = new boolean[n][m];

        for(int i=0;i<n;i++) {
            String s = br.readLine();

            for(int j=0;j<m;j++) {
                graph[i][j] = s.charAt(j) - '0';
            }
        }

        bfs(0, 0);

        bw.write(graph[n-1][m-1] + "");
        bw.close();
    }

    static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {x, y});
        isVisit[x][y] = true;

        while(!q.isEmpty()) {
            int[] tmp = q.poll();
            int px = tmp[0];
            int py = tmp[1];

            for(int i=0;i<4;i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];

                if(nx < 0 || ny < 0 || nx > n-1 || ny > m-1) continue;
                if(graph[nx][ny] == 1 && !isVisit[nx][ny]) {
                    q.offer(new int[] {nx, ny});
                    isVisit[nx][ny] = true;
                    graph[nx][ny] = graph[px][py] + 1;
                }
            }
        }
    }
}