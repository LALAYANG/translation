```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        ArrayList<int[]> games = new ArrayList<>();
        for (int i = a + 1; i <= x; i++) {
            for (int j = b + 1; j <= y; j++) {
                if (i > j) {
                    games.add(new int[]{i, j});
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

This Java code does the same thing as the Python code. It reads four integers from the standard input, then it generates all possible pairs of integers (i, j) such that i > j, i is in the range (a+1, x], and j is in the range (b+1, y]. It stores these pairs in an ArrayList and then prints the size of the ArrayList and all pairs in the ArrayList.

