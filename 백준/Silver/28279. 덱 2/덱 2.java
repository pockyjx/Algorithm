import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		Deque<Integer> d = new LinkedList<>();
		
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String order = st.nextToken();
			
			int result = -2;
			switch(order) {
				case "1" : 
					d.offerFirst(Integer.parseInt(st.nextToken()));
					break;
					
				case "2" :
					d.offerLast(Integer.parseInt(st.nextToken()));
					break;
					
				case "3" : 
					if(d.isEmpty()) result = -1;
					else result = d.pollFirst();
					break;
				
				case "4" :
					if(d.isEmpty()) result = -1;
					else result = d.pollLast();
					break;
					
				case "5" : 
					result = d.size(); break;
					
				case "6" : 
					if(d.isEmpty()) result = 1;
					else result = 0;
					break;
					
				case "7" : 
					if(d.isEmpty()) result = -1;
					else result = d.peekFirst();
					break;
					
				case "8" : 
					if(d.isEmpty()) result = -1;
					else result = d.peekLast();
					break;
			}
			if(result != -2) sb.append(result).append("\n");
		}
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
}