import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br 
			= new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw 
		= new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			
			String[] input = br.readLine().split(" ");

			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			
			if(a == 0 && b == 0) break;
			
			bw.write(String.valueOf(a+b));
			bw.newLine();
		}
		
		bw.close();
		br.close();
	}
}