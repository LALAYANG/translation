```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numG = 0, numP = 0, score = 0;
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char x = input.charAt(i);
            if (x == 'g') {
                if (numG - numP > 0) {
                    score++;
                    numP++;
                } else {
                    score = score;
                    numG++;
                }
            } else if (x == 'p') {
                if (numG - numP > 0) {
                    score = score;
                    numP++;
                } else {
                    score--;
                    numG++;
                }
            }
        }
        System.out.println(score);
    }
}
```
Test case:

Input:
2 2

Output:
2

Explanation:
The input is "2 2". The first character is '2', which is a 'g', so the score is incremented by 1 and the number of 'g's is incremented by 1. The second character is also '2', which is a 'g', so the score is incremented by 1 again and the number of 'g's is incremented by 1 again. The final score is 2.
