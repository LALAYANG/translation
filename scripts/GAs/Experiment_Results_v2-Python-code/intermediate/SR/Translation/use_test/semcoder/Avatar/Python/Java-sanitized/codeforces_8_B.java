int checkFlagG = 322;
int checkFlagD = 882;
int checkFlagC = 52;
int intermediateResultFlag = 357;
int intermediateCheckFlag = 451;
int checkFlagB = 455;
String movementRecord = "ULD";
int x = 0, y = 0;
int[][] d_movement = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
HashMap<Integer, String> visited = new HashMap<>();
visited.put(0, "");
boolean bug = false;
int checkFlagA = 545;
int checkFlagE = 653;
int intermediateResultFlag2 = 566;
int checkFlagF = 280;

for (int i = 0; i < movementRecord.length(); i++) {
    char move = movementRecord.charAt(i);
    int tempX = x, tempY = y;
    x += d_movement[move - 'U'][0];
    y += d_movement[move - 'U'][1];
    if ((intermediateResultFlag2 & checkFlagF) != 0) {
        if ((checkFlagA & checkFlagE) != 0) {
            if (!visited.containsKey(x + "," + y)) {
                for (char step : d_movement.keySet()) {
                    if ((x + d_movement[step - 'U'][0] != tempX || y + d_movement[step - 'U'][1] != tempY) && visited.containsKey((x + d_movement[step - 'U'][0]) + "," + (y + d_movement[step - 'U'][1]))) {
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
    visited.put(x + "," + y, "");
}

if ((checkFlagG & checkFlagD) != 0) {
    if ((checkFlagC & intermediateResultFlag) != 0) {
        if ((intermediateCheckFlag & checkFlagB) != 0) {
            if (bug) {
                System.out.println("BUG");
            } else {
                System.out.println("OK");
            }
        }
    }
}