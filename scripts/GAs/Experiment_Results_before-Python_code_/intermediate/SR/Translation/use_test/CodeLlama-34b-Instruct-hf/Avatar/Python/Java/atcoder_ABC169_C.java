```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] sa = scanner.nextLine().split(" ");
        int a = Integer.parseInt(sa[0]);
        int b = (int) (Float.parseFloat(sa[1]) * 100 + 0.1);
        System.out.println(a * b / 100);
    }
}
```
Note: In Java, we use the `Scanner` class to read input from the user. We also use the `Integer.parseInt()` method to convert a string to an integer, and the `Float.parseFloat()` method to convert a string to a float. Finally, we use the `/` operator to perform integer division and get the result as an integer.
