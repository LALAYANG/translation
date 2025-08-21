```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> initialList = new ArrayList<>();
        initialList.add(0);
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            if (input == 1) {
                resultList.add(i);
            }
        }
        System.out.println(resultList.size());
        for (int i = 0; i < resultList.size(); i++) {
            System.out.print(resultList.get(i) + " ");
        }
    }
}
```
Explanation:

The code is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user and the `ArrayList` class to store the input.

The `main` method first reads the number of inputs from the user and stores it in the `n` variable. It then creates an empty `ArrayList` called `initialList` and adds the value `0` to it.

The code then enters a loop that runs `n` times. In each iteration, it reads an input from the user using the `nextInt` method of the `Scanner` class and stores it in the `input` variable. If the input is equal to `1`, the code adds the current index `i` to the `resultList` `ArrayList`.

After the loop finishes, the code prints the size of the `resultList` and then prints the elements of the `resultList` separated by spaces.

Note that the code assumes that the input will be a valid integer. If the input is not a valid integer, the code will throw a `InputMismatchException`.
