import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int min = Integer.MAX_VALUE;
		
		for(int i=n/5;i>=0;i--) {
			int num = n; int cnt = 0;
			
			for(int j=i;j>0;j--) {
				num -= 5;
				cnt++;
			}
			
			cnt += num/3;
			
			if(num % 3 == 0) 
				min = cnt < min ? cnt : min;
		}
		
		if(min == Integer.MAX_VALUE) bw.write("-1");
		else bw.write(min + "");

		br.close();
		bw.close();
	}
}	