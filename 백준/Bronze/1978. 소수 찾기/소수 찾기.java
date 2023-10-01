import java.io.*;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		int cnt = 0;

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=1;i<=t;i++) {
			int num = Integer.parseInt(st.nextToken());
			for(int j=2;j<=num;j++) {
				if(j == num) cnt++; 
				else if(num % j == 0) break;
			}
		}
		bw.write(cnt + "");
		
		br.close();
		bw.close();
	}
}