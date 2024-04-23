import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        n = 1000 - n;

        int[] coin = {500, 100, 50, 10, 5, 1};
        int cnt = 0;
        int idx = 0;

        while(n > 0) {
            cnt += n / coin[idx];
            n %= coin[idx++];
        }

        System.out.println(cnt);
    }
}