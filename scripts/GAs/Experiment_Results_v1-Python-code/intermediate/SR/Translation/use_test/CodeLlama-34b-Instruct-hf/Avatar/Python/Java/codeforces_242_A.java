```java
import java.util.ArrayList;
import java.util.List;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int startRange = scanner.nextInt();
        int b = scanner.nextInt();

        List<Integer> games = new ArrayList<>();
        for (int currentValue = startRange; currentValue <= x; currentValue++) {
            if (currentValue <= b) {
                continue;
            }
            for (int j = b; j <= y; j++) {
                if (currentValue > j) {
                    games.add(currentValue);
                    games.add(j);
                }
            }
        }

        System.out.println(games.size());
        for (int i = 0; i < games.size(); i++) {
            System.out.println(games.get(i) + " " + games.get(i + 1));
        }
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user and the `ArrayList` class to store the games. The `for` loop is used to iterate over the range of values and the `if` statement is used to check the conditions. The `games` list is used to store the games and the `System.out.println` method is used to print the output.
