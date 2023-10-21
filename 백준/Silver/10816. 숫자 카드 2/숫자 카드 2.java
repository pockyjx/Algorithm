import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		Map<Integer, Integer> map = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			int key = Integer.parseInt(st.nextToken());
			if(map.containsKey(key)) map.put(key, map.get(key)+1);
			else map.put(key, 1);
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<m;i++) {
			int key = Integer.parseInt(st.nextToken());
			if(map.containsKey(key)) sb.append(map.get(key) + " ");
			else sb.append(0 + " ");
		}
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
}