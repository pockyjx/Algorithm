import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int k = Integer.parseInt(br.readLine());
		int[] arr = new int[k];
		
		int idx = 0;
		for(int i=0;i<k;i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num == 0) arr[--idx] = 0;
			else arr[idx++] = num;
		}

		int sum = 0;
		for(int i=0;i<idx;i++) {
			sum += arr[i];
		}
		bw.write(sum + "");
		
		br.close();
		bw.close();
	}
}