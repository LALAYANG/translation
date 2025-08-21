import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class codeforces_8_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moves = scanner.nextLine();
        int x = 0;
        int y = 0;
        Map<String, int[]> d_movement = new HashMap<>();
        d_movement.put("L", new int[]{0, -1});
        d_movement.put("R", new int[]{0, 1});
        d_movement.put("U", new int[]{1, 0});
        d_movement.put("D", new int[]{-1, 0});
        Map<String, String> visited = new HashMap<>();
        visited.put(x + "," + y, "");
        boolean bug_found = false;
        for (int i = 0; i < moves.length(); i++) {
            String move = String.valueOf(moves.charAt(i));
            int[] temp = new int[]{x, y};
            x += d_movement.get(move)[0];
            y += d_movement.get(move)[1];
            if (!visited.containsKey(x + "," + y)) {
                for (String step : d_movement.keySet()) {
                    if (!(x + d_movement.get(step)[0] == temp[0] && y + d_movement.get(step)[1] == temp[1]) && visited.containsKey(x + d_movement.get(step)[0] + "," + y + d_movement.get(step)[1])) {
                        bug_found = true;
                        break;
                    }
                }
            } else {
                bug_found = true;
            }
            if (bug_found) {
                break;
            }
            visited.put(x + "," + y, "");
        }
        if (bug_found) {
            System.out.println("BUG");
        } else {
            System.out.println("OK");
        }
    }
}