import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		Stack<Character> stack = new Stack<>();
		
		while(true) {
		String str = br.readLine();
		if(str.equals(".")) break;
			
			for(int j=0;j<str.length();j++) {
				char ch = str.charAt(j);
				if(ch == '(' || ch == '[') stack.push(ch);
				else if(ch == ')') {
					if(stack.empty() || stack.peek() != '(') {
						stack.push(ch); break;
					} else stack.pop();
				} else if(ch == ']') {
					if(stack.empty() || stack.peek() != '[') {
						stack.push(ch); break;
					} else stack.pop();
				}
			}

			if(stack.empty()) sb.append("yes\n");
			else sb.append("no\n");
			
			stack.clear();
		}
		bw.write(sb + "");

		br.close();
		bw.close();
	}
}