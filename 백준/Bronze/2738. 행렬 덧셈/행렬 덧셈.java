import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 열
		int m = Integer.parseInt(st.nextToken()); // 행
		
		int[][] A = new int[n][m];
		int[][] B = new int[n][m];
		
		for(int i=0;i<n;i++) { // 행렬 A
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<m;j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0;i<n;i++) { // 행렬 B
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<m;j++) {
				B[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0;i<n;i++) { // 행렬 A + 행렬 B
			StringBuilder sb = new StringBuilder();
			for(int j=0;j<m;j++) {
				sb.append(A[i][j] + B[i][j]);
				sb.append(" ");
			}
			bw.write(sb + "\n");
		}
        
		br.close();
		bw.close();
	}
}