```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String result = (s.contains("A") && s.contains("B")) ? "Yes" : "No";
        System.out.println(result);
    }
}
```

In this Java code, we use the `Scanner` class to read the input string. The `contains` method is used to check if the string contains "A" and "B". If both are present, the result is "Yes", otherwise it's "No".

