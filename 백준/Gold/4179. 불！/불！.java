import java.io.*;
import java.util.*;
public class Main {

    public static class Node {
        int x, y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[][] move = new int[r][c];
        int[][] fire = new int[r][c];

        Queue<Node> moveQ = new LinkedList<>();
        Queue<Node> fireQ = new LinkedList<>();

        for(int i=0;i<r;i++) {
            String s = br.readLine();
            for(int j=0;j<c;j++) {
                char ch = s.charAt(j);

                if(ch == 'J') {
                    move[i][j] = 1;
                    moveQ.offer(new Node(i, j));
                }
                else if(ch == 'F') {
                    fire[i][j] = 1;
                    fireQ.offer(new Node(i, j));
                }
                else {
                    move[i][j] = ch;
                    fire[i][j] = ch;
                }
            }
        }

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        Node tmp;
        int px, py, nx, ny;

        // 불 bfs
        while(!fireQ.isEmpty()) {
            tmp = fireQ.poll();
            px = tmp.x; py = tmp.y;

            for(int i=0;i<4;i++) {
                nx = px + dx[i]; ny = py + dy[i];
                if(nx < 0 || ny < 0 || nx > r-1 || ny > c-1) continue;
                if(fire[nx][ny] == '.') {
                    fire[nx][ny] = fire[px][py] + 1;
                    fireQ.offer(new Node(nx, ny));
                }
            }
        }

        // 지훈 bfs
        while(!moveQ.isEmpty()) {
            tmp = moveQ.poll();
            px = tmp.x; py = tmp.y;

            for(int i=0;i<4;i++) {
                nx = px + dx[i]; ny = py + dy[i];
                if(nx < 0 || ny < 0 || nx > r-1 || ny > c-1) { // 탈출
                    System.out.println(move[px][py]); return;
                }

                if(move[nx][ny] != '#') {
                    if(fire[nx][ny] != -1 && move[px][py] + 1 < fire[nx][ny]) {
                        move[nx][ny] = move[px][py] + 1;
                        fire[nx][ny] = -1;
                        moveQ.offer(new Node(nx, ny));
                    }
                }
            }
        }

        // 탈출 실패
        System.out.println("IMPOSSIBLE");
    }
}