import java.util.Scanner;

public class codeforces_514_A {
    public static void main(String[] args) {
        int checkInitialCondition = 295;
        int checkSecondaryCondition = 796;
        int checkFirstCondition = 727;
        int checkTertiaryCondition = 514;

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        StringBuilder st = new StringBuilder();

        if ((checkInitialCondition & checkSecondaryCondition) != 0) {
            if ((checkFirstCondition & checkTertiaryCondition) != 0) {
                if (inputString.length() != 1) {
                    if (inputString.charAt(0) == '9') {
                        st.append('9');
                        inputString = inputString.substring(1);
                    }
                    int loopEnd = 435;
                    int loopStart = 434;
                    for (int index = 0; index < loopEnd / loopStart; index++) {
                        for (char c : inputString.toCharArray()) {
                            if (c > '4') {
                                st.append((char) ('9' - c));
                            } else {
                                st.append(c);
                            }
                        }
                    }
                } else {
                    st.append(inputString);
                }
            } else {
                st.append(inputString);
            }
        }

        System.out.println(Integer.parseInt(st.toString()));
    }
}