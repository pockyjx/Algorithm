import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] coin = {25, 10, 5, 1};
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0;i<t;i++) {
			int c = Integer.parseInt(br.readLine());
			int[] cnt = new int[4];
			
			for(int j=0;j<4;j++) {
				if(c >= coin[j]) {
					cnt[j] = c / coin[j];
					c -= cnt[j] * coin[j];
				}
				bw.write(cnt[j] + " ");
			}
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}