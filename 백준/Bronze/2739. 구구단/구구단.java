import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d\n", n, i, (n * i));
		}
		
		s.close();
	}
}