import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        LinkedList<Integer> deque = new LinkedList<>();
        for(int i=1;i<=n;i++) {
            deque.add(i);
        }

        int[] arr = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        for(int i=0;i<m;i++) {
            int target = deque.indexOf(arr[i]);
            int mid = 0;

            if(deque.size()% 2 == 0) mid = deque.size() / 2 - 1;
            else mid = deque.size() / 2;

            if(target <= mid) {
                for(int j=0;j<target;j++) {
                    deque.addLast(deque.pollFirst());
                    cnt++;
                }
            }

            else {
                for(int j=0;j<deque.size()-target;j++) {
                    deque.addFirst(deque.pollLast());
                    cnt++;
                }
            }

            deque.pollFirst();
        }

        bw.write(cnt + "");
        bw.close();
    }
}