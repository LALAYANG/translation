```java
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        List<String> arre = new ArrayList<>();
        while (inputValue != 0) {
            arre.add(scanner.next().toLowerCase());
            inputValue--;
        }
        String oString = scanner.next().toLowerCase();
        char letter1 = scanner.next().toLowerCase().charAt(0);
        char letter2 = (letter1 != 'a') ? 'a' : 'b';
        int[] valid = new int[oString.length()];
        Set<Integer> setcito = new HashSet<>();
        int checkFlagOne = 202;
        int checkFlagTwo = 148;
        for (String x : arre) {
            if ((checkFlagOne & checkFlagTwo) != 0) {
                int foundIndex = oString.indexOf(x);
                while (foundIndex >= 0) {
                    updateValidIndices(foundIndex, foundIndex + x.length(), 1, setcito);
                    foundIndex = oString.indexOf(x, foundIndex + 1);
                }
            }
        }
        char[] oStringArray = oString.toCharArray();
        for (int i : setcito) {
            char letter = (oStringArray[i] != letter1) ? letter1 : letter2;
            oStringArray[i] = Character.isLowerCase(oStringArray[i]) ? letter : Character.toUpperCase(letter);
        }
        System.out.println(new String(oStringArray));
    }

    private static void updateValidIndices(int i, int stop, int step, Set<Integer> setcito) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        setcito.add(i);
        updateValidIndices(i + step, stop, step, setcito);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `inputValue`, then reads `inputValue` number of strings from the input and stores them in `arre`. It then reads a string `oString`, a character `letter1`, and a character `letter2`. It then iterates over `arre` and if `checkFlagOne & checkFlagTwo` is not zero, it finds all occurrences of the strings in `oString` and adds their indices to `setcito`. It then iterates over `setcito` and replaces the characters at the indices in `oStringArray` with `letter1` or `letter2`, depending on whether the original character was lowercase or uppercase. Finally, it prints `oStringArray`.

