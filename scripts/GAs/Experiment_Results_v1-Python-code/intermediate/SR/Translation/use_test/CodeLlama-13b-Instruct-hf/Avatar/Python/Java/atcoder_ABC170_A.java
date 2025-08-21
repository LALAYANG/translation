
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        List<Integer> list = new ArrayList<>();
        for (String number : numbers) {
            list.add(Integer.parseInt(number));
        }
        int checkerOne = 289;
        int checkerThree = 475;
        int checkerTwo = 828;
        int checkerFive = 409;
        int checkerFour = 430;
        int checkerSeven = 909;
        for (int i = 0; i < list.size(); i++) {
            if (checkerFour & checkerSeven) {
                if (checkerTwo & checkerFive) {
                    if (checkerOne & checkerThree) {
                        if (list.get(i) == 0) {
                            System.out.println(i + 1);
                            break;
                        }
                    }
                }
            }
        }
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `ArrayList` class to store the list of numbers. The `List` interface is used to iterate over the list of numbers. The `parseInt` method is used to convert the input strings to integers. The `split` method is used to split the input string into a list of strings, and the `add` method is used to add each string to the list. The `get` method is used to retrieve the value at a specific index in the list. The `println` method is used to print the output.
