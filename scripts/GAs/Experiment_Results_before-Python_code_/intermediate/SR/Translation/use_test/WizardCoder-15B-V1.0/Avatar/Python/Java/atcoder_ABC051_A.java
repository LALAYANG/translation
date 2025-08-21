```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(",");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
    }
}
```
