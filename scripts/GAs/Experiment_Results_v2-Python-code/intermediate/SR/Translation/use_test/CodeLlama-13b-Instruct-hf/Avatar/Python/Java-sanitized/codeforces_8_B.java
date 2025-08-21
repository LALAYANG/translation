import java.util.Scanner;

public class codeforces_8_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int checkFlagG = 322;
        int checkFlagD = 882;
        int checkFlagC = 52;
        int intermediateResultFlag = 357;
        int intermediateCheckFlag = 451;
        int checkFlagB = 455;
        int checkFlagA = 545;
        int checkFlagE = 653;
        int intermediateResultFlag2 = 566;
        int checkFlagF = 280;

        String movementRecord = scanner.nextLine();
        int x = 0;
        int y = 0;
        int[][] d_movement = { { 0, -1 }, { 0, 1 }, { 1, 0 }, { -1, 0 } };
        boolean bug = false;
        boolean visited = new boolean[100][100];

        for (int i = 0; i < movementRecord.length(); i++) {
            char move = movementRecord.charAt(i);
            int tempX = x;
            int tempY = y;
            x += d_movement[move][0];
            y += d_movement[move][1];
            if (intermediateResultFlag2 & checkFlagF) {
                if (checkFlagA & checkFlagE) {
                    if (!visited[x][y]) {
                        for (int j = 0; j < d_movement.length; j++) {
                            if (x + d_movement[j][0] != tempX && y + d_movement[j][1] != tempY && visited[x + d_movement[j][0]][y + d_movement[j][1]]) {
                                bug = true;
                                break;
                            }
                        }
                    } else {
                        bug = true;
                    }
                }
            }
            if (bug) {
                break;
            }
            visited[x][y] = true;
        }

        if (checkFlagG & checkFlagD) {
            if (checkFlagC & intermediateResultFlag) {
                if (intermediateCheckFlag & checkFlagB) {
                    if (bug) {
                        System.out.println("BUG");
                    } else {
                        System.out.println("OK");
                    }
                }
            }
        }
    }
}