import java.util.*;
import java.io.*;

public class Main {
	static int n, cnt;
	static int[] choose;
	static boolean[] visited, finished;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++) {
			n = Integer.parseInt(br.readLine());
			choose = new int[n+1];
			visited = new boolean[n+1];
			finished = new boolean[n+1];
			cnt = 0;

			st = new StringTokenizer(br.readLine());
			for(int j=1;j<=n;j++) {
				choose[j] = Integer.parseInt(st.nextToken());
			}

			for(int j=1;j<=n;j++) {
				if(!finished[j]) dfs(j);
			}

			System.out.println(n - cnt);
		}
	}

	static void dfs(int idx) {
		if(finished[idx]) return;

		if(visited[idx]) { // 재방문 : 사이클 돌았다는 뜻
			finished[idx] = true;
			cnt++;
		}

		visited[idx] = true;
		dfs(choose[idx]);
		finished[idx] = true;
		visited[idx] = false;
	}
}