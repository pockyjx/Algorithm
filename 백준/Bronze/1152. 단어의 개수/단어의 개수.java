import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] word = br.readLine().split(" ");
		int cnt = 0;
		
		for(int i=0;i<word.length;i++) {
			if(!(word[i].equals(""))) cnt++; 
		}
		
		bw.write(cnt + "");

		br.close();
		bw.close();
	}
}