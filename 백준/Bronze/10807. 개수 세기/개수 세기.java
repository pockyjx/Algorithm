import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] input = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<input.length;i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}
		
		int v = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for(int i=0;i<input.length;i++) {
			if(input[i] == v) cnt++;
		}
		
		bw.write(String.valueOf(cnt));
		
		br.close();
		bw.close();
		
	}
}