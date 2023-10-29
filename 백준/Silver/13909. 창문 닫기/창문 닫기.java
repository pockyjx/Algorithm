import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int i=1;i<=Math.sqrt(n);i++) {
			cnt++;
		}
		bw.write(cnt + "");
		
		br.close();
		bw.close();
	}
}