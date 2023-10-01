import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true) {
			int n = Integer.parseInt(br.readLine());
			int sum = 0;
			if(n == -1) break;

			List<Integer> list = new ArrayList<Integer>();
			for(int i=1;i<=n-1;i++) {
				if(n % i == 0) {
					list.add(i);
					sum += i;
				}
			}
			
			StringBuilder sb = new StringBuilder();
			if(sum == n) {
				sb.append(n).append(" = ");
				for(int j=0;j<list.size()-1;j++) {
					sb.append(list.get(j)).append(" + ");
				}
				sb.append(list.get(list.size()-1));
			} else {
				sb.append(n).append(" is NOT perfect.");
			}
			bw.write(sb + "\n");
		}
		
		br.close();
		bw.close();
	}
}