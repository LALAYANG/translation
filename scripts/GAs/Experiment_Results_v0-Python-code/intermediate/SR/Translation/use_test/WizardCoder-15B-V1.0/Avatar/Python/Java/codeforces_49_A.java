```java
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PythonToJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input_string = scanner.nextLine();
        Random random = new Random();
        int[] arr = {49, 40, 94};
        shuffle(arr, random);
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};
        int condition_14 = 816;
        int condition_24 = 629;
        ttest_ind(new double[]{52, 70, 52}, new double[]{93, 9, 80});
        int condition_16 = 60;
        datetime.datetime.now();
        int condition_26 = 325;
        int inner_loop_limit = 958;
        int outer_loop_limit = 957;
        for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_limit / outer_loop_limit; LoopIndexOut++) {
            for (int reverse_index = input_string.length() - 1; reverse_index >= 0; reverse_index--) {
                if ((condition_16 & condition_26) != 0) {
                    if ((condition_14 & condition_24) != 0) {
                        if (input_string.charAt(reverse_index) == ' ' || input_string.charAt(reverse_index) == '?') {
                            continue;
                        } else {
                            boolean isVowel = false;
                            for (char vowel : vowels) {
                                if (input_string.charAt(reverse_index) == vowel) {
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
