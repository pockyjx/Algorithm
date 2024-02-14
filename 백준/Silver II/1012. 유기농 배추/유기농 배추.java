import java.io.*;
import java.util.*;
public class Main {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] graph;
    static int cnt, n, m, k;
    static Queue<int[]> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken()); // 가로
            n = Integer.parseInt(st.nextToken()); // 세로
            k = Integer.parseInt(st.nextToken());
            cnt = 0;

            graph = new int[n][m];

            for(int j=0;j<k;j++) {
                st = new StringTokenizer(br.readLine());
                int y = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());

                graph[x][y] = 1;
            }

            for(int j=0;j<n;j++) {
                for(int l=0;l<m;l++) {
                    if(graph[j][l] == 1) {
                        q.offer(new int[] {j, l});
                        bfs();
                    }
                }
                if(k == 0) break;
            }

            sb.append(cnt + "\n");
        }

        System.out.println(sb);

    }
    
    static void bfs() {
        while(!q.isEmpty()) {
            int[] poll = q.poll();
            int px = poll[0]; int py = poll[1];

            for(int i=0;i<4;i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];

                if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if(graph[nx][ny] == 1) {
                    q.offer(new int[] {nx, ny});
                    graph[nx][ny] = 0; k--;
                }
            }
        }
        cnt++;
    }
}