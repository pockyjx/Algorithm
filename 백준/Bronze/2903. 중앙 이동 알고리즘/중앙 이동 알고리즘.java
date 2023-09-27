import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int dot = 4;
		
		for(int i=0;i<n;i++) {
			int tmp = (int)Math.sqrt(dot) * 2 - 1;
			dot = (int)Math.pow(tmp, 2);
		}
		bw.write(dot + "");
			
		br.close();
		bw.close();
	}
}