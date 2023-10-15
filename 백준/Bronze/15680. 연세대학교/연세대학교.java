import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		if(n == 0) {
			sb.append("YONSEI");
		} else {
			sb.append("Leading the Way to the Future");
		}
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
}	