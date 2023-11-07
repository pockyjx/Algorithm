import java.io.*;
public class Main {
	
	static int cnt; // recursion 실행 횟수
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++) {
			cnt = 0;
			String s = br.readLine();
			int result = isPalindrome(s);
			sb.append(result + " ").append(cnt + "\n");
		}
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
	
	static int recursion(String s, int x, int y) {
		cnt++;
		if(x >= y) return 1;
		else if(s.charAt(x) != s.charAt(y)) return 0;
		return recursion(s, x+1, y-1);
	}
	
	static int isPalindrome(String s) {
		return recursion(s, 0, s.length()-1);
	}
}