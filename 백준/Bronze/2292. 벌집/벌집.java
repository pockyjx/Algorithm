import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int end = Integer.parseInt(br.readLine());
		int cnt = 1;
		int max = 1;
		
		while(true) {
			if(end <= max) break;
			
			max += 6 * cnt;
			cnt++;
		}
		bw.write(cnt + "");
			
		br.close();
		bw.close();
	}
}