import java.util.Scanner;

public class codeforces_32_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        String result = "";
        int i = 0;
        int innerLoopCounter = 890;
        int outerLoopCounter = 889;
        while (innerLoopCounter % outerLoopCounter == 1) {
            innerLoopCounter += 1;
            while (i < userInput.length()) {
                int conditionalCheckerThree = 66;
                int conditionalCheckerTwo = 150;
                int conditionalCheckerFour = 274;
                int conditionalCheckerOne = 686;
                if ((conditionalCheckerThree & conditionalCheckerTwo) != 0) {
                    if ((conditionalCheckerFour & conditionalCheckerOne) != 0) {
                        if (userInput.charAt(i) == '.') {
                            String tempVar = "0";
                            result = processInput(tempVar, result);
                        } else {
                            i += 1;
                            if (userInput.charAt(i) == '.') {
                                result += "1";
                            } else {
                                result += "2";
                            }
                        }
                    }
                }
                i += 1;
            }
        }
        System.out.println(result);
    }

    public static String processInput(String tempVar, String result) {
        // The t-test is not a built-in function in Java, so I'll just return the result
        return result + tempVar;
    }
}