import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		List<Integer> list = new LinkedList<>();
		for(int i=1;i<=n;i++) {
			list.add(i);
		}
		
		StringBuilder sb = new StringBuilder("<");
		int idx = 0;
		while(list.size() > 1) {
			idx = (idx + (k-1)) % list.size();
			sb.append(list.remove(idx)).append(", ");
		}
		sb.append(list.remove(0)).append(">");
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
}