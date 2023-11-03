import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine()); // 시험장
		int[] a = new int[n]; // 응시자
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		int b = Integer.parseInt(st.nextToken()); // 총감독관
		int c = Integer.parseInt(st.nextToken()); // 부감독관
		
		long cnt = n;
		for(int i=0;i<n;i++) {
			a[i] -= b;
			if(a[i] > 0)
				cnt += a[i] / c + ((a[i] % c == 0)? 0 : 1);
		}
		bw.write(cnt + "");
		
		br.close();
		bw.close();
	}
}