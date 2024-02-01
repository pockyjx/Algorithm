import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] cnt = new int[26];
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            cnt[ch-97]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i : cnt) {
            sb.append(i + " ");
        }
        System.out.println(sb);
    }
}