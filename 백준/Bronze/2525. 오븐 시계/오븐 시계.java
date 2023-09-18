import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int h, m, t;
		
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
		
		t = s.nextInt();
		
		h = h + ((m+t)/60);
		m = (m + t) % 60;
		
		if(h >= 24) System.out.print(0 + (h-24) + " ");
		else System.out.print(h + " ");

		System.out.println(m);
		
		s.close();
	}

}