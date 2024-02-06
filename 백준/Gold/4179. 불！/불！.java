import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static int row;
    static int column;
    static char[][] map;
    static int[][] time;
    static int[] dr = {1, -1, 0, 0};
    static int[] dc = {0, 0, 1, -1};
    static boolean isEscape;
    static int ans;
    static Queue<int[]> q = new LinkedList<>();
    static Queue<int[]> fire = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        row = Integer.valueOf(input[0]);
        column = Integer.valueOf(input[1]);
        map = new char[row][column];
        time = new int[row][column];
        isEscape = false;


        for (int i = 0; i < row; i++) {
            String info = br.readLine();
            for (int j = 0; j < column; j++) {
                map[i][j] = info.charAt(j);

                if (map[i][j] == 'J') {

                    time[i][j] = 1;

                    // 처음 배치부터 경계선에 있는 경우, 1분으로 바로 탈출 할 수 있다.
                    if (i == 0 || i == row - 1 || j == 0 || j == column - 1) {
                        System.out.println(1);
                        return;
                    }
                    q.offer(new int[]{i, j});
                }
                if (map[i][j] == 'F') {
                    fire.offer(new int[]{i, j});
                }
            }

        }

		// fire 에 담아둔 위치 정보를 q에 모은다.
        while(!fire.isEmpty()){
            q.offer(fire.poll());
        }

        bfs();

        // bfs 이후, 탈출 불가능 판단이면 IMPOSSIBLE 출력

        if (!isEscape) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(ans);
        }


    }

    static boolean checkNearFire(int r, int c) {
        // 경계선에 도달했을 때 인접한 곳에 불이 있는지 확인
        for (int i = 0; i <= 3; i++) {
            int checkR = r + dr[i];
            int checkC = c + dc[i];
            if ((0 <= checkR && checkR < row) && (0 <= checkC && checkC < column)) {
                if (map[checkR][checkC] == 'F') {
                    return true;
                }
            }
        }
        return false;
    }

    static void bfs() {
        while (!q.isEmpty()) {
            int[] point = q.poll();
            int r = point[0];
            int c = point[1];

            for (int i = 0; i <= 3; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                if ((0 <= nr && nr < row) && (0 <= nc && nc < column)) {
                    if (map[r][c] == 'J' && map[nr][nc] == '.') {
                        time[nr][nc] = time[r][c] + 1;
                        map[nr][nc] = 'J';
                        q.offer(new int[]{nr, nc});

                        if ((nr == 0 || nr == row - 1 || nc == 0 || nc == column - 1)) {
                            ans = time[nr][nc];

                            if (checkNearFire(nr, nc)) {
                                return;
                            }

                            isEscape = true;
                            return;
                        }

                    } else if (map[r][c] == 'F' && (map[nr][nc] == '.' || map[nr][nc] == 'J')) {
                        map[nr][nc] = 'F';
                        q.offer(new int[]{nr, nc});
                    }
                }
            }
        }
    }
}