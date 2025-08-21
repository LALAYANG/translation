```java
import java.util.Scanner;

public class BugFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movementRecord = scanner.nextLine();
        int x = 0, y = 0;
        int[][] d_movement = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
        boolean[][] visited = new boolean[100][100];
        boolean bug = false;

        for (int i = 0; i < movementRecord.length(); i++) {
            char move = movementRecord.charAt(i);
            int index = move == 'L' ? 0 : move == 'R' ? 1 : move == 'U' ? 2 : 3;
            x += d_movement[index][0];
            y += d_movement[index][1];

            if (x < 0 || x >= 100 || y < 0 || y >= 100) {
                bug = true;
                break;
            }

            if (!visited[x][y]) {
                visited[x][y] = true;
            } else {
                bug = true;
                break;
            }
        }

        if (bug) {
            System.out.println("BUG");
        } else {
            System.out.println("OK");
        }
    }
}
```
Note: The above code is a Java implementation of the given Python code. The code uses a 2D array `visited` to keep track of the visited cells and a boolean variable `bug` to indicate if a bug is found. The code also uses a 2D array `d_movement` to store the movement directions. The code iterates through the movement record and updates the `x` and `y` coordinates accordingly. If the updated coordinates are out of bounds or if the cell is already visited, the code sets the `bug` variable to `true`. Finally, the code prints "BUG" if the `bug` variable is `true`, otherwise it prints "OK".
