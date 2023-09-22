import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		for(int i='a';i<='z';i++) 
			bw.write(str.indexOf(i) + " ");

		br.close();
		bw.close();
	}
}