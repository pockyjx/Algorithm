import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Deque<Balloon> d = new ArrayDeque<>();
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=1;i<=n;i++) {
			d.offer(new Balloon(i, Integer.parseInt(st.nextToken())));
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(1).append(" "); // 1번 펑
		int m = d.poll().num; // 풍선 안 숫자
		
		while(d.size() > 1) {
			if(m > 0) { // 오른쪽
				for(int i=0;i<m-1;i++) {
					d.offerLast(d.pollFirst());
				}
				
				sb.append(d.peekFirst().idx).append(" ");
				m = d.pollFirst().num;
				
			} else { // 왼쪽
				for(int i=0;i<(-1*m)-1;i++) {
					d.offerFirst(d.pollLast());
				}
				
				sb.append(d.peekLast().idx).append(" ");
				m = d.pollLast().num;
			}
		}
		sb.append(d.poll().idx); // 마지막 펑
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
}

class Balloon {
	int idx;
	int num;
	
	public Balloon(int idx, int num) {
		super();
		this.idx = idx;
		this.num = num;
	}
}