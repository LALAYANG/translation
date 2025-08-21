```
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] userInput = new int[3];
        for (int i = 0; i < 3; i++) {
            userInput[i] = scanner.nextInt();
        }
        if (userInput[0] == 7 && userInput[1] == 5 && userInput[2] == 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

