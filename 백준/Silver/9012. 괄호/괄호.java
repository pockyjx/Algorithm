import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<t;i++) {
			String str = br.readLine();
			
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j) == '(') stack.push('(');
				else if(!stack.empty()) stack.pop();
				else {
					stack.push(')'); break;
				}
			}

			if(stack.empty()) sb.append("YES\n");
			else sb.append("NO\n");
			
			stack.clear();
		}
		bw.write(sb + "");

		br.close();
		bw.close();
	}
}