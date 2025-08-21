Here is the Java version of your Python code:

```java
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        ArrayList<Integer> NewList = new ArrayList<>();
        for (String s : input) {
            NewList.add(Integer.parseInt(s));
        }
        int CheckerOne = 289;
        int CheckerThree = 475;
        int CheckerTwo = 828;
        int CheckerFive = 409;
        int CheckerFour = 430;
        int CheckerSeven = 909;
        for (int i = 0; i < NewList.size(); i++) {
            if ((CheckerFour & CheckerSeven) != 0) {
                if ((CheckerTwo & CheckerFive) != 0) {
                    if ((CheckerOne & CheckerThree) != 0) {
                        if (NewList.get(i) == 0) {
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

This Java code does the same thing as your Python code. It reads a line of input, splits it into an array of strings, converts each string to an integer, and adds the integers to an ArrayList. It then iterates over the ArrayList, checking the conditions in your Python code and printing the index of the first item that meets the conditions.

Please note that the ttest_ind function from scipy is not available in Java. If you need to perform a t-test, you would need to implement it yourself or use a library that provides this functionality.

