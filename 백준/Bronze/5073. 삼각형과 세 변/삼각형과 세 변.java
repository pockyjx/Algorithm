import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] line = new int[3];
			line[0] = Integer.parseInt(st.nextToken());
			line[1] = Integer.parseInt(st.nextToken());
			line[2] = Integer.parseInt(st.nextToken());
			
			if(line[0] == 0 && line[1] == 0 && line[2] == 0) break;
			Arrays.sort(line); // 정렬
			
			StringBuilder sb = new StringBuilder();
			if((line[0] + line[1]) <= line[2]) sb.append("Invalid");
			else if(line[0] == line[1] && line[1] == line[2] && line[0] == line[2]) 
				sb.append("Equilateral");
			else if(line[0] == line[1] || line[1] == line[2] || line[0] == line[2]) 
				sb.append("Isosceles");
			else sb.append("Scalene");
			bw.write(sb + "\n");
		}
		
		br.close();
		bw.close();
	}
}