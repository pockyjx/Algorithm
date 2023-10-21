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
		
		List<String> list = new ArrayList<>();
		for(int i=0;i<m;i++) {
			String name = br.readLine();
			if(set.contains(name)) list.add(name);
		}
		Collections.sort(list);
		
		StringBuilder sb = new StringBuilder();
		sb.append(list.size()).append("\n");
		for(String name : list) {
			sb.append(name).append("\n");
		}
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
}