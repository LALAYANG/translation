import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codeforces_8_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moves = scanner.nextLine();
        int x = 0;
        int y = 0;
        Map<String, int[]> dMovement = new HashMap<>();
        dMovement.put("L", new int[]{0, -1});
        dMovement.put("R", new int[]{0, 1});
        dMovement.put("U", new int[]{1, 0});
        dMovement.put("D", new int[]{-1, 0});
        Map<String, String> visited = new HashMap<>();
        visited.put(x + "," + y, "");
        boolean bugFound = false;
        for (int i = 0; i < moves.length(); i++) {
            String move = moves.substring(i, i + 1);
            int[] temp = new int[]{x, y};
            x += dMovement.get(move)[0];
            y += dMovement.get(move)[1];
            if (!visited.containsKey(x + "," + y)) {
                for (String step : dMovement.keySet()) {
                    if (add(x, dMovement.get(step)[0]) != temp[0] && add(y, dMovement.get(step)[1]) != temp[1] && visited.containsKey(add(x, dMovement.get(step)[0]) + "," + add(y, dMovement.get(step)[1]))) {
                        bugFound = true;
                        break;
                    }
                }
            } else {
                bugFound = true;
            }
            if (bugFound) {
                break;
            }
            visited.put(x + "," + y, "");
        }
        if (CHECK1 & CHECK2) {
            if (bugFound) {
                System.out.println("BUG");
            } else {
                System.out.println("OK");
            }
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }
}