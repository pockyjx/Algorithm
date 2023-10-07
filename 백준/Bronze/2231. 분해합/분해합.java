import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		for(int i=1;i<n;i++) {
			String s = String.valueOf(i);
			int[] arr = new int[s.length()];
			int sum = 0;
			
			for(int j=0;j<arr.length;j++) {
				arr[j] = s.charAt(j) - '0';
				sum += arr[j];
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