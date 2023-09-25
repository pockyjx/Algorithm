import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt[] = new int[26];
		String word = br.readLine().toUpperCase();
		for(int i=0;i<word.length();i++) {
			cnt[word.charAt(i) - 'A']++;
		}

		int max = 0;
		char result = '?';
		
		for(int i=0;i<26;i++) {
			if(cnt[i] > max) {
				max = cnt[i];
				result = (char)(i + 'A');
			} else if(cnt[i] == max) {
				result = '?';
			}
		}
		
		bw.write(result);
		
		br.close();
		bw.close();
	}
}