import java.io.*;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int day = Integer.parseInt(st.nextToken());
		int night = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		int cnt = (v - night) / (day - night); 
		if((v - night) % (day - night) == 0) bw.write(cnt + "");
		else bw.write(cnt+1 + "");
		
		br.close();
		bw.close();
	}
}