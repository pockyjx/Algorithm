import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringBuilder sb2 = new StringBuilder(br.readLine());
			if(sb2.toString().equals("0")) break;
			
			if(sb2.toString().equals(sb2.reverse().toString())) sb.append("yes").append("\n");
			else sb.append("no").append("\n");
		}
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
}