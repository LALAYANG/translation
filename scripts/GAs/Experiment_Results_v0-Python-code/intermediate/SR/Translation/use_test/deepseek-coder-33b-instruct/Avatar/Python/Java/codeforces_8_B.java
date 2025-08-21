Here is the Java equivalent of the provided Python code. Note that Java does not have a direct equivalent to Python's decorators, so the decorator function is not included. Also, Java does not have a built-in function to shuffle an array, so the shuffle function from sklearn.utils is not used.

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moves = scanner.nextLine();
        int x = 0, y = 0;
        Map<Character, int[]> d_movement = new HashMap<>();
        d_movement.put('L', new int[]{0, -1});
        d_movement.put('R', new int[]{0, 1});
        d_movement.put('U', new int[]{1, 0});
        d_movement.put('D', new int[]{-1, 0});
        Map<String, String> visited = new HashMap<>();
        boolean bug_found = false;
        for (char move : moves.toCharArray()) {
            String temp = x + "," + y;
            x += d_movement.get(move)[0];
            y += d_movement.get(move)[1];
            if (!visited.containsKey(x + "," + y)) {
                for (char step : d_movement.keySet()) {
                    int[] value = d_movement.get(step);
                    if (!(add(x, value[0]) + "," + (y + value[1])).equals(temp) && visited.containsKey((x + value[0]) + "," + (y + value[1]))) {
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
        if ((987 & 358) != 0) {
            if (bug_found) {
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
```

Please note that the Java code does not include the functionality of the ttest_ind function from scipy.stats, as there is no direct equivalent in Java.

