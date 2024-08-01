import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int k = Integer.parseInt(st.nextToken()); // 수강 가능 인원
		int l = Integer.parseInt(st.nextToken()); // 대기 목록 길이

		Set<String> s = new LinkedHashSet<>();
		for(int i=0;i<l;i++) {
			String student = br.readLine();

			if(s.contains(student)) {
				s.remove(student);
			}
			s.add(student);
		}
        
		int cnt = 0;
		for(String p : s) {
			System.out.println(p);
			cnt++;
			if(cnt == k) return;
		}
	}
}