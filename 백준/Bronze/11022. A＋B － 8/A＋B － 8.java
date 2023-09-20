import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br 
			= new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw 
		= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=t;i++) {
			String[] input = br.readLine().split(" ");
			
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			
			bw.write("Case #" + String.valueOf(i) +": ");
			bw.write(input[0] + " + " + input[1] + " = " + String.valueOf(a+b));
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}