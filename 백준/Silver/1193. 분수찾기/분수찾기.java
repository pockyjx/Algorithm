import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int nume = 1; // 분자
		int deno = 1; // 분모
		int num = 1;
		int x = Integer.parseInt(br.readLine());
		
		if(x > 1) {
			for(int i=0;i<x-1;i++) {
				if(num % 2 != 0) { // 홀수
					if(nume == 1) deno = ++num; // 옆
					else {
						nume--; deno++;
					}
				} else { // 짝수
					if(deno == 1) nume = ++num; // 아래
					else {
						nume++; deno--;
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(nume).append("/").append(deno);
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
}