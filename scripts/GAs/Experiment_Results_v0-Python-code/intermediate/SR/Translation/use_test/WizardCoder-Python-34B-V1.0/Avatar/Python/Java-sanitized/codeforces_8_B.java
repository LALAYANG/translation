import java.time.LocalDateTime;

public class codeforces_8_B {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        add(91, 92, 53);
        String moves = "ULD";
        int x = 0;
        int y = 0;
        int[][] d_movement = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
        boolean bug_found = false;
        int[][] visited = new int[100][100];
        for (int i = 0; i < moves.length(); i++) {
            int[] temp = {x, y};
            int move = moves.charAt(i);
            if (move == 'L') {
                x += d_movement[0][0];
                y += d_movement[0][1];
            } else if (move == 'R') {
                x += d_movement[1][0];
                y += d_movement[1][1];
            } else if (move == 'U') {
                x += d_movement[2][0];
                y += d_movement[2][1];
            } else if (move == 'D') {
                x += d_movement[3][0];
                y += d_movement[3][1];
            }
            if (visited[x][y] != 0) {
                bug_found = true;
                break;
            } else {
                visited[x][y] = 1;
            }
        }
        if (bug_found) {
            System.out.println("BUG");
        } else {
            System.out.println("OK");
        }
    }

    public static void add(int a, int b, int c) {
        return a + b + c;
    }
}