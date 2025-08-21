```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstLine = sc.nextInt();
        int total = 0;
        String[] memory = new String[firstLine];
        for (int i = 0; i < firstLine; i++) {
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

Explanation:

* The code first reads the first line of input, which is the number of lines to follow.
* It then initializes an array of strings to store the output.
* It then loops through each line of input, reading the two integers A and G.
* If the total of A is less than or equal to 500, it adds A to the total and appends "A" to the output array. Otherwise, it subtracts G from the total and appends "G" to the output array.
* Finally, it joins the output array into a single string and prints it.

Note: The code assumes that the input is well-formed and that the first line of input is a positive integer.
