import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		Set<String> set = new TreeSet<>(Collections.reverseOrder());
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String log = st.nextToken();
			
			if(log.equals("enter")) set.add(name);
			else set.remove(name);
		}
		
		StringBuilder sb = new StringBuilder();
		for(String name : set) {
			sb.append(name + "\n");
		}
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
}