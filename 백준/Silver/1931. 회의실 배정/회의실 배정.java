import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] time = new int[n][2];

        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(time, (o1, o2) -> {
            if(o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });

        int cnt = 0;
        int prev = 0; // 이전 회의가 끝나는 시간
        for(int i=0;i<n;i++) {
            if(time[i][0] >= prev) {
                prev = time[i][1];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}