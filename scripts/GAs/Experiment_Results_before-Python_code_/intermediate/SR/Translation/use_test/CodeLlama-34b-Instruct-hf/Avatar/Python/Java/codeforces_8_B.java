```java
import java.util.Scanner;

public class BugFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String recordOfMovements = scanner.nextLine();
        int x = 0, y = 0;
        Map<Character, int[]> dMovement = new HashMap<>();
        dMovement.put('L', new int[] {0, -1});
        dMovement.put('R', new int[] {0, 1});
        dMovement.put('U', new int[] {1, 0});
        dMovement.put('D', new int[] {-1, 0});
        Map<String, Boolean> d = new HashMap<>();
        d.put("", false);
        boolean bug = false;
        for (char move : recordOfMovements.toCharArray()) {
            int[] temp = new int[] {x, y};
            x += dMovement.get(move)[0];
            y += dMovement.get(move)[1];
            if (!d.containsKey(x + "," + y)) {
                for (char step : dMovement.keySet()) {
                    if (x + dMovement.get(step)[0] != temp[0] && y + dMovement.get(step)[1] != temp[1] && d.containsKey(x + dMovement.get(step)[0] + "," + y + dMovement.get(step)[1])) {
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
            d.put(x + "," + y, false);
        }
        if (bug) {
            System.out.println("BUG");
        } else {
            System.out.println("OK");
        }
    }
}
```
Note: The above code uses Java 8 features such as the `Map.putIfAbsent()` method, which is not available in Java 7 or earlier versions. If you need to use Java 7 or earlier, you can modify the code to use the `Map.containsKey()` method instead.
