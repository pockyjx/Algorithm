import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] wait = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            wait[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(wait);

        int tmp = 0;
        int answer = 0;
        for(int i=0;i<n;i++) {
            tmp += wait[i];
            answer += tmp;
        }
        System.out.println(answer);
    }
}