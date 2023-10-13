import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);
		
		for(int i=0;i<n;i++) {
			sb.append(list.get(i)).append("\n");
		}
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
}	