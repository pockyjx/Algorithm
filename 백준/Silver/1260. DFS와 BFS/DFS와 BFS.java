import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[][] graph;
    static boolean[] isVisit;
    static int n, m, v;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        graph = new int[n+1][n+1];
        isVisit = new boolean[n+1];

        for(int i=0;i<m;i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x][y] = graph[y][x] = 1;
        }

        dfs(v);

        System.out.println();
        isVisit = new boolean[n+1];

        bfs(v);
    }

    static void dfs(int v) {
        isVisit[v] = true;
        System.out.print(v + " ");

        for(int i=1;i<=n;i++) {
            if(graph[v][i] == 1 && !isVisit[i]) dfs(i);
        }
    }

    static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        isVisit[v] = true;

        while(!q.isEmpty()) {
            int p = q.poll();
            System.out.print(p + " ");

            for(int i=1;i<=n;i++) {
                if(graph[p][i] == 1 && !isVisit[i]) {
                    q.offer(i);
                    isVisit[i] = true;
                }
            }
        }
    }
}