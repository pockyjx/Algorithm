import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean[][] arr = new boolean[100][100]; // 흰 도화지
		int cnt = 0; // 넓이
		int n = Integer.parseInt(br.readLine()); // 색종이 개수
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for(int j=y;j<y+10;j++) {
				for(int k=x;k<x+10;k++) {
					if(!arr[j][k]) {
						arr[j][k] = true;
						cnt++;
					}
				}
			}
		}
		bw.write(cnt + "");
		
		br.close();
		bw.close();
	}
}