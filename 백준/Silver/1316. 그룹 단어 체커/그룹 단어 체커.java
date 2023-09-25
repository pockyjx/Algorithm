import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;		
		
		for(int i=0;i<n;i++) {
			String word = br.readLine();
			
			boolean[] check = new boolean[26]; // 알파벳 포함 여부
			boolean group = true; // 그룹 단어인지 판별
			
			for(int j=0;j<word.length();j++) {
				int idx = word.charAt(j) - 'a';
				if(check[idx]) {
					if(word.charAt(j) != word.charAt(j-1)) {
						group = false;
						break;
					}
				} else {
					check[idx] = true;
				}
			}
			if(group) cnt++;
		}
		
		bw.write(cnt + "");
		
		br.close();
		bw.close();
	}
}