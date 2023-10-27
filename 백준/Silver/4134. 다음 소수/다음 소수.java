import java.io.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++) {
			long num = Long.parseLong(br.readLine());
			if(num <= 2) {
				sb.append(2).append("\n"); continue;
			}
			
			boolean isPrime = false;
			while(!isPrime) {
				isPrime = true;
				for(long j=2;j<=Math.sqrt(num);j++) {
					if(num % j == 0) {
						isPrime = false; break;
					}
				}
				if(!isPrime) num++;
				else sb.append(num).append("\n");
			}
		}
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
}