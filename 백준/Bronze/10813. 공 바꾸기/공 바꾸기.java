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
		
		for(int i=0;i<n;i++) 
			basket[i] = i + 1;
		
		for(int i=0;i<m;i++) {
			
			st = new StringTokenizer(br.readLine());
			int b1 = Integer.parseInt(st.nextToken()) - 1;
			int b2 = Integer.parseInt(st.nextToken()) - 1;
			
			int tmp = basket[b1];
			basket[b1] = basket[b2];
			basket[b2] = tmp;
			
		}
		
		for(int i=0;i<n;i++)
			bw.write(String.valueOf(basket[i]) + " ");
		
		br.close();
		bw.close();
	}
}