import java.io.*;
public class Main {
	
	static int n;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String input;
		while((input = br.readLine()) != null && !input.isEmpty()) {
			n = Integer.parseInt(input);
			int pow = (int)Math.pow(3, n);
			
			boolean[] arr = new boolean[pow];
			cantor(arr, 0, pow-1, pow/3);
			
			for(int i=0;i<pow;i++) {
				if(!arr[i]) sb.append('-');
				else sb.append(' ');
			}
			sb.append("\n");
		}
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
	
	static void cantor(boolean[] arr, int start, int end, int mid) {
		if(mid < 1) return;
		
		int p = start + mid;
		int q = end - mid;
		
		for(int i=p;i<=q;i++) {
			arr[i] = true;
		}
		mid = (end - start + 1) / 3; 
		
		cantor(arr, start, p-1, mid); // 왼쪽
		cantor(arr, q+1, end, mid); // 오른쪽
	}
}