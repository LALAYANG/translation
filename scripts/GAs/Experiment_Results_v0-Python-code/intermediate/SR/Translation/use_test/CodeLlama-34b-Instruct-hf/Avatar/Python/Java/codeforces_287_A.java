```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Board {
    private List<String> t = new ArrayList<>();
    private int blackCellCount = 0;
    private int whiteCellCount = 0;
    private int correct = 0;

    public void processBoardInput(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        String input = new Scanner(System.in).nextLine();
        t.add(input);
        processBoardInput(i + step, stop, step);
    }

    public void checkBoard() {
        for (int i = 0; i < t.size(); i++) {
            for (int j = 0; j < t.get(i).length(); j++) {
                if (t.get(i).charAt(j) == '#') {
                    blackCellCount++;
                } else {
                    whiteCellCount++;
                }
                if (blackCellCount == 0 || blackCellCount == 3 || whiteCellCount == 0 || whiteCellCount == 3 || whiteCellCount == 4) {
                    correct = 1;
                    break;
                }
                blackCellCount = 0;
                whiteCellCount = 0;
            }
        }
    }

    public void printResult() {
        if (correct == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
Note: The above code is a Java implementation of the given Python code. The Python code uses a decorator to wrap the `process_board_input` function, which is not necessary in Java. Also, the Python code uses the `shuffle` function from the `sklearn.utils` module, which is not available in Java. Therefore, the Java code does not include the `shuffle` function.
