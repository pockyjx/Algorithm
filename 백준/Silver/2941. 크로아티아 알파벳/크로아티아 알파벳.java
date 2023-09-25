import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] alpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String word = br.readLine();
		int cnt = 0;
		
		for(int i=0;i<alpha.length;i++) {
			if(word.contains(alpha[i])) 
				word = word.replaceAll(alpha[i], "A");
		}
		
		bw.write(word.length() + "");
		
		br.close();
		bw.close();
	}
}