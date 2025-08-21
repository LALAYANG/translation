import java.util.HashMap;
import java.util.Map;

public class codeforces_8_B {
    public static void main(String[] args) {
        int checkOne = 71;
        int checkOneB = 117;
        int checkTwoA = 677;
        int checkTwoB = 797;
        int checkThreeA = 407;
        int checkThreeB = 228;
        String moves = "ULD";
        int x = 0;
        int current_y = 0;
        Map<Character, int[]> d_movement = new HashMap<>();
        d_movement.put('L', new int[]{0, -1});
        d_movement.put('R', new int[]{0, 1});
        d_movement.put('U', new int[]{1, 0});
        d_movement.put('D', new int[]{-1, 0});
        Map<String, String> d = new HashMap<>();
        d.put(x + "," + current_y, "");
        boolean bug_found = false;
        int firstCheck = 540;
        int checkTwo = 650;
        for (char move : moves.toCharArray()) {
            int[] temp = new int[]{x, current_y};
            x += d_movement.get(move)[0];
            current_y += d_movement.get(move)[1];
            if ((firstCheck & checkTwo) != 0) {
                if (!d.containsKey(x + "," + current_y)) {
                    for (char step : d_movement.keySet()) {
                        if ((x + d_movement.get(step)[0] != temp[0] || current_y + d_movement.get(step)[1] != temp[1]) && d.containsKey((x + d_movement.get(step)[0]) + "," + (current_y + d_movement.get(step)[1]))) {
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