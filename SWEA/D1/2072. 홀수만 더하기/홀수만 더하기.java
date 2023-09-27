import java.io.*;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=t;i++) {
			int sum = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j=0;j<10;j++) {
				int num = Integer.parseInt(st.nextToken());
				if(num % 2 != 0) {
					sum += num;
				}
			}
			StringBuilder sb = new StringBuilder();
			sb.append("#").append(i);
			sb.append(" ").append(sum);
			
			bw.write(sb + "\n");
		}
		
		br.close();
		bw.close();
		
	}
}