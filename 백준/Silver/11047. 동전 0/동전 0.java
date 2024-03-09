import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] coin = new int[n];
        for(int i=0;i<n;i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        int idx = n-1;
        while(k > 0) {
            cnt += k / coin[idx];
            k %= coin[idx--];
        }
        System.out.println(cnt);
    }
}