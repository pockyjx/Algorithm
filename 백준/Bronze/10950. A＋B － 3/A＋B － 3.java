import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		
		int a, b;
		
		for(int i=1;i<=T;i++) {
			a = s.nextInt();
			b = s.nextInt();
			
			System.out.println(a + b);
		}
		
		s.close();
	}
}