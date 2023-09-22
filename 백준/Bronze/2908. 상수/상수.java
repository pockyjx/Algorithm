import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb1 = new StringBuilder(st.nextToken()).reverse();
        StringBuilder sb2 = new StringBuilder(st.nextToken()).reverse();
        
        int n1 = Integer.parseInt(sb1.toString());
        int n2 = Integer.parseInt(sb2.toString());
        
        if(n1 > n2) bw.write(n1 + "");
        else bw.write(n2 + "");
        
		br.close();
		bw.close();
	}
}