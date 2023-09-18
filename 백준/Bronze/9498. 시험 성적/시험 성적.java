import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int score;
		String grade = "";
		
		do {
            score = s.nextInt();

            if (score > 100 || score < 0) {
                System.out.println("올바른 점수를 입력하세요!");
            }
        } while (score > 100 || score < 0);

		
		switch (score/10) {
			case 10 :
			case 9 : grade = "A"; break;
			case 8 : grade = "B"; break;
			case 7 : grade = "C"; break;
			case 6 : grade = "D"; break;
			case 5 : 
			case 4 : 
			case 3 :
			case 2 : 
			case 1 : 
			case 0 : grade = "F"; break;
		}
		
		System.out.println(grade);

	}

}
