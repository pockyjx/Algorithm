import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int max = 0; int index = 0;
		int[] num = new int[9];
		
		for(int i=0;i<9;i++) {
			num[i] = Integer.parseInt(br.readLine());
			if(num[i] > max) {
				max = num[i]; index = i;
			}
		}
		
		bw.write(String.valueOf(max) + "\n");
		bw.write(String.valueOf(index + 1));
		
		br.close();
		bw.close();
		
	}
}