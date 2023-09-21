import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] num = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		num[0] = Integer.parseInt(st.nextToken());
		int max = num[0]; int min = num[0];
		
		for(int i=1;i<n;i++) {
			num[i] = Integer.parseInt(st.nextToken());
			
			if(num[i] > max) max = num[i];
			else if(num[i] < min) min = num[i];
		}
		
		bw.write(String.valueOf(min) + " " + String.valueOf(max));
		
		br.close();
		bw.close();
	}
}