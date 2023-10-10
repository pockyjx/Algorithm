import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int result = 0;
		int num = 666;
		
		while(n > 0) {
			if(String.valueOf(num).contains("666")) {
				result = num;
				n--;
			}
			num++;
		}
		bw.write(result + "");
		
		br.close();
		bw.close();
	}
}	