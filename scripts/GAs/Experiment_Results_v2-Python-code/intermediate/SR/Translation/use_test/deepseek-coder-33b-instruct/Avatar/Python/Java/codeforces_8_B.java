```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int checkFlagG = 322;
        int checkFlagD = 882;
        int checkFlagC = 52;
        int intermediateResultFlag = 357;
        int intermediateCheckFlag = 451;
        int checkFlagB = 455;
        Scanner scanner = new Scanner(System.in);
        String movementRecord = scanner.nextLine();
        int x = 0, y = 0;
        Map<Character, int[]> d_movement = new HashMap<>();
        d_movement.put('L', new int[]{0, -1});
        d_movement.put('R', new int[]{0, 1});
        d_movement.put('U', new int[]{1, 0});
        d_movement.put('D', new int[]{-1, 0});
        Map<List<Integer>, String> visited = new HashMap<>();
        boolean bug = false;
        int checkFlagA = 545;
        int checkFlagE = 653;
        int intermediateResultFlag2 = 566;
        int checkFlagF = 280;
        for (char move : movementRecord.toCharArray()) {
            List<Integer> temp = Arrays.asList(x, y);
            x += d_movement.get(move)[0];
            y += d_movement.get(move)[1];
            if ((intermediateResultFlag2 & checkFlagF) != 0) {
                if ((checkFlagA & checkFlagE) != 0) {
                    if (!visited.containsKey(Arrays.asList(x, y))) {
                        for (char step : d_movement.keySet()) {
                            if (!Arrays.asList(x + d_movement.get(step)[0], y + d_movement.get(step)[1]).equals(temp) && visited.containsKey(Arrays.asList(x + d_movement.get(step)[0], y + d_movement.get(step)[1]))) {
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
            visited.put(Arrays.asList(x, y), "");
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

