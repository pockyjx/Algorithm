import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] num = new int[n+1];
		st = new StringTokenizer(br.readLine());

		num[0] = 0;
		for(int i=1;i<=n;i++) {
			num[i] = num[i-1] + Integer.parseInt(st.nextToken());
		}

		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());

			bw.write((num[end] - num[start-1]) + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}