import java.io.*;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String n = st.nextToken(); int len = n.length();
		int b = Integer.parseInt(st.nextToken());
		long result = 0;
		
		for(int i=0;i<len;i++) {
			int tmp = n.charAt(i);
			if(tmp >= 48 && tmp <= 57) { // 숫자
				tmp -= 48;
				result += tmp * Math.pow(b, len-1-i);
			} else { // 영어
				tmp -= 55;
				result += tmp * Math.pow(b, len-1-i);
			}
		}
		bw.write(result + "");
		
		br.close();
		bw.close();
	}
}