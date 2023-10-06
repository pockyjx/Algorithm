import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class Main {
	
	static int[][] arr;
	static boolean[] check;
	static int n, m, v;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken()); // 정점
		m = Integer.parseInt(st.nextToken()); // 간선
		v = Integer.parseInt(st.nextToken()); // 출발 노드
		
		arr = new int[n+1][n+1];
		check = new boolean[n+1];
		
		// 인접 행렬
		for(int i=0;i<m;i++){
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		
		dfs(v);
		System.out.println();
		
		check = new boolean[n+1];
		bfs(v);
	}
	
	public static void dfs(int v) { // 재귀 함수
		check[v] = true;
		System.out.print(v + " ");
		
		for(int i=0;i<=n;i++) {
			if(arr[v][i] == 1 && !check[i]) dfs(i);
		}
	}
	
	public static void bfs(int v) { // 큐
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(v);
		check[v] = true;
		
		while(!q.isEmpty()) {
			v = q.poll();
			System.out.print(v + " ");
			
			for(int i=1;i<=n;i++) {
				if(arr[v][i] == 1 && !check[i]) {
					q.add(i);
					check[i] = true;
				}
			}
		}
	}
}