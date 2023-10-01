import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		List<Integer> prime = new ArrayList<Integer>();
		int sum = 0;
		
		for(int i=n;i<=m;i++) {
			boolean isPrime = true;
			if(i == 1) continue;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i % j == 0) isPrime = false;
			}
			if(isPrime) {
				sum += i;
				prime.add(i);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		if(prime.size() != 0) {
			sb.append(sum).append("\n").append(prime.get(0));
		} else {
			sb.append("-1");
		}
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
}