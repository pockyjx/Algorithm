import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] line = new int[3];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		line[0] = Integer.parseInt(st.nextToken());
		line[1] = Integer.parseInt(st.nextToken());
		line[2] = Integer.parseInt(st.nextToken());
		Arrays.sort(line);
		
		if(line[0] + line[1] <= line[2]) line[2] = line[0] + line[1] - 1;
		bw.write((line[0] + line[1] + line[2]) + "");
		
		br.close();
		bw.close();
	}
}