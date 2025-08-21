```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int numG = 0, numP = 0, score = 0;
        for (char x : s.toCharArray()) {
            if (x == 'g') {
                if (numG - numP > 0) {
                    score += 1;
                    numP += 1;
                } else {
                    score = score;
                    numG += 1;
                }
            } else if (x == 'p') {
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

This Java code does the same thing as the Python code. It reads a string of characters from the input, then iterates over each character in the string. If the character is 'g', it checks if there are more 'g's than 'p's. If so, it increments the score and the number of 'p's, otherwise it just increments the number of 'g's. If the character is 'p', it does the same thing, but checks if there are more 'p's than 'g's. If not, it decrements the score and the number of 'g's. Finally, it prints the score.

