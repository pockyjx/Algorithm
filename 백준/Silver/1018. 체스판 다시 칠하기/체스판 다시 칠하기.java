import java.io.*;
import java.util.StringTokenizer;
public class Main {
	
	static boolean[][] chess;
	static int min = 64;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		chess = new boolean[n][m];
		
		for(int i=0;i<n;i++) { // 보드를 행 단위로 저장
			String str = br.readLine();
			for(int j=0;j<m;j++) {
				if(str.charAt(j) == 'W') chess[i][j] = true; // 흰 : true
				else chess[i][j] = false; // 검 : flase
			}
		}
		
		for(int i=0;i<n-7;i++) {
			for(int j=0;j<m-7;j++) {
				find(i, j);
			}
		}
		bw.write(min + "");
		
		br.close();
		bw.close();
	}

	public static void find(int x, int y) {
		int cnt = 0;
		boolean first = chess[x][y]; // 시작 색깔
		
		for(int i=x;i<x+8;i++) {
			for(int j=y;j<y+8;j++) {
				if(chess[i][j] != first) cnt++;
				first = !first;
			}	
			first = !first;
		}
		cnt = Math.min(cnt, 64-cnt);
		min = Math.min(min, cnt);
	}
}	