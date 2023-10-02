import java.io.*;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int minX = (Math.abs(x-0) > Math.abs(x-w)) ? Math.abs(x-w) : Math.abs(x-0);
		int minY = (Math.abs(y-0) > Math.abs(y-h)) ? Math.abs(y-h) : Math.abs(y-0);
		bw.write(((minX > minY) ? minY : minX) + "");
		
		br.close();
		bw.close();
	}
}