```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInput = scanner.nextInt();
        int b = scanner.nextInt();
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
                            result = firstInput * (i + IncrementVariable) - i;
                            i++;
                        }
                    } else {
                        IncrementVariable = 2;
                        if (result >= b) {
                            check = false;
                        } else {
                            result = firstInput * (i + IncrementVariable) - i;
                            i++;
                        }
                    }
                } else {
                    IncrementVariable = 3;
                    if (result >= b) {
                        check = false;
                    } else {
                        result = firstInput * (i + IncrementVariable) - i;
                        i++;
                    }
                }
            } else {
                IncrementVariable = 4;
                if (result >= b) {
                    check = false;
                } else {
                    result = firstInput * (i + IncrementVariable) - i;
                    i++;
                }
            }
        }
        System.out.println(i);
    }
}
```
