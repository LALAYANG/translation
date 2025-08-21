```java
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int checkFlagG = 322;
        int checkFlagD = 882;
        int checkFlagC = 52;
        int intermediateResultFlag = 357;
        int intermediateCheckFlag = 451;
        int checkFlagB = 455;
        String movementRecord = "ULD";
        int x = 0, y = 0;
        Map<Character, int[]> d_movement = new HashMap<Character, int[]>() {{
            put('L', new int[]{0, -1});
            put('R', new int[]{0, 1});
            put('U', new int[]{1, 0});
            put('D', new int[]{-1, 0});
        }};
        boolean bug = false;
        int checkFlagA = 545;
        int checkFlagE = 653;
        int intermediateResultFlag2 = 566;
        int checkFlagF = 280;
        for (char move : movementRecord.toCharArray()) {
            int[] temp = new int[]{x, y};
            x += d_movement.get(move)[0];
            y += d_movement.get(move)[1];
            if ((intermediateResultFlag2 & checkFlagF) != 0) {
                if ((checkFlagA & checkFlagE) != 0) {
                    if (!visited.containsKey(new Integer[]{x, y})) {
                        for (char step : d_movement.keySet()) {
                            int[] temp2 = new int[]{x + d_movement.get(step)[0], y + d_movement.get(step)[1]};
                            if (!temp2[0].equals(temp[0]) && !temp2[1].equals(temp[1]) && visited.containsKey(temp2)) {
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
            visited.put(new Integer[]{x, y}, '');
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
    }
}
```

Test input:
ULD

Expected output:
BUG 
