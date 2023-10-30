import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Stack<Integer> stack = new Stack<>();
		int k = Integer.parseInt(br.readLine());
		for(int i=0;i<k;i++) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) stack.pop();
			else stack.push(n);
		}
		
		int sum = 0; int size = stack.size();
		for(int i=0;i<size;i++) {
			sum += stack.pop();
		}
		bw.write(sum + "");
		
		br.close();
		bw.close();
	}
}