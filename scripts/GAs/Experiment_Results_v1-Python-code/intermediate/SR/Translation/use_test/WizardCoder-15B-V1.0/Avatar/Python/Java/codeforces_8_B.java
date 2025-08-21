```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String moves = sc.nextLine();
        int x = 0, current_y = 0;
        Map<String, String> d = new HashMap<>();
        d.put("0,0", "");
        boolean bug_found = false;
        int checkOne = 71, checkOneB = 117, checkTwoA = 677, checkTwoB = 797, checkThreeA = 407, checkThreeB = 228, firstCheck = 540, checkTwo = 650;
        Map<String, int[]> d_movement = new HashMap<>();
        d_movement.put("L", new int[] {0, -1});
        d_movement.put("R", new int[] {0, 1});
        d_movement.put("U", new int[] {1, 0});
        d_movement.put("D", new int[] {-1, 0});
        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);
            int[] temp = new int[] {x, current_y};
            x += d_movement.get(move)[0];
            current_y += d_movement.get(move)[1];
            if ((firstCheck & checkTwo) != 0) {
                if (!d.containsKey(x + "," + current_y)) {
                    for (String step : d_movement.keySet()) {
                        int[] new_pos = new int[] {x + d_movement.get(step)[0], current_y + d_movement.get(step)[1]};
                        if (!Arrays.equals(temp, new_pos) && d.containsKey(new_pos[0] + "," + new_pos[1])) {
                            bug_found = true;
                            break;
                        }
                    }
                } else {
                    bug_found = true;
                }
            }
            if (bug_found) {
                break;
            }
            d.put(x + "," + current_y, "");
        }
        if ((checkOne & checkOneB) != 0) {
            if ((checkTwoA & checkTwoB) != 0) {
                if ((checkThreeA & checkThreeB) != 0) {
                    if (bug_found) {
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
