import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int x = 1; 
		for(int i=n;i>n-k;i--) x *= i;
		
		int y = 1;
		for(int i=1;i<=k;i++) y *= i;
		
		bw.write(x/y + "");
		
		br.close();
		bw.close();
	}
}