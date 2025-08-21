```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moves = scanner.next();
        Map<String, String> d_movement = new HashMap<String, String>() {{
            put("L", "0,-1");
            put("R", "0,1");
            put("U", "1,0");
            put("D", "-1,0");
        }};
        Map<String, String> visited = new HashMap<>();
        boolean bug_found = false;
        for (char move : moves.toCharArray()) {
            String temp = visited.getOrDefault(String.valueOf(move), "0,0");
            String[] tempCoords = temp.split(",");
            int x = Integer.parseInt(tempCoords[0]);
            int y = Integer.parseInt(tempCoords[1]);
            String nextCoords = d_movement.get(String.valueOf(move));
            String[] nextCoordsArray = nextCoords.split(",");
            x += Integer.parseInt(nextCoordsArray[0]);
            y += Integer.parseInt(nextCoordsArray[1]);
            if (!visited.containsKey(String.valueOf(x) + "," + String.valueOf(y))) {
                for (Map.Entry<String, String> entry : d_movement.entrySet()) {
                    String[] stepCoords = entry.getValue().split(",");
                    if ((x + Integer.parseInt(stepCoords[0]) + "," + y + Integer.parseInt(stepCoords[1])) != temp && visited.containsKey((x + Integer.parseInt(stepCoords[0])) + "," + (y + Integer.parseInt(stepCoords[1])))) {
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
            visited.put(String.valueOf(x) + "," + String.valueOf(y), "");
        }
        if (bug_found) {
            System.out.println("BUG");
        } else {
            System.out.println("OK");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string of moves from the user, simulates the movements, and checks if a bug was found. If a bug was found, it prints "BUG", otherwise it prints "OK".

