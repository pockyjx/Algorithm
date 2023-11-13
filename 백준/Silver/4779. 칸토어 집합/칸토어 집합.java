import java.io.*;
import java.util.*;
public class Main {
	
	static char[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String input;
		while((input = br.readLine()) != null && !input.isEmpty()) {
			int n = Integer.parseInt(input);
			arr = new char[(int)Math.pow(3, n)];
			Arrays.fill(arr, '-');
			
			cantor(0, arr.length-1);
			for(int i=0;i<arr.length;i++) {
				sb.append(arr[i]);
			}
			sb.append("\n");
		}
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
	
	static void cantor(int start, int end) {
		if(start >= end) return;
		
		int mid = (end - start + 1) / 3;
		int p = start + mid;
		int q = end - mid;
		
		for(int i=p;i<=q;i++) {
			arr[i] = ' ';
		}
		
		cantor(start, p-1);
		cantor(q+1, end);
	}
}