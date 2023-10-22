import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Set<Integer> a = new HashSet<>();
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			a.add(Integer.parseInt(st.nextToken()));
		}
		
		Set<Integer> b = new HashSet<>();
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<m;i++) {
			b.add(Integer.parseInt(st.nextToken()));
		}
		
		int cnt = 0;
		for(int i : a) { // a - b
			if(!b.contains(i)) cnt++;
		}
		for(int i : b) { // b - a
			if(!a.contains(i)) cnt++;
		}
		bw.write(cnt + "");
		
		br.close();
		bw.close();
	}
}