import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		int y = s. nextInt();
		
		System.out.println(x * (y%10));
		System.out.println(x * (y%100 / 10));
		System.out.println(x * (y / 100));
		System.out.println(x * y);
		
	}

}