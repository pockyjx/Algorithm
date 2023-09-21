import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean[] student = new boolean[30];
		
		for(int i=0;i<28;i++) { // 과제를 제출한 28명
			int n = Integer.parseInt(br.readLine());
			student[n-1] = true;
		}
		
		for(int i=0;i<30;i++) {
			if(!(student[i])) bw.write(String.valueOf(i+1) + "\n"); 
		}
		
		br.close();
		bw.close();
	}
}