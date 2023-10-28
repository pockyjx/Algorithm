import java.io.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;
			
			int cnt = 0;
			for(int i=n+1;i<=2*n;i++) {
				boolean isPrime = true;
				
				for(int j=2;j<=Math.sqrt(i);j++) {
					if(i % j == 0) {
						isPrime = false; break;
					}
				}
				if(isPrime) cnt++;
			}
			sb.append(cnt + "\n");
		}
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
}