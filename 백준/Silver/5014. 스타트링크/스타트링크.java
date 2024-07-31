import java.util.*;
import java.io.*;

public class Main {

	static int[] isVisit;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int f = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		int g = Integer.parseInt(st.nextToken());
		int u = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());

		isVisit = new int[f+1];
		System.out.println(bfs(f, s, g, u, d));
	}

	static String bfs(int f, int s, int g, int u, int d) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(s);
		isVisit[s] = 1; // 시작점 방문

		while(!q.isEmpty()) {
			int n = q.poll();
			
			if(n == g) { // 도착
				return String.valueOf(isVisit[n] - 1);
			}

			if(n+u <= f && isVisit[n+u] == 0) { // 올라감 : 최고층 높이보다 작거나 같아야 함
				q.offer(n+u);
				isVisit[n+u] = isVisit[n] + 1;
			}

			if(n-d > 0 && isVisit[n-d] == 0) { // 내려감 : 0보다 커야 함
				q.offer(n-d);
				isVisit[n-d] = isVisit[n] + 1;
			}
		}

		return "use the stairs"; // 못가는 경우
	}
}