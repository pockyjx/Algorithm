import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] result = new int[10]; // 나머지 저장
		int cnt = 0; 
		
		for(int i=0;i<10;i++) {
			int num = Integer.parseInt(br.readLine());
			result[i] = num % 42;
			
			int same = 0; // 같은 값 판단
			
			for(int j=0;j<i;j++) {
				if(result[j] == result[i]) same++; 
			}
			if(same == 0) cnt++;
		}
		
		bw.write(String.valueOf(cnt));
		
		br.close();
		bw.close();
	}
}