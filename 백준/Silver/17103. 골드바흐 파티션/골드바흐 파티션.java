import java.io.*;
public class Main {
	
	static boolean[] prime = new boolean[10000001];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		getPrime();
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0;i<t;i++) {
			int n = Integer.parseInt(br.readLine());
			int cnt = 0;
			
			for(int j=2;j<=n/2;j++) {
				if(!prime[j] && !prime[n-j]) cnt++;
			}
			sb.append(cnt).append("\n");
		}
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
	
	static void getPrime() {
		prime[0] = prime[1] = true;
		
		for(int i=2;i<=Math.sqrt(prime.length);i++) {
			if(prime[i]) continue;
			for(int j=i*i;j<prime.length;j+=i) {
				prime[j] = true;
			}
		}
	}
}