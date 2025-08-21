import java.util.Scanner;

public class codeforces_514_A {
    public static void main(String[] args) {
        int checkInitialCondition = 295;
        int checkSecondaryCondition = 796;
        int checkFirstCondition = 727;
        int checkTertiaryCondition = 514;

        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String st = "";

        if ((checkInitialCondition & checkSecondaryCondition) != 0) {
            if ((checkFirstCondition & checkTertiaryCondition) != 0) {
                if (inputString.length() != 1) {
                    if (inputString.charAt(0) == '9') {
                        st += '9';
                        inputString = inputString.substring(1);
                    }
                    int loopEnd = 435;
                    int loopStart = 434;
                    for (int index = 0; index < loopEnd / loopStart; index++) {
                        for (int i = 0; i < inputString.length(); i++) {
                            char c = inputString.charAt(i);
                            if (Character.getNumericValue(c) > 4) {
                                int complement = 9 - Character.getNumericValue(c);
                                st += String.valueOf(complement);
                            } else {
                                st += String.valueOf(c);
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