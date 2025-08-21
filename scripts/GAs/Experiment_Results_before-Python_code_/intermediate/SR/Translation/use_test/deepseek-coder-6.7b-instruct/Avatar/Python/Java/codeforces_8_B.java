```java
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String recordOfMovements = scanner.next();
        int x = 0, y = 0;
        HashMap<Character, int[]> dMovement = new HashMap<Character, int[]>() {{
            put('L', new int[]{0, -1});
            put('R', new int[]{0, 1});
            put('U', new int[]{1, 0});
            put('D', new int[]{-1, 0});
        }};
        HashMap<String, String> d = new HashMap<String, String>() {{
            put(x + " " + y, "");
        }};
        boolean bug = false;
        for (char move : recordOfMovements.toCharArray()) {
            int[] temp = {x, y};
            x += dMovement.get(move)[0];
            y += dMovement.get(move)[1];
            if (!d.containsKey(x + " " + y)) {
                for (char step : dMovement.keySet()) {
                    if ((x + dMovement.get(step)[0] + " " + (y + dMovement.get(step)[1])) != (temp[0] + " " + temp[1]) && d.containsKey((x + dMovement.get(step)[0] + " " + (y + dMovement.get(step)[1])))) {
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
            d.put(x + " " + y, "");
        }
        if (bug) {
            System.out.println("BUG");
        } else {
            System.out.println("OK");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string of movements from the user, and then checks if the movements form a bug or not. If a bug is detected, it prints "BUG", otherwise it prints "OK".

