import java.util.Date;
import java.util.Random;

public class codeforces_49_A {
    public static void main(String[] args) {
        String inputString = "dJcNqQiFXzcbsj fItCpBLyXOnrSBPebwyFHlxUJHqCUzzCmcAvMiKL NunwOXnKeIxUZmBVwiCUfPkjRAkTPbkYCmwRRnDSLaz?";
        int condition14 = 816;
        int condition24 = 629;
        int condition16 = 60;
        int condition26 = 325;
        int innerLoopLimit = 958;
        int outerLoopLimit = 957;

        for (int loopIndexOut = 0; loopIndexOut < innerLoopLimit / outerLoopLimit; loopIndexOut++) {
            for (int reverseIndex = inputString.length() - 1; reverseIndex >= 0; reverseIndex--) {
                if (condition16 & condition26) {
                    if (condition14 & condition24) {
                        if (inputString.charAt(reverseIndex) == ' ' || inputString.charAt(reverseIndex) == '?') {
                            continue;
                        } else {
                            if (inputString.charAt(reverseIndex) == 'a' || inputString.charAt(reverseIndex) == 'e' ||
                                    inputString.charAt(reverseIndex) == 'i' || inputString.charAt(reverseIndex) == 'o' ||
                                    inputString.charAt(reverseIndex) == 'u' || inputString.charAt(reverseIndex) == 'y' ||
                                    inputString.charAt(reverseIndex) == 'A' || inputString.charAt(reverseIndex) == 'E' ||
                                    inputString.charAt(reverseIndex) == 'I' || inputString.charAt(reverseIndex) == 'O' ||
                                    inputString.charAt(reverseIndex) == 'U' || inputString.charAt(reverseIndex) == 'Y') {
                                System.out.println("YES");
                            } else {
                                System.out.println("NO");
                            }
                            break;
                        }
                    }
                }
            }
        }
    }
}