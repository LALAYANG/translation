
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Arrays;

public class BugFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moves = scanner.nextLine();
        int x = 0;
        int y = 0;
        Map<String, int[]> d_movement = new HashMap<>();
        d_movement.put("L", new int[] {0, -1});
        d_movement.put("R", new int[] {0, 1});
        d_movement.put("U", new int[] {1, 0});
        d_movement.put("D", new int[] {-1, 0});
        Map<int[], String> visited = new HashMap<>();
        boolean bugFound = false;
        for (String move : moves.split("")) {
            int[] temp = new int[] {x, y};
            x += d_movement.get(move)[0];
            y += d_movement.get(move)[1];
            if (!visited.containsKey(new int[] {x, y})) {
                for (String step : d_movement.keySet()) {
                    if (Arrays.equals(new int[] {x, y}, temp) && Arrays.equals(new int[] {x + d_movement.get(step)[0], y + d_movement.get(step)[1]}, temp)) {
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
            visited.put(new int[] {x, y}, "");
        }
        if (bugFound) {
            System.out.println("BUG");
        } else {
            System.out.println("OK");
        }
    }
}
```
Note that this code is not exactly the same as the Python code, as it uses Java's `HashMap` and `Arrays` classes instead of Python's `dict` and `list` classes. Additionally, the Java code uses a `Scanner` object to read input from the user, while the Python code uses the `input()` function.
