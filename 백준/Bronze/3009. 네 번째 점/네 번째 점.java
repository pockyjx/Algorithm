import java.io.*;
import java.util.StringTokenizer;
public class Main {
	
	static int newDot(int[] arr) {
		if(arr[0] == arr[1]) {
			return arr[2];
		} else if(arr[0] == arr[2]) {
			return arr[1];
		} else return arr[0];
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] x = new int[3];
		int[] y = new int[3];
		
		for(int i=0;i<3;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		bw.write(newDot(x) + " " + newDot(y));
		
		br.close();
		bw.close();
	}
}