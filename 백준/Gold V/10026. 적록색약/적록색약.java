import java.io.*;
import java.util.*;
public class Main {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static char[][] graph;
    static boolean[][] isVisit;
    static int n, cnt;
    static Queue<int[]> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        graph = new char[n][n];
        isVisit = new boolean[n][n];

        for(int i=0;i<n;i++) {
            String s = br.readLine();
            for(int j=0;j<n;j++) {
                graph[i][j] = s.charAt(j);
            }
        }

        // 적록 색약이 아닌 경우
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(!isVisit[i][j]) {
                    q.offer(new int[] {i, j});
                    isVisit[i][j] = true;
                    bfs1(graph[i][j]);
                }

                if(graph[i][j] == 'G') graph[i][j] = 'R';
            }
        }
        sb.append(cnt + " ");

        // 적록 색약인 경우
        cnt = 0;
        isVisit = new boolean[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(!isVisit[i][j]) {
                    q.offer(new int[] {i, j});
                    isVisit[i][j] = true;
                    bfs1(graph[i][j]);
                }
            }
        }
        sb.append(cnt);
        System.out.println(sb);
    }

    static void bfs1(char color) {
        while(!q.isEmpty()) {
            int[] poll = q.poll();
            int px = poll[0]; int py = poll[1];

            for(int i=0;i<4;i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];

                if(nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
                if(graph[nx][ny] == color && !isVisit[nx][ny]) {
                    isVisit[nx][ny] = true;
                    q.offer(new int[] {nx, ny});
                }
            }
        }
        cnt++;
    }
}