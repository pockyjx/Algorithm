import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		if((a+b+c) != 180) sb.append("Error");
		else if(a == b && b == c && a == c) sb.append("Equilateral");
		else if(a == b || b == c || a == c) sb.append("Isosceles");
		else sb.append("Scalene");
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
}