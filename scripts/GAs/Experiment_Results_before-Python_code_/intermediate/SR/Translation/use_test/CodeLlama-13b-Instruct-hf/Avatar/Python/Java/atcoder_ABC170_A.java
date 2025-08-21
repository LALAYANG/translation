```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] a = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            a[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `split` method to split the input into an array of strings. The `map` method is then used to convert each string to an integer. Finally, the code uses a `for` loop to iterate over the array and print the index of the first element that is equal to 0.

Note that the `break` statement is used to exit the loop once the first element that is equal to 0 is found. This is because the `for` loop will continue to iterate over the rest of the array even after the first element that is equal to 0 is found.
