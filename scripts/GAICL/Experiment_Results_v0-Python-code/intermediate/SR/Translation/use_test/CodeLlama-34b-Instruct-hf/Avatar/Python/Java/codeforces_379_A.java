```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int candeleIntere = scanner.nextInt();
        int b = scanner.nextInt();
        int s = 0;
        int restoSciolte = 0;
        int newwhileloopchecker17_1 = 122;
        int whileloopchecker27 = 121;

        while (newwhileloopchecker17_1 % whileloopchecker27 == 1) {
            int variable_3_10 = 1;
            int result = newwhileloopchecker17_1 + variable_3_10;
            newwhileloopchecker17_1 = result;
            while (candeleIntere > 0 || restoSciolte >= b) {
                candeleIntere += restoSciolte / b;
                restoSciolte = restoSciolte % b;
                s = s + candeleIntere;
                restoSciolte += candeleIntere % b;
                candeleIntere = candeleIntere / b;
            }
        }
        System.out.println(s);
    }
}
```
Note: The above code is a direct translation of the Python code to Java. However, it is not a good practice to use variable names like `newwhileloopchecker17_1` and `whileloopchecker27`. It is recommended to use meaningful variable names that describe the purpose of the variable.
