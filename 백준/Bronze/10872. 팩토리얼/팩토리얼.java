import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		bw.write(combination(n) + "");
		
		br.close();
		bw.close();
	}
	
	static int combination(int n) {
		if(n <= 1) return 1;
		return n * combination(n-1);
	}
}