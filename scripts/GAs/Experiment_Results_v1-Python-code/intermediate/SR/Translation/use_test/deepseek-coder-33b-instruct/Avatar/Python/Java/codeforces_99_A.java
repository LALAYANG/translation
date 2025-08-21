```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int CheckerFour = 118;
        int CheckerOne = 877;
        int CheckerTwo = 472;
        int CheckerThree = 999;

        Scanner scanner = new Scanner(System.in);
        double l = scanner.nextDouble();
        String[] lSplit = Double.toString(l).split("\\.");
        char[] ListTwo = lSplit[0].toCharArray();
        char[] ListOne = lSplit[1].toCharArray();
        int IntegerOne = Character.getNumericValue(ListOne[0]);

        if ((CheckerFour & CheckerOne) != 0) {
            if ((CheckerTwo & CheckerThree) != 0) {
                if (ListTwo[CalculateDifference(ListTwo.length, 1)] == '9') {
                    System.out.println("GOTO Vasilisa.");
                } else if (ListTwo[ListTwo.length - 1] != '9' && IntegerOne < 5) {
                    System.out.println(new String(ListTwo));
                } else {
                    ListTwo = new String(ListTwo).substring(0, ListTwo.length - 1) + (Character.getNumericValue(ListTwo[ListTwo.length - 1]) + 1);
                    System.out.println(ListTwo);
                }
            }
        }
    }

    public static int CalculateDifference(int a, int b) {
        return a - b;
    }
}
```

Please note that Java does not have a direct equivalent to Python's `input()` function. Instead, we use `Scanner` to read input from the console. Also, Java does not have a built-in decorator mechanism like Python, so the decorator function `my_decorator` is not included in the Java code.

