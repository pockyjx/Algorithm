import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>0;j--) {
				sb.append('*');
			}
			sb.append("\n");
		}
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
}