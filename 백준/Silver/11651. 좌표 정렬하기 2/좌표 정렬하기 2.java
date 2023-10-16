import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, (arr1, arr2) -> {
			if(arr1[1] == arr2[1]) {
				return arr1[0] - arr2[0];
			} else {
				return arr1[1] - arr2[1];
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++) {
			sb.append(arr[i][0] + " " + arr[i][1]).append("\n");
		}
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
}	