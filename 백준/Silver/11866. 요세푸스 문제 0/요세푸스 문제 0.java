import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		Queue<Integer> q = new LinkedList<>();
		for(int i=1;i<=n;i++) {
			q.offer(i);
		}
		
		StringBuilder sb = new StringBuilder("<");
		while(true) {
			
			if(q.size() == 1) {
				sb.append(q.poll()).append(">"); break;
			}
			
			for(int i=0;i<k-1;i++) {
				q.offer(q.poll());
			}
			sb.append(q.poll()).append(", ");
		}
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
}