import java.util.HashMap;
import java.util.Scanner;

public class codeforces_8_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moves = scanner.next();
        HashMap<String, int[]> dMovement = new HashMap<String, int[]>() {{
            put("L", new int[]{0, -1});
            put("R", new int[]{0, 1});
            put("U", new int[]{1, 0});
            put("D", new int[]{-1, 0});
        }};
        HashMap<String, String> visited = new HashMap<>();
        boolean bugFound = false;
        int x = 0, y = 0;
        for (char move : moves.toCharArray()) {
            String temp = x + " " + y;
            x += dMovement.get(String.valueOf(move))[0];
            y += dMovement.get(String.valueOf(move))[1];
            if (!visited.containsKey(x + " " + y)) {
                for (String step : dMovement.keySet()) {
                    if ((x + dMovement.get(step)[0] + " " + y + dMovement.get(step)[1]).equals(temp) && visited.containsKey(x + dMovement.get(step)[0] + " " + y + dMovement.get(step)[1])) {
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
            visited.put(x + " " + y, "");
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

    public static final int CHECK1 = 987;
    public static final int CHECK2 = 358;
}