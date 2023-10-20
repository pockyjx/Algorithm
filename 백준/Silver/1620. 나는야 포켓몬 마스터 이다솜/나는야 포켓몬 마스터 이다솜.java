import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Map<Integer, String> dogam1 = new HashMap<>();
		Map<String, Integer> dogam2 = new HashMap<>();
		for(int i=1;i<=n;i++) {
			String str = br.readLine();
			dogam1.put(i, str);
			dogam2.put(str, i);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<m;i++) {
			String input = br.readLine();

			if(Character.isDigit(input.charAt(0))) {
				sb.append(dogam1.get(Integer.parseInt(input)) + "\n");
			} else {
				sb.append(dogam2.get(input) + "\n");
			}
		}
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
}