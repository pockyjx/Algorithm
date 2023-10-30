import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>(); // 대기열
		Stack<Integer> stack = new Stack<>(); // 추가 대기열

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			queue.offer(Integer.parseInt(st.nextToken()));
		}
		
		int start = 1;
		while(!queue.isEmpty()) {
			if(queue.peek() == start) {
				queue.poll();
				start++;
			} else if(!stack.isEmpty() && stack.peek() == start) {
				stack.pop();
				start++;
			} else {
				stack.push(queue.poll());
			}
		}
		
		while(!stack.empty()) {
			if(stack.peek() == start) {
				stack.pop();
				start++;
			} else {
				bw.write("Sad");
				bw.close(); return;
			}
		}
		bw.write("Nice");

		br.close();
		bw.close();
	}
}