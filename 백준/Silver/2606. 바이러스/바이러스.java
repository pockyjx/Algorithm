import java.io.*;
import java.util.*;

public class Main {
	static int[][] graph;
	static boolean[] isVisit;
	static int n, m, cnt = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());

		graph = new int[n+1][n+1];
		isVisit = new boolean[n+1];

		for(int i=1;i<=m;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			graph[a][b] = graph[b][a] = 1;
		}

		bfs(1);
		System.out.println(cnt);
	}

	static void bfs(int v) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(v);
		isVisit[v] = true;

		while(!q.isEmpty()) {
			int p = q.poll();
			
			for(int i=1;i<=n;i++) {
				if(graph[p][i] == 1 && !isVisit[i]) {
					q.offer(i);
					isVisit[i] = true;
					cnt++;
				}
			}
		}
	}
}