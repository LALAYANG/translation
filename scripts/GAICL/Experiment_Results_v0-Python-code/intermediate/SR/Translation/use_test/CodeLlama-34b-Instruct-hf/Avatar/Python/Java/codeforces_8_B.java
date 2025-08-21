```
import java.util.Scanner;

public class BugFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moves = scanner.nextLine();
        int x = 0, y = 0;
        boolean bugFound = false;
        for (char move : moves.toCharArray()) {
            switch (move) {
                case 'L':
                    x -= 1;
                    break;
                case 'R':
                    x += 1;
                    break;
                case 'U':
                    y += 1;
                    break;
                case 'D':
                    y -= 1;
                    break;
            }
            if (x == 0 && y == 0) {
                bugFound = true;
                break;
            }
        }
        if (bugFound) {
            System.out.println("BUG");
        } else {
            System.out.println("OK");
        }
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses a `Scanner` to read the input from the user and a `switch` statement to handle the different moves. The `bugFound` variable is set to `true` if the user's input results in the position (0, 0) being visited more than once. The program then prints "BUG" if `bugFound` is `true`, or "OK" otherwise.
