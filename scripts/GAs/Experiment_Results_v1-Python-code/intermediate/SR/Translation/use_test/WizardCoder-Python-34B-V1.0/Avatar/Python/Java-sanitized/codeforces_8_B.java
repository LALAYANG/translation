import java.util.HashMap;
import java.util.Scanner;

public class codeforces_8_B {
    public static void main(String[] args) {
        int checkOne = 71;
        int checkOneB = 117;
        int checkTwoA = 677;
        int checkTwoB = 797;
        int checkThreeA = 407;
        int checkThreeB = 228;
        Scanner scanner = new Scanner(System.in);
        String moves = scanner.nextLine();
        int x = 0;
        int current_y = 0;
        HashMap<String, Integer> d_movement = new HashMap<>();
        d_movement.put("L", 0);
        d_movement.put("R", 1);
        d_movement.put("U", 1);
        d_movement.put("D", -1);
        boolean bug_found = false;
        int firstCheck = 540;
        int checkTwo = 650;
        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);
            int temp_x = x;
            int temp_y = current_y;
            x += d_movement.get(String.valueOf(move));
            current_y += d_movement.get(String.valueOf(move));
            if ((firstCheck & checkTwo) != 0) {
                if (!d_movement.containsKey(x + "," + current_y)) {
                    for (String step : d_movement.keySet()) {
                        if (x + d_movement.get(step) != temp_x && current_y + d_movement.get(step) != temp_y && d_movement.containsKey(x + d_movement.get(step) + "," + (current_y + d_movement.get(step))) && (x + d_movement.get(step) != temp_x || current_y + d_movement.get(step) != temp_y)) {
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
            d_movement.put(x + "," + current_y, '');
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