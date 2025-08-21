
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class ComputeProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int listLength = 100010;
        boolean[] boolList = new boolean[listLength];
        boolList[0] = false;
        boolList[1] = false;
        for (int i = 4; i < listLength; i += 2) {
            boolList[i] = false;
        }
        for (int i = 3; i * i <= listLength; i += 2) {
            if (boolList[i]) {
                for (int j = i + i; j < listLength; j += i) {
                    boolList[j] = false;
                }
            }
        }
        int X = scanner.nextInt();
        for (int i = X; i < listLength; i++) {
            if (boolList[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}
```
This code uses the same logic as the Python code, but it is written in Java. It uses the `Scanner` class to read input from the user, and it uses a `boolean` array to store the prime numbers. The `main` method first initializes the `boolList` array with `false` values, and then it sets the first two elements to `true` to indicate that 2 and 3 are prime numbers. It then uses a loop to set the remaining elements to `false` based on the prime number theorem. Finally, it reads the input from the user and uses a loop to print the prime numbers that are greater than or equal to the input.
