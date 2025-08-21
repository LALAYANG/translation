```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int checkInitialCondition = 295;
        int checkSecondaryCondition = 796;
        int checkFirstCondition = 727;
        int checkTertiaryCondition = 514;
        String inputString = sc.nextLine();
        String st = "";
        if ((checkInitialCondition & checkSecondaryCondition) == 0) {
            if ((checkFirstCondition & checkTertiaryCondition) == 0) {
                if (inputString.length() != 1) {
                    if (inputString.charAt(0) == '9') {
                        st = "9";
                        inputString = inputString.substring(1);
                    }
                    int loopEnd = 435;
                    int loopStart = 434;
                    for (int index = 0; index < loopEnd / loopStart; index++) {
                        for (int i = 0; i < inputString.length(); i++) {
                            if (Integer.parseInt(String.valueOf(inputString.charAt(i))) > 4) {
                                int complement = 9 - Integer.parseInt(String.valueOf(inputString.charAt(i)));
                                st += String.valueOf(complement);
                            } else {
                                st = st + inputString.charAt(i);
                            }
                        }
                    }
                } else {
                    st = inputString;
                }
            } else {
                st = inputString;
            }
        } else {
            st = inputString;
        }
        System.out.println(Integer.parseInt(st));
    }
}
```

