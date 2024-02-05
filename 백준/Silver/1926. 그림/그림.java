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
        n = Integer.parseInt(st.nextToken()); // 세로 (행)
        m = Integer.parseInt(st.nextToken()); // 가로 (열)

        graph = new int[n][m];
        isVisit = new boolean[n][m];

        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cnt = 0;
        int max = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(graph[i][j] == 1 && !isVisit[i][j]) {
                    max = Math.max(max, bfs(j, i));
                    cnt++;
                }
            }
        }

        bw.write(cnt + "\n" + max);
        bw.close();
    }

    static int bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {x, y});
        isVisit[y][x] = true;

        int area = 1;
        while(!q.isEmpty()) {
            int[] tmp = q.poll();
            int px = tmp[0]; int py = tmp[1];

            for(int i=0;i<4;i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];

                if(nx < 0 || ny < 0 || nx > m-1 || ny > n-1) continue;
                if(graph[ny][nx] == 1 && !isVisit[ny][nx]) {
                    q.offer(new int[] {nx, ny});
                    isVisit[ny][nx] = true;
                    area++;
                }
            }
        }
        return area;
    }
}