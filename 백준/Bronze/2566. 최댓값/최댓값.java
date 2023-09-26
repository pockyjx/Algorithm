import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[][] A = new int[9][9];
		int max = 0;
		int maxRow = 0; int maxCol = 0;
		
		for(int i=0;i<9;i++) { // 행렬 A
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<9;j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
				if(A[i][j] >= max) {
					max = A[i][j];
					maxRow = i+1; maxCol = j+1;
				}
			}
		}
		
		bw.write(max + "\n");
		bw.write(maxRow + " " + maxCol);
		
		br.close();
		bw.close();
	}
}