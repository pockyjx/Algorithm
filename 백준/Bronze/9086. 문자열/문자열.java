import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String s = "";
		
		for(int i=1;i<=n;i++) {
			s = br.readLine();
			
			StringBuilder sb = new StringBuilder();
			sb.append(s.charAt(0));
			sb.append(s.charAt(s.length()-1));
			bw.write(sb + "\n");
		}
		
		br.close();
		bw.close();
	}
}