import java.io.*;
import java.math.BigInteger;
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++) {
			BigInteger num = new BigInteger(br.readLine());
			
			if(num.isProbablePrime(10)) sb.append(num + "\n");
			else sb.append(num.nextProbablePrime() + "\n");
		}
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
}