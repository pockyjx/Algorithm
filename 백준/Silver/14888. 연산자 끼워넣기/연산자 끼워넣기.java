import java.io.*;
import java.util.*;
public class Main {
	
	static int[] num;
	static int n;
	
	static int[] op = new int[4];
	static int min = Integer.MAX_VALUE;
	static int max = Integer.MIN_VALUE;
	static int result = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		num = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<4;i++) { // + - * /
			op[i] = Integer.parseInt(st.nextToken());
		}
		
		cal(num[0], 1);
		bw.write(max + "\n" + min);;
		
		br.close();
		bw.close();
	}
	
	static void cal(int val, int idx) {
		
		if(idx == n) {
			max = Math.max(val, max);
			min = Math.min(val, min);
			return;
		}
		
		for(int i=0;i<4;i++) {
			if(op[i] > 0) {
				
				op[i]--;
				
				switch(i) {
					case 0 : cal(val + num[idx], idx+1); break;
					case 1 : cal(val - num[idx], idx+1); break;
					case 2 : cal(val * num[idx], idx+1); break;
					case 3 : cal(val / num[idx], idx+1); break;
				}
				
				op[i]++;
			}
		}
	}
}