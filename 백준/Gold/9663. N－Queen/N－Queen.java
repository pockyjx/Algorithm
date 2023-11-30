import java.io.*;
import java.util.*;
public class Main {
	
	static int n;
	static int[] chess; // 행
	static int cnt = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		chess = new int[n];
		
		nQueen(0);
		bw.write(cnt + "");
		
		br.close();
		bw.close();
	}
	
	static boolean isPossible(int row) {
		
		for(int i=0;i<row;i++) { 
			
			// 같은 열에 존재할 경우
			if(chess[row] == chess[i]) return false;
			
			// 대각선 상 놓여있는 경우
			else if(Math.abs(row-i) == Math.abs(chess[row] - chess[i]))
				return false;
		}
		
		return true;
	}
	
	static void nQueen(int depth) { // 행
		
		if(depth == n) {
			cnt++; 
			return;
		}
		
		for(int i=0;i<n;i++) { // 열
			chess[depth] = i;
			
			if(isPossible(depth)) {
				nQueen(depth+1);
			}
		}
	}
}