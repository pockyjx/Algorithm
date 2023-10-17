import java.io.*;
import java.util.*;
public class Main {
	
	public static class Member {
		int age;
		String name;
		
		public Member(int age, String name) { // 생성자
			super();
			this.age = age;
			this.name = name;
		}

		@Override
		public String toString() {
			return age + " " + name;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		Member[] member = new Member[n];
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			member[i] = new Member(age, name);
		}
		
		Arrays.sort(member, new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {
				return o1.age - o2.age;
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++) {
			sb.append(member[i]).append("\n");
		}
		bw.write(sb + "");
		
		br.close();
		bw.close();
	}
}