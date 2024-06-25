import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		s = s.replaceAll("pi", " ");
		s = s.replaceAll("ka", " ");
		s = s.replaceAll("chu", " ");
		s = s.replaceAll(" ", "");

		System.out.println(s.length() == 0 ? "YES" : "NO");
	}
}