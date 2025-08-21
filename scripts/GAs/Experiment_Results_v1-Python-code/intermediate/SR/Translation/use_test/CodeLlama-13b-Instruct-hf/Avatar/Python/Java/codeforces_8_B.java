
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class BugFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moves = scanner.nextLine();
        int x = 0, currentY = 0;
        int[][] dMovement = { { 0, -1 }, { 0, 1 }, { 1, 0 }, { -1, 0 } };
        boolean[][] d = new boolean[100][100];
        boolean bugFound = false;
        int firstCheck = 540;
        int checkTwo = 650;
        for (int i = 0; i < moves.length(); i++) {
            int tempX = x, tempY = currentY;
            x += dMovement[moves.charAt(i) - 'A'][0];
            currentY += dMovement[moves.charAt(i) - 'A'][1];
            if (firstCheck & checkTwo) {
                if (!d[x][currentY]) {
                    for (int j = 0; j < 4; j++) {
                        if (x + dMovement[j][0] != tempX && y + dMovement[j][1] != tempY && d[x + dMovement[j][0]][y + dMovement[j][1]]) {
                            bugFound = true;
                            break;
                        }
                    }
                } else {
                    bugFound = true;
                }
            }
            if (bugFound) {
                break;
            }
            d[x][currentY] = true;
        }
        if (firstCheck & checkOneB) {
            if (checkTwoA & checkTwoB) {
                if (checkThreeA & checkThreeB) {
                    if (bugFound) {
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
Note that this code assumes that the input string `moves` is a sequence of characters 'L', 'R', 'U', and 'D', and that the `d` array is initialized to all `false` values. The code also assumes that the `firstCheck`, `checkTwo`, `checkTwoA`, `checkTwoB`, `checkThreeA`, and `checkThreeB` variables are all `true`.
