import java.io.*;
public class Main {
	
	static int[] arr;
	static int cnt1 = 0, cnt2 = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		
		fib(n); fibonacci(n);
		bw.write(cnt1 + " " + cnt2);
		
		br.close();
		bw.close();
	}
	
	static int fib(int n) { // 재귀
		
		if(n == 1 || n == 2) {
			cnt1++; return 1; 
		}
		else return fib(n-1) + fib(n-2);
	}
	
	static int fibonacci(int n) { // 동적 프로그래밍
		arr[0] = arr[1] = 1;
		
		for(int i=2;i<n;i++) {
			cnt2++;
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		return arr[n-1];
	}
}