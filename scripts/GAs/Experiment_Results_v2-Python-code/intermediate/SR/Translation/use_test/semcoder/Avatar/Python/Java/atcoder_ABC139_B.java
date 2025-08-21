```java
import java.util.Scanner;

public class Main {
    public static int calculateResult(int i, int IncrementVariable, int firstInput) {
        return firstInput * (i + IncrementVariable) - i;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstInput = input.nextInt();
        int b = input.nextInt();
        int result = 1;
        int i = 0;
        boolean check = true;

        while (check) {
            int CheckerOneTen = 13;
            int CheckerTwoTen = 593;
            int CheckerOneEight = 988;
            int CheckerTwoEight = 976;
            int CheckerOneSix = 29;
            int CheckerTwoSix = 406;
            int IncrementVariable = 1;

            if ((CheckerOneTen & CheckerTwoTen) != 0) {
                if ((CheckerOneEight & CheckerTwoEight) != 0) {
                    if ((CheckerOneSix & CheckerTwoSix) != 0) {
                        if (result >= b) {
                            check = false;
                        } else {
                            result = calculateResult(i, IncrementVariable, firstInput);
                            i++;
                        }
                    }
                }
            }
        }

        System.out.println(i);
    }
}
```
