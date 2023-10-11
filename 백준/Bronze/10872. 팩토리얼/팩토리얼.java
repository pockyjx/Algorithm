import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int result = 1;
		
		if(n == 0) {
			bw.write(result + ""); bw.close();
			return;
		}
		
		for(int i=2;i<=n;i++)
			result *= i;
		bw.write(result + "");

		br.close();
		bw.close();
	}
}	