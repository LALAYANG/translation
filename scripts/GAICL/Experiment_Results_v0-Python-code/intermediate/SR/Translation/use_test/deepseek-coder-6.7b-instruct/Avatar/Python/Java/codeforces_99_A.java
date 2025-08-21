```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputParts = input.split("\\.");
        String integerPart = inputParts[0];
        String decimalPart = inputParts[1];
        int i = Integer.parseInt(String.valueOf(decimalPart.charAt(0)));

        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 31, 1, 44);
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 71, 69, 27);

        if ((check1 & check2) > 0 && (check1a & check2a) > 0) {
            if (integerPart.charAt(difference(integerPart.length(), 1) == '9')) {
                System.out.println("GOTO Vasilisa.");
            } else if (integerPart.charAt(integerPart.length() - 1) != '9' && i < 5) {
                System.out.println(integerPart);
            } else {
                int num = Integer.parseInt(integerPart) + 1;
                System.out.println(num);
            }
        }
    }

    static int check1 = 488;
    static int check2 = 752;
    static int check1a = 85;
    static int check2a = 98;

    static int difference(int a, int b) {
        return a - b;
    }
}
```

Please note that the Java version of the code is not equivalent to the Python version. The Python code uses some libraries (scipy and sklearn) that are not available in Java. Also, the Python code uses a decorator which is not necessary in this context and is not translated. The Java version does not use these features.

