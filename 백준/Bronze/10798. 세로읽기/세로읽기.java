import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[][] word = new char[5][15];
		int max = 0; // 가장 긴 단어의 길이
		
		for(int i=0;i<5;i++) {
			String s = br.readLine();
			if(s.length() > max) max = s.length();
			for(int j=0;j<s.length();j++) {
				word[i][j] = s.charAt(j);
			}
		}
		
		for(int i=0;i<max;i++) {
			for(int j=0;j<5;j++) {
				if(word[j][i] == '\0') continue;
				bw.write(word[j][i] + "");
			}
		}
		
		br.close();
		bw.close();
	}
}