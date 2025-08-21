```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int candeleIntere = scanner.nextInt();
        int b = scanner.nextInt();
        int s = 0;
        int restoSciolte = 0;
        while (candeleIntere > 0 || restoSciolte >= b) {
            candeleIntere += restoSciolte / b;
            restoSciolte %= b;
            s += candeleIntere;
            restoSciolte += candeleIntere % b;
            candeleIntere /= b;
        }
        System.out.println(s);
    }
}
```
Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `while` loop is used to iterate until the condition `candeleIntere > 0 || restoSciolte >= b` is false.
* The `candeleIntere += restoSciolte / b` statement is used to update the value of `candeleIntere` based on the value of `restoSciolte`.
* The `restoSciolte %= b` statement is used to update the value of `restoSciolte` based on the value of `b`.
* The `s += candeleIntere` statement is used to update the value of `s` based on the value of `candeleIntere`.
* The `restoSciolte += candeleIntere % b` statement is used to update the value of `restoSciolte` based on the value of `candeleIntere`.
* The `candeleIntere /= b` statement is used to update the value of `candeleIntere` based on the value of `b`.
* The `System.out.println(s)` statement is used to print the final value of `s`.

Note: The code is written in Java 8, so you may need to modify it to work with earlier versions of Java.
