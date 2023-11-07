import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		bw.write(fibonacci(n) + "");
		
		br.close();
		bw.close();
	}
	
	static int fibonacci(int n) {
		if(n == 0) return 0;
		else if(n == 1) return 1;
		return fibonacci(n-1) + fibonacci(n-2);
	}
}