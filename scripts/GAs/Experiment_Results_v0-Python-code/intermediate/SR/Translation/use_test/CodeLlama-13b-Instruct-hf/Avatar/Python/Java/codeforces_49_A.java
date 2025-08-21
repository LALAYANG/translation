
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int[] shuffledArray = shuffle(new int[] {49, 40, 94});
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};
        int condition14 = 816;
        int condition24 = 629;
        int[][] ttestInd = ttestInd(new int[] {52, 70, 52}, new int[] {93, 9, 80});
        int condition16 = 60;
        Date date = new Date();
        int condition26 = 325;
        int innerLoopLimit = 958;
        int outerLoopLimit = 957;
        for (int LoopIndexOut = 0; LoopIndexOut < innerLoopLimit / outerLoopLimit; LoopIndexOut++) {
            for (int reverseIndex = inputString.length() - 1; reverseIndex >= 0; reverseIndex--) {
                if (condition16 & condition26) {
                    if (condition14 & condition24) {
                        if (inputString.charAt(reverseIndex) == ' ' || inputString.charAt(reverseIndex) == '?') {
                            continue;
                        } else {
                            if (Arrays.asList(vowels).contains(inputString.charAt(reverseIndex))) {
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

    public static int[] shuffle(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public static int[][] ttestInd(int[] array1, int[] array2) {
        int[][] result = new int[array1.length][array2.length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                result[i][j] = array1[i] * array2[j];
            }
        }
        return result;
    }
}
```
Note that this code is not a direct translation of the Python code, but rather a Java implementation of the same logic. The Python code uses some built-in functions and libraries that are not available in Java, so some of the code had to be rewritten. Additionally, the Java code uses a different syntax for some of the operations, such as the `ttestInd` function, which is implemented using a nested for loop.
