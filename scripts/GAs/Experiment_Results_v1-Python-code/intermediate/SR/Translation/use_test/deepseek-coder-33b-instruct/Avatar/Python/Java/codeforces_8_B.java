Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moves = scanner.nextLine();
        int x = 0, current_y = 0;
        Map<List<Integer>, String> d = new HashMap<>();
        boolean bug_found = false;
        int firstCheck = 540, checkTwo = 650;
        Map<Character, List<Integer>> d_movement = new HashMap<Character, List<Integer>>() {{
            put('L', Arrays.asList(0, -1));
            put('R', Arrays.asList(0, 1));
            put('U', Arrays.asList(1, 0));
            put('D', Arrays.asList(-1, 0));
        }};
        int checkOne = 71, checkOneB = 117, checkTwoA = 677, checkTwoB = 797, checkThreeA = 407, checkThreeB = 228;
        for (char move : moves.toCharArray()) {
            List<Integer> temp = Arrays.asList(x, current_y);
            x += d_movement.get(move).get(0);
            current_y += d_movement.get(move).get(1);
            if ((firstCheck & checkTwo) != 0) {
                if (!d.containsKey(Arrays.asList(x, current_y))) {
                    for (char step : d_movement.keySet()) {
                        if (!Arrays.asList(x + d_movement.get(step).get(0), current_y + d_movement.get(step).get(1)).equals(temp) && d.containsKey(Arrays.asList(x + d_movement.get(step).get(0), current_y + d_movement.get(step).get(1)))) {
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
            d.put(Arrays.asList(x, current_y), "");
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
```

Please note that the Java version of the code is a bit more verbose than the Python version due to the differences in the languages. Also, the Java version uses `Scanner` to read the input from the console, while the Python version uses `input()`.

