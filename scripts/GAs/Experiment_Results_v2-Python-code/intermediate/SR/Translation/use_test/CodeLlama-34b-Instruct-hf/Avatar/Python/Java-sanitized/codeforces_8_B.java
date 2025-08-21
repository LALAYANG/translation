import java.util.Scanner;

public class codeforces_8_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movementRecord = scanner.nextLine();
        int x = 0, y = 0;
        int[][] d_movement = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
        boolean[][] visited = new boolean[100][100];
        boolean bug = false;

        for (int i = 0; i < movementRecord.length(); i++) {
            char move = movementRecord.charAt(i);
            int index = move == 'L' ? 0 : move == 'R' ? 1 : move == 'U' ? 2 : 3;
            x += d_movement[index][0];
            y += d_movement[index][1];

            if (x < 0 || x >= 100 || y < 0 || y >= 100) {
                bug = true;
                break;
            }

            if (!visited[x][y]) {
                visited[x][y] = true;
            } else {
                bug = true;
                break;
            }
        }

        if (bug) {
            System.out.println("BUG");
        } else {
            System.out.println("OK");
        }
    }
}