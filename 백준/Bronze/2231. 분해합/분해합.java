import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		for(int i=1;i<n;i++) {
			int sum = 0;
			int num = i;
			
			while(num != 0) {
				sum += num % 10;
				num /= 10;
			}
			
			if(sum + i == n) {
				bw.write(i + ""); bw.close();
				return;
			}
		}
		bw.write("0");
		
		br.close();
		bw.close();
	}
}	