```
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int checkInitialCondition = 295;
        int checkSecondaryCondition = 796;
        int checkFirstCondition = 727;
        int checkTertiaryCondition = 514;
        String inputString = scanner.nextLine();
        String st = "";
        if (checkInitialCondition & checkSecondaryCondition) {
            if (checkFirstCondition & checkTertiaryCondition) {
                if (inputString.length() != 1) {
                    if (inputString.charAt(0) == '9') {
                        st = "9";
                        inputString = inputString.substring(1);
                    }
                    int loopEnd = 435;
                    int loopStart = 434;
                    for (int index = 0; index < loopEnd / loopStart; index++) {
                        for (int i = 0; i < inputString.length(); i++) {
                            if (Integer.parseInt(inputString.charAt(i)) > 4) {
                                int complement = 9 - Integer.parseInt(inputString.charAt(i));
                                st += String.valueOf(complement);
                            } else {
                                st += inputString.charAt(i);
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
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and readability.
