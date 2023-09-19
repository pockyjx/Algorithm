import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		n /= 4;
		
		String result = "";
		
		for(int i=1;i<=n;i++) {
			result += "long ";
		}
		
		System.out.println(result + "int");
			
		s.close();
	}
}