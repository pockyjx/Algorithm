import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] sort = arr.clone();
		Arrays.sort(sort);
		
		Map<Integer, Integer> map = new HashMap<>();
		int idx = 0;
		for(int num : sort) {
			if(!map.containsKey(num)) map.put(num, idx++);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int num : arr)
			sb.append(map.get(num)).append(" ");
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
}