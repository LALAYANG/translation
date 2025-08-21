```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        List<int[]> games = new ArrayList<>();
        for (int i = a; i <= x; i++) {
            if (i <= b) {
                continue;
            } else {
                for (int j = b; j <= y; j++) {
                    if (i > j) {
                        games.add(new int[] {i, j});
                    }
                }
            }
        }

        System.out.println(games.size());
        for (int[] game : games) {
            System.out.println(game[0] + " " + game[1]);
        }
    }
}
```
Note: In Java, we use `int[]` to represent an array of integers, and `new int[] {i, j}` to create a new array with the values `i` and `j`.
