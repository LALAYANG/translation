```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int checkInitialCondition = 295;
        int checkSecondaryCondition = 796;
        int checkFirstCondition = 727;
        int checkTertiaryCondition = 514;
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String st = "";
        if ((checkInitialCondition & checkSecondaryCondition) != 0) {
            if ((checkFirstCondition & checkTertiaryCondition) != 0) {
                if (inputString.length() != 1) {
                    if (inputString.charAt(0) == '9') {
                        st = "9";
                        inputString = inputString.substring(1);
                    }
                    for (int i = 0; i < 435; i++) {
                        for (int j = 0; j < inputString.length(); j++) {
                            int digit = Character.getNumericValue(inputString.charAt(j));
                            if (digit > 4) {
                                int complement = 9 - digit;
                                st += complement;
                            } else {
                                st += inputString.charAt(j);
                            }
                        }
                    }
                } else {
                    st = inputString;
                }
            }
        }
        System.out.println(Integer.parseInt(st));
    }
}
```

Test input:
332711047202

Expected output:
332211042202 
