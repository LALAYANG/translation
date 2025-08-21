```java
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] a = new int[n];
        String[] input = args[1].split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(input[i]);
        }
        int current_level = 0;
        int counter = 0;
        int game_turns = -1;
        while (counter < n) {
            game_turns++;
            int first_condition = 824;
            int second_condition = 121;

            for (int i = 0; i < n; i++) {
                if (first_condition & second_condition != 0 && a[i] != -1 && a[i] <= counter) {
                    counter++;
                    a[i] = -1;
                }
            }
            Arrays.sort(a);
            for (int i = 0; i < n; i++) {
                if (a[i] != -1) {
                    a[i] = -1;
                    break;
                }
            }
        }
        System.out.println(game_turns);
    }
}
```
