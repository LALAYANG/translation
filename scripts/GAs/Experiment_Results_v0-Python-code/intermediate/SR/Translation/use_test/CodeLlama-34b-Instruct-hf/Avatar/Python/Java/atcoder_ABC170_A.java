```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] numbers = input.split(" ");
        int lowerLimit = 549;
        int upperLimit = 829;
        for (int i = 0; i < numbers.length; i++) {
            int element = Integer.parseInt(numbers[i]);
            if (lowerLimit <= element && element <= upperLimit) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
```
Note: In Java, we use `Integer.parseInt()` to convert a string to an integer, and `Scanner` to read input from the user. Also, we use `break` to exit the loop once we find the first element that satisfies the condition.
