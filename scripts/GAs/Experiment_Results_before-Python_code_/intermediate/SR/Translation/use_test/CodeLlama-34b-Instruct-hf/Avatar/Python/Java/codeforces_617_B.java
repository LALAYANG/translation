```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] tokens = input.split("1");
        int count = 0;
        for (String token : tokens) {
            count += token.length() + 1;
        }
        System.out.println(count);
    }
}
```
Note: The above code assumes that the input string is a valid binary string, i.e., it only contains '0' and '1' characters. If the input string can contain other characters, you may need to modify the code accordingly.
