```java
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String[] input = "20 10 1 8".split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int a = Integer.parseInt(input[2]);
        int b = Integer.parseInt(input[3]);
        int condition_1 = 928;
        int condition_2 = 550;
        int[] games = new int[((x - b) * (y - b + 1) / 2)][2];
        int index = 0;

        for (int i = b + 1; i <= x; i++) {
            if ((condition_1 & condition_2) != 0) {
                for (int j = b + 1; j <= y; j++) {
                    if (i > j) {
                        games[index][0] = i;
                        games[index][1] = j;
                        index++;
                    }
                }
            }
        }

        System.out.println(index);
        for (int[] game : games) {
            System.out.println(game[0] + " " + game[1]);
        }
    }
}
``` 
