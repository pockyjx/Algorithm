import java.io.*;
import java.util.*;

public class Main {

    static int[][] network;
    static boolean[] isVisit;
    static int n, m;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        network = new int[n+1][n+1];
        isVisit = new boolean[n+1];

        m = Integer.parseInt(br.readLine());
        for(int i=0;i<m;i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            network[a][b] = 1;
            network[b][a] = 1;
        }

        dfs(1);
        System.out.println(cnt-1);
    }

    static void dfs(int x) {
        isVisit[x] = true;
        cnt++;

        for(int i=1;i<=n;i++) {
            if(network[x][i] == 1 && !isVisit[i]) {
                dfs(i);
            }
        }
    }
}