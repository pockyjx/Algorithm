import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String[] check = br.readLine().split(" "); 
		Deque<Integer> d = new LinkedList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine()); // 수열 a
		for(int i=0;i<n;i++) {
			int num = Integer.parseInt(st.nextToken());
			if(check[i].equals("0")) d.offer(num); // 큐만 저장
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine()); // 수열 b
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<m;i++) {
			d.offerFirst(Integer.parseInt(st.nextToken()));
			sb.append(d.pollLast() + " ");
		}
		bw.write(sb + "");
 		
		br.close();
		bw.close();
	}
}