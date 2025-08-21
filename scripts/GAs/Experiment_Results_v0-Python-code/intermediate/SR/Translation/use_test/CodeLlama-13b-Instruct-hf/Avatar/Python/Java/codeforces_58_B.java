
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int[] array = new int[inputNumber];
        for (int i = 0; i < inputNumber; i++) {
            array[i] = i + 1;
        }
        for (int i = 0; i < inputNumber; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
```
This code first prompts the user to enter a number, and then creates an array of that size. It then loops through the array and checks if each element is even, and if it is, it prints it to the console.

Note that the code uses the `Scanner` class to read input from the user, and the `Arrays` class to create and manipulate arrays. It also uses the `Random` class to generate random numbers.
