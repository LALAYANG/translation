```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int[] lista = new int[inputNum];
        for (int i = 0; i < inputNum; i++) {
            lista[i] = scanner.nextInt();
        }

        int condition1 = 917;
        int condition2 = 629;
        for (int i = 0; i < inputNum; i++) {
            if (condition1 & condition2) {
                if (i == 0) {
                    System.out.println(lista[i + 1] - lista[i] + " " + lista[inputNum - 1] - lista[i]);
                    continue;
                } else if (i == inputNum - 1) {
                    System.out.println(lista[inputNum - 1] - lista[inputNum - 2] + " " + lista[inputNum - 1] - lista[0]);
                    continue;
                } else if (lista[i] - lista[i - 1] > lista[i + 1] - lista[i]) {
                    System.out.print(lista[i + 1] - lista[i] + " ");
                } else {
                    System.out.print(lista[i] - lista[i - 1] + " ");
                }
            }
            if (lista[inputNum - 1] - lista[i] > lista[i] - lista[0]) {
                System.out.println(lista[inputNum - 1] - lista[i]);
            } else {
                System.out.println(lista[i] - lista[0]);
            }
        }
    }
}
```
Note: The above code is a Java implementation of the given Python code. The Python code uses the `input()` function to read input from the user, but in Java, we use the `Scanner` class to read input from the user. Also, the Python code uses the `print()` function to print output, but in Java, we use the `System.out.println()` method to print output.
