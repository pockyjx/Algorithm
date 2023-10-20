import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
	
		Set<String> set = new HashSet<>();
		for(int i=0;i<n;i++) {
			set.add(br.readLine());
		}
		
		int cnt = 0;
		for(int i=0;i<m;i++) {
			if(set.contains(br.readLine())) cnt++;
		}
		bw.write(cnt + "");
		
		br.close();
		bw.close();
	}
}