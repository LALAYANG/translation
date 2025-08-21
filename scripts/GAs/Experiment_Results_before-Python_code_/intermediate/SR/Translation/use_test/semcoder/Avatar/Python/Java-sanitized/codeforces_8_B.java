import java.util.HashMap;
import java.util.Scanner;

public class codeforces_8_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String recordOfMovements = scanner.nextLine();
        int x = 0, y = 0;
        HashMap<Character, int[]> dMovement = new HashMap<>();
        dMovement.put('L', new int[]{0, -1});
        dMovement.put('R', new int[]{0, 1});
        dMovement.put('U', new int[]{1, 0});
        dMovement.put('D', new int[]{-1, 0});
        HashMap<String, String> d = new HashMap<>();
        d.put("0,0", "");
        boolean bug = false;

        for (int i = 0; i < recordOfMovements.length(); i++) {
            char move = recordOfMovements.charAt(i);
            int tempX = x, tempY = y;
            x += dMovement.get(move)[0];
            y += dMovement.get(move)[1];
            String currentPosition = x + "," + y;
            if (!d.containsKey(currentPosition)) {
                for (char step : dMovement.keySet()) {
                    int newX = x + dMovement.get(step)[0];
                    int newY = y + dMovement.get(step)[1];
                    if (!(newX == tempX && newY == tempY) && d.containsKey(newX + "," + newY)) {
                        bug = true;
                        break;
                    }
                }
            } else {
                bug = true;
            }
            if (bug) {
                break;
            }
            d.put(currentPosition, "");
        }

        if (bug) {
            System.out.println("BUG");
        } else {
            System.out.println("OK");
        }
    }
}