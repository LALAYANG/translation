
Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String recordOfMovements = scanner.nextLine();
        int x = 0, y = 0;
        HashMap<String, int[]> dMovement = new HashMap<>();
        dMovement.put("L", new int[] {0, -1});
        dMovement.put("R", new int[] {0, 1});
        dMovement.put("U", new int[] {1, 0});
        dMovement.put("D", new int[] {-1, 0});
        HashMap<int[], String> d = new HashMap<>();
        d.put(new int[] {x, y}, "");
        boolean bug = false;
        for (String move : recordOfMovements.split("")) {
            int[] temp = new int[] {x, y};
            x += dMovement.get(move)[0];
            y += dMovement.get(move)[1];
            if (!d.containsKey(new int[] {x, y})) {
                for (String step : dMovement.keySet()) {
                    if (!temp.equals(dMovement.get(step)) && d.containsKey(new int[] {x + dMovement.get(step)[0], y + dMovement.get(step)[1]})) {
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
            d.put(new int[] {x, y}, "");
        }
        if (bug) {
            System.out.println("BUG");
        } else {
            System.out.println("OK");
        }
    }
}
```
Note that this code uses the `HashMap` class to store the movements and the `Scanner` class to read the input from the user.
