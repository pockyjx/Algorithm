import java.io.*;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); 
		int b = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		while(n > 0) {
			int tmp = (int)(n % b);
			if(tmp < 10) sb.append(tmp);
			else sb.append((char)(tmp + 55));
			n /= b;
		}
		bw.write(sb.reverse() + "");
		
		br.close();
		bw.close();
	}
}