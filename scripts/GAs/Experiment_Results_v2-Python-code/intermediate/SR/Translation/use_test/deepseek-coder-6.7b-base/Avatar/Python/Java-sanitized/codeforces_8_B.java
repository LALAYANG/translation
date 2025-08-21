public class codeforces_8_B {
    public static void main(String[] args) {
        int checkFlagG = 322;
        int checkFlagD = 882;
        int checkFlagC = 52;
        int intermediateResultFlag = 357;
        int intermediateCheckFlag = 451;
        int checkFlagB = 455;
        Scanner scanner = new Scanner(System.in);
        String movementRecord = scanner.nextLine();
        int[][] d_movement = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
        int[][] visited = new int[1000][1000];
        boolean bug = false;
        int checkFlagA = 545;
        int checkFlagE = 653;
        int intermediateResultFlag2 = 566;
        int checkFlagF = 280;
        int x = 0;
        int y = 0;
        for (int i = 0; i < movementRecord.length(); i++) {
            int temp = x;
            x += d_movement[movementRecord.charAt(i) - 'L'][0];
            y += d_movement[movementRecord.charAt(i) - 'L'][1];
            if (intermediateResultFlag2 & checkFlagF) {
                if (checkFlagA & checkFlagE) {
                    if (visited[x][y] == 0) {
                        for (int j = 0; j < 4; j++) {
                            if (x + d_movement[j][0] != temp && y + d_movement[j][1] != temp && visited[x + d_movement[j][0]][y + d_movement[j][1]] == 1) {
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
            visited[x][y] = 1;
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