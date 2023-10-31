import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		Queue<Integer> q = new LinkedList<>();
		
		int n = Integer.parseInt(br.readLine());
		int num = 0;
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String order = st.nextToken();
			
			int result = -2;
			switch(order) {
				case "push" : 
					num = Integer.parseInt(st.nextToken());
					q.offer(num);
					break;
				
				case "pop" :
					if(q.isEmpty()) result = -1;
					else result = q.poll();
					break;
				
				case "size" : 
					result = q.size(); break;
				
				case "empty" : 
					if(q.isEmpty()) result = 1;
					else result = 0;
					break;
				
				case "front" :
					if(q.isEmpty()) result = -1;
					else result = q.peek();
					break;
				
				case "back" : 
					if(q.isEmpty()) result = -1;
					else result = num;
			}
			if(result != -2) sb.append(result).append("\n");
		}
		bw.write(sb + "");

		br.close();
		bw.close();
	}
}