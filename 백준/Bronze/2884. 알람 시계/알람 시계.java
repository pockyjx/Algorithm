import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int h, m;
		
		do {
			h = s.nextInt();
			
			if(h < 0 || h > 23) {
				System.out.println("올바른 시간(시)을 입력하세요!");
				h = s.nextInt();
			}
			
		} while (h < 0 || h > 23);
		
		do {
			m = s. nextInt();
			

			if(m < 0 || m > 59) {
				System.out.println("올바른 시간(분)을 입력하세요!");
				m = s.nextInt();
			}
			
		} while (m < 0 || m > 59);
		
		if((m - 45) < 0) {
			if(h == 0) {
				System.out.println(23);
			} else {
				System.out.println(h-1);
			}
			System.out.println(m + 15);
		} else {
			System.out.println(h);
			System.out.println(m - 45);
		}
		
	}

}