import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<int[]> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++) {
            int tmp = Integer.parseInt(st.nextToken());
            while(!stack.isEmpty()) {
                if(stack.peek()[0] < tmp) stack.pop();
                else {
                    sb.append(stack.peek()[1] + " "); break;
                }
            }

            if(stack.isEmpty()) sb.append("0 ");
            stack.push(new int[] {tmp, i+1});
        }
        bw.write(sb + "");
        bw.close();
    }
}