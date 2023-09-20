import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br 
			= new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw 
		= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=t;i++) {
			
			for(int j=1;j<=(t-i);j++) { // 공백
				bw.write(" ");
			}
			
			for(int j=1;j<=i;j++) { // 별
				bw.write("*");
			}
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}