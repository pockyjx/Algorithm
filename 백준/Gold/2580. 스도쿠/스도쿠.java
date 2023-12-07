import java.io.*;
import java.util.*;
public class Main {
	
	static int[][] arr;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		arr = new int[9][9];
		StringTokenizer st;
		
		for(int i=0;i<9;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<9;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		sudoku(0, 0);
		
		br.close();
		bw.close();
	}
	
	static boolean isPossible(int col, int row, int num) {
		
		for(int i=0;i<9;i++) {
			if(arr[col][i] == num) return false; // 같은 행
		}
		
		for(int i=0;i<9;i++) {
			if(arr[i][row] == num) return false; // 같은 열
		}
		
		int sc = (col / 3) * 3;
		int sr = (row / 3) * 3;
		
		for(int i=sc;i<sc+3;i++) {
			for(int j=sr;j<sr+3;j++) {
				if(arr[i][j] == num) return false; // 3 x 3
			}
		}
		
		return true;
	}
	
	static void sudoku(int col, int row) {
		
		if(row == 9) {
			sudoku(col+1, 0); return;
		}
		
		if(col == 9) { // 출력
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					sb.append(arr[i][j] + " ");
				}
				sb.append("\n");
			} 
			
			System.out.println(sb);
			System.exit(0);
		}
		
		if(arr[col][row] == 0) {
			for(int j=1;j<=9;j++) {
				if(isPossible(col, row, j)) {
					arr[col][row] = j;
					sudoku(col, row+1);
				}
			}
			
			arr[col][row] = 0;
			return;
		}
		
		sudoku(col, row+1);
	}
}