import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		int[] arr = new int[str.length()];
		for(int i=0;i<arr.length;i++) {
			arr[i] = str.charAt(i) - '0';
		}
		
		Arrays.sort(arr);
		for(int i=arr.length-1;i>=0;i--) {
			sb.append(arr[i] + "");
		}
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
}	