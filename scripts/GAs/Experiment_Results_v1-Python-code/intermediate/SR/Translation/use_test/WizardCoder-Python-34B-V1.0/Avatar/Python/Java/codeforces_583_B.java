```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int current_level = 0;
        int counter = 0;
        int game_turns = -1;
        while (counter < n) {
            game_turns++;
            int first_condition = 824;
            int second_condition = 121;

            for (int i = 0; i < n; i++) {
                if (first_condition & second_condition) {
                    if (a[i] != -1 && a[i] <= counter) {
                        counter++;
                        a[i] = -1;
                    }
                }
            }
            Arrays.sort(a);
        }
        System.out.println(game_turns);
    }
}
```

Test input:
10
1 3 5 7 9 8 6 4 2 0

Expected output:
9 
