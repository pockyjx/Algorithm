import java.io.*;
import java.util.*;

public class Main {

    static int[][] graph;
    static boolean[][] isVisit;
    static int n, m, cnt;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            graph = new int[n][m];
            isVisit = new boolean[n][m];

            for(int j=0;j<k;j++) {
                st = new StringTokenizer(br.readLine());
                int y = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());
                graph[x][y] = 1;
            }

            cnt = 0;
            for(int j=0;j<n;j++) {
                for(int l=0;l<m;l++) {
                    if(graph[j][l] == 1 && !isVisit[j][l]) {
                        dfs(j, l);
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);
        }
    }

    static void dfs(int x, int y) {
        for(int i=0;i<4;i++) {
            isVisit[x][y] = true;

            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
            if(graph[nx][ny] == 1 && !isVisit[nx][ny]) {
                isVisit[nx][ny] = true;
                dfs(nx, ny);
            }
        }
    }
}