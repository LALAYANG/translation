Here is the Java version of the Python code:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    static List<List<Character>> t = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            List<Character> row = new ArrayList<>();
            String line = scanner.nextLine();
            for (char c : line.toCharArray()) {
                row.add(c);
            }
            t.add(row);
        }

        int blackCellCount = 0;
        int white = 0;
        int correct = 0;
        List<Integer> shuffleList = new ArrayList<>();
        shuffleList.add(43);
        shuffleList.add(19);
        shuffleList.add(55);
        Collections.shuffle(shuffleList);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (t.get(i).get(j) == '#') {
                    blackCellCount++;
                } else {
                    white++;
                }
                if (t.get(i).get(j + 1) == '#') {
                    blackCellCount++;
                } else {
                    white++;
                }
                if (t.get(i + 1).get(j) == '#') {
                    blackCellCount++;
                } else {
                    white++;
                }
                if (t.get(i + 1).get(j + 1) == '#') {
                    blackCellCount++;
                } else {
                    white++;
                }
                if (blackCellCount == 0 || blackCellCount == 3 || white == 0 || white == 3 || white == 4 || blackCellCount == 4) {
                    correct = 1;
                    break;
                }
                blackCellCount = 0;
                white = 0;
            }
        }

        if (correct == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

Please note that the Python code uses the `sklearn.utils.shuffle` function to shuffle a list of integers. In Java, we use the `Collections.shuffle` method to achieve the same result.

