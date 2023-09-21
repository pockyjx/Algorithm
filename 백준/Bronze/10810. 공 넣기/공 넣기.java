import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 바구니 개수
		int m = Integer.parseInt(st.nextToken()); // 공 넣는 횟수
		
		int[] basket = new int[n];
		
		for(int i=0;i<m;i++) { // 공 넣는 방법
			
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int ball = Integer.parseInt(st.nextToken());
			
			for(int j=(start-1);j<end;j++) { // 공 넣기
				basket[j] = ball;
			}
		}
		
		for(int i=0;i<n;i++) {
			bw.write(String.valueOf(basket[i]) + " ");
		}
		
		br.close();
		bw.close();
		
	}
}
