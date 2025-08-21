```java
import java.util.Base64;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        Random random = new Random();
        int[] arr = {49, 40, 94};
        shuffle(arr, random);
        String[] vowels = {"a", "e", "i", "o", "u", "y", "A", "E", "I", "O", "U", "Y"};
        int condition14 = 816;
        int condition24 = 629;
        ttest_ind(new double[]{52, 70, 52}, new double[]{93, 9, 80});
        int condition16 = 60;
        int condition26 = 325;
        int innerLoopLimit = 958;
        int outerLoopLimit = 957;
        for (int i = 0; i < innerLoopLimit / outerLoopLimit; i++) {
            for (int j = inputString.length() - 1; j >= 0; j--) {
                if ((condition16 & condition26) != 0) {
                    if ((condition14 & condition24) != 0) {
                        if (inputString.charAt(j) == ' ' || inputString.charAt(j) == '?') {
                            continue;
                        } else {
                            boolean isVowel = false;
                            for (String vowel : vowels) {
                                if (inputString.charAt(j) == vowel.charAt(0)) {
                                    isVowel = true;
                                    break;
                                }
                            }
                            if (isVowel) {
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
```
