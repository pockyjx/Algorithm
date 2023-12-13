import java.io.*;
public class Main {
	
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		
		bw.write(fibo(n) + "");
		
		br.close();
		bw.close();
	}
	
	static int fibo(int n) {
		
		if(n == 1) return 1;
		
		arr[0] = 1; arr[1] = 2;
		
		for(int i=2;i<n;i++) {
			arr[i] = (arr[i-1] + arr[i-2]) % 15746;
		}
		return arr[n-1];
	}
}