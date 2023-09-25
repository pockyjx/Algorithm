import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		double gradeSum = 0;
		double myGradeSum = 0;
		
		for(int i=0;i<20;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String subject = st.nextToken();
			double grade = Double.parseDouble(st.nextToken()); // 과목 학점
			double myGrade = 0; // 내 성적
			String str = st.nextToken();
			
			switch(str) {
				case "A+" : myGrade = 4.5; break;
				case "A0" : myGrade = 4.0; break;
				case "B+" : myGrade = 3.5; break;
				case "B0" : myGrade = 3.0; break;
				case "C+" : myGrade = 2.5; break;
				case "C0" : myGrade = 2.0; break;
				case "D+" : myGrade = 1.5; break;
				case "D0" : myGrade = 1.0; break;
				default : myGrade = 0.0;
			}
			
			if(!str.equals("P")) { // P 제외
				gradeSum += grade;
				myGradeSum += (grade * myGrade);
			}
		}
		bw.write(myGradeSum/gradeSum + "");

		br.close();
		bw.close();
	}
}