import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 바구니 개수
		int m = Integer.parseInt(st.nextToken()); // 방법 개수
		
		int basket[] = new int[n];
		
		for(int i=0;i<n;i++) {
			basket[i] = i + 1;
		}
		
		for(int i=1;i<=m;i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken()) - 1;
			int end = Integer.parseInt(st.nextToken()) - 1;
			
			for(int j=start;j<=((start+end)/2);j++) {
				int tmp = basket[j];
				basket[j] = basket[start+end-j];
				basket[start+end-j] = tmp;
			}
		}
	
		for(int i=0;i<n;i++) {
			bw.write(String.valueOf(basket[i]) + " ");
		}
		
		br.close();
		bw.close();
	}
}