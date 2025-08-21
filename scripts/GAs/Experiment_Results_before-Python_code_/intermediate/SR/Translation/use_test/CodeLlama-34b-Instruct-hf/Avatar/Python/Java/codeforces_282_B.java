```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstline = sc.nextInt();
        int total = 0;
        String[] memory = new String[firstline];
        for (int i = 0; i < firstline; i++) {
            int A = sc.nextInt();
            int G = sc.nextInt();
            if (total + A <= 500) {
                total += A;
                memory[i] = "A";
            } else {
                total -= G;
                memory[i] = "G";
            }
        }
        System.out.println(String.join("", memory));
    }
}
```
Note: The `String.join()` method is used to concatenate the elements of the `memory` array into a single string, separated by the empty string `""`.
