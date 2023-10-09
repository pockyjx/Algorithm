import java.io.*;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<5;i++) {
			int n = Integer.parseInt(st.nextToken());
			sum += n * n;
		}
		bw.write((sum % 10) + "");
		
		br.close();
		bw.close();
	}
}