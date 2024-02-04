import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i=0;i<n;i++) {
            String s = br.readLine();
            Stack<Character> stack = new Stack<>();

            for(int j=0;j<s.length();j++) {
                char ch = s.charAt(j);
                if(stack.isEmpty() || stack.peek() != ch) stack.push(ch);
                else stack.pop();
            }
            if(stack.isEmpty()) answer++;
        }

        bw.write(answer + "");
        bw.close();
    }
}