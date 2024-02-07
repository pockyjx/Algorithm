import java.io.*;
import java.util.*;
public class Main {

    static int[] graph = new int[100001];
    static int s, e;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        s = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());

        System.out.println(bfs());
    }

    static int bfs() {
        Queue<Integer> q = new LinkedList<>();
        q.offer(s);
        graph[s] = 1;

        while(!q.isEmpty()) {
            int tmp = q.poll();
            if(tmp == e) return graph[tmp]-1;

            if(tmp-1 >= 0 && graph[tmp-1] == 0) {
                graph[tmp-1] = graph[tmp] + 1;
                q.offer(tmp-1);
            }

            if(tmp+1 < 100001 && graph[tmp+1] == 0) {
                graph[tmp+1] = graph[tmp] + 1;
                q.offer(tmp+1);
            }

            if(tmp*2 < 100001 && graph[tmp*2] == 0) {
                graph[tmp*2] = graph[tmp] + 1;
                q.offer(tmp*2);
            }
        }
        return 0;
    }
}