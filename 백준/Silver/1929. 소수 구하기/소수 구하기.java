import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		boolean isPrime = false;
		for(int i=a;i<=b;i++) {
			if(i == 1) continue;
			isPrime = true;
			
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i % j == 0) {
					isPrime = false; break;
				}
			}
			if(isPrime) sb.append(i).append("\n");
		}
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
}