```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        int[] arr = new int[inputNumber];
        for (int i = 0; i < inputNumber; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < inputNumber; i++) {
            for (int j = i + 1; j < inputNumber; j++) {
                if (arr[i] != arr[j] && arr[i] + arr[j] == arr[i + 1]) {
                    System.out.println(i + 1 + " " + j + 1 + " " + (i + 1));
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
```
Explanation:

The code is a Java implementation of the Python code you provided. It uses a similar approach to the Python code, but with some differences due to the differences between Python and Java.

The main differences are:

* In Java, we use a `Scanner` object to read input from the user, whereas in Python, we use the `input()` function.
* In Java, we use a `for` loop to iterate over the elements of the array, whereas in Python, we use a `for` loop with a `range()` function.
* In Java, we use the `System.out.println()` method to print output to the console, whereas in Python, we use the `print()` function.
* In Java, we use the `return` statement to exit the program, whereas in Python, we use the `exit()` function.

The rest of the code is similar in both languages, with some minor differences due to the differences in syntax and library functions.
