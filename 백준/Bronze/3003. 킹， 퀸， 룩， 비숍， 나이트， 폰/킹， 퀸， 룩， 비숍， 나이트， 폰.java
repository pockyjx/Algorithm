import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] chess = {1, 1, 2, 2, 2, 8};
		int[] piece = new int[6];
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<6;i++) {
			piece[i] = chess[i] - Integer.parseInt(st.nextToken());
			sb.append(piece[i]).append(" ");
		}
		
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
}