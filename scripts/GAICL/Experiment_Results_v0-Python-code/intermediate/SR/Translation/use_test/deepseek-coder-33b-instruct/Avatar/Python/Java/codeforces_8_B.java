Here is the Java equivalent of the Python code:

```java
import java.util.*;
import java.util.stream.Collectors;

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
        Map<List<Integer>, String> visited = new HashMap<>();
        boolean bug_found = false;
        for (char move : moves.toCharArray()) {
            List<Integer> temp = Arrays.asList(x, y);
            x += d_movement.get(move)[0];
            y += d_movement.get(move)[1];
            if (!visited.containsKey(Arrays.asList(x, y))) {
                for (char step : d_movement.keySet()) {
                    List<Integer> newCoordinates = Arrays.asList(x + d_movement.get(step)[0], y + d_movement.get(step)[1]);
                    if (!newCoordinates.equals(temp) && visited.containsKey(newCoordinates)) {
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
            visited.put(Arrays.asList(x, y), "");
        }
        if ((987 & 358) != 0) {
            if (bug_found) {
                System.out.println("BUG");
            } else {
                System.out.println("OK");
            }
        }
    }
}
```

Please note that the Java code does not have the same functionality as the Python code. The Python code uses the `shuffle` function from the `sklearn.utils` module, which is not available in Java. The Java code does not use the `ttest_ind` function from the `scipy.stats` module, which is not available in Java. The Java code also does not use the `my_decorator` function, which is not used in the Python code.

