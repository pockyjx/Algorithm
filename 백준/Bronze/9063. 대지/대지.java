import java.io.*;
import java.util.StringTokenizer;
public class Main {
	
	static int max(int num, int max) { // 최댓값
		return (num > max) ? num : max;
	}
	
	static int min(int num, int min) { // 최솟값
		return (num < min) ? num : min;
	}
	
	static int ground(int max, int min) { // 넓이
		if((max < 0  && min > 0) || (max > 0 && min < 0)) 
			return Math.abs(max) + Math.abs(min);
		else return Math.abs(max - min);
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int Xmax = -10001; int Xmin = 10001;
		int Ymax = -10001; int Ymin = 10001;
		int x, y;
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			Xmax = max(x, Xmax); Xmin = min(x, Xmin);
			Ymax = max(y, Ymax); Ymin = min(y, Ymin);
		}
		
		x= ground(Xmax, Xmin);
		y= ground(Ymax, Ymin);
		bw.write((x * y) + "");
		
		br.close();
		bw.close();
	}
}