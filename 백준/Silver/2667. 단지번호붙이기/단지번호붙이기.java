import java.util.*;
import java.io.*;

public class Main {

    static int[][] graph;
    static boolean[][] isVisit;
    static int n;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        graph = new int[n][n];
        isVisit = new boolean[n][n];

        for(int i=0;i<n;i++) {
            String s = br.readLine();

            for(int j=0;j<n;j++) {
                graph[i][j] = s.charAt(j) - '0';
            }
        }

        List<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(graph[i][j] == 1 && !isVisit[i][j]) {
                    list.add(bfs(i, j));
                }
            }
        }

        System.out.println(list.size());

        Collections.sort(list);
        for(int i : list) {
            System.out.println(i);
        }
    }

    static int bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {x, y});
        isVisit[x][y] = true;

        int cnt = 1;
        while(!q.isEmpty()) {
            int[] poll = q.poll();
            int px = poll[0]; int py = poll[1];

            for(int i=0;i<4;i++) {
                int nx = px + dx[i]; int ny = py + dy[i];
                if(nx < 0 || ny < 0 || nx >= n || ny >= n) continue;

                if(graph[nx][ny] == 1 && !isVisit[nx][ny]) {
                    q.offer(new int[] {nx, ny});
                    isVisit[nx][ny] = true;
                    cnt++;
                }
            }
        }

        return cnt;
    }
}