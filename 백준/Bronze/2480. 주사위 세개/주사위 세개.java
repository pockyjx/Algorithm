import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		int prize = 0;
		
		if(a == b && b == c) {
			prize = 10000 + (a * 1000);
		} else if((a == b && b != c) || (a == c && b != c)) {
			prize = 1000 + (a * 100);
		} else if(a != b && b == c) {
			prize = 1000 + (b * 100);
		} else {
			 prize = Math.max(a, Math.max(b, c)) * 100;
		}
		
		System.out.println(prize);
		
		s.close();
	}

}