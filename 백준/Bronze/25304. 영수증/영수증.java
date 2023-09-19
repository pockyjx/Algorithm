import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		long X = s.nextLong(); // 영수증에 적힌 총 금액
		int N = s.nextInt(); // 물건 종류의 수
		
		int a, b; // 가격, 개수
		long total = 0;
		
		for(int i=1;i<=N;i++) {
			a = s.nextInt();
			b = s.nextInt();
			
			total += (a * b); // 계산한 총 금액
		}
		
		if(X == total) System.out.println("Yes");
		else System.out.println("No");
		
		s.close();
	}
}