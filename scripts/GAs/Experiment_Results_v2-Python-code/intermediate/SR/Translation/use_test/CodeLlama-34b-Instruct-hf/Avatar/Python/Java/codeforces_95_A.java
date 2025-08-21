```java
import java.util.Scanner;
import java.util.Queue;
import java.util.Set;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pya = sc.nextInt();
        String[] arre = new String[pya];
        for (int i = 0; i < pya; i++) {
            arre[i] = sc.next();
        }
        String inputString = sc.next();
        String lowString = inputString.toLowerCase();
        char letter1 = sc.next().charAt(0);
        char letter2 = 'a';
        if (letter1 != 'a') {
            letter2 = 'b';
        }
        Set<Integer> setcito = new HashSet<>();
        int checkFlagOne = 962;
        int checkFlagTwo = 449;
        for (String x : arre) {
            if (checkFlagOne & checkFlagTwo) {
                if (lowString.contains(x)) {
                    int wat = 0;
                    while (true) {
                        int index = lowString.indexOf(x, wat);
                        if (index < 0) {
                            break;
                        }
                        setcito.add(index);
                        wat = index + 1;
                    }
                }
            }
        }
        char[] inputStringArray = inputString.toCharArray();
        for (int i : setcito) {
            char letter = letter1;
            if (lowString.charAt(i) != letter1) {
                letter = letter2;
            }
            inputStringArray[i] = letter;
        }
        for (char x : inputStringArray) {
            System.out.print(x);
        }
        System.out.println();
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient solution.
