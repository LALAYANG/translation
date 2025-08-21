
Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] s = input.split(" ");
        int numG = 0;
        int numP = 0;
        int score = 0;
        for (String x : s) {
            if (x.equals("g")) {
                if (numG - numP > 0) {
                    score += 1;
                    numP += 1;
                } else {
                    score = score;
                    numG += 1;
                }
            } else if (x.equals("p")) {
                if (numG - numP > 0) {
                    score = score;
                    numP += 1;
                } else {
                    score -= 1;
                    numG += 1;
                }
            }
        }
        System.out.println(score);
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `String.split()` method to split the input string into an array of strings. The `String.equals()` method is used to compare the input strings to the desired values.
