import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 개수
		int x = Integer.parseInt(st.nextToken()); // 기준 정수
		
		int[] num = new int[n]; // 수열
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<n;i++) {
			num[i] = Integer.parseInt(st.nextToken());
			
			if(num[i] < x) bw.write(String.valueOf(num[i]) + " ");
		}
		
		br.close();
		bw.close();
		
	}
}