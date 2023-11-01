import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Deque<Integer> d = new ArrayDeque<>();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=1;i<=n;i++) {
			d.offer(i);
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(1).append(" "); // 1번 펑
		int m = arr[d.poll()]; // 풍선 안 숫자
		
		while(d.size() > 1) {
			if(m > 0) { // 오른쪽
				for(int i=0;i<m-1;i++) {
					d.offerLast(d.pollFirst());
				}
				
				sb.append(d.peekFirst()).append(" ");
				m = arr[d.pollFirst()];
				
			} else { // 왼쪽
				for(int i=0;i<(-1*m)-1;i++) {
					d.offerFirst(d.pollLast());
				}
				
				sb.append(d.peekLast()).append(" ");
				m = arr[d.pollLast()];
			}
		}
		sb.append(d.poll()); // 마지막 펑
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
}