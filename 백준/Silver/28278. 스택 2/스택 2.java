import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		Stack<Integer> stack = new Stack<>();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String order = st.nextToken();
			
			int result = -2;
			switch(order) {
				case "1" : 
					int x = Integer.parseInt(st.nextToken());
					stack.push(x); break;
					
				case "2" : 
					if(!stack.empty()) result = stack.pop();
					else result = -1;
					break;
					
				case "3" : 
					result = stack.size(); break;
					
				case "4" :
					if(stack.empty()) result = 1;
					else result = 0;
					break;
					
				case "5" : 
					if(!stack.empty()) result = stack.peek();
					else result = -1;
					break;
			}
			if(result != -2) sb.append(result + "\n");
		}
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
}