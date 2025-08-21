
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pya = sc.nextInt();
        String[] arre = new String[pya];
        for (int i = 0; i < pya; i++) {
            arre[i] = sc.nextLine().toLowerCase();
        }
        String oString = sc.nextLine();
        String lowString = oString.toLowerCase();
        char letter1 = sc.nextLine().charAt(0);
        char letter2 = 'a';
        if (letter1 != 'a') {
            letter2 = 'b';
        }
        boolean[] valid = new boolean[oString.length()];
        for (int i = 0; i < oString.length(); i++) {
            valid[i] = false;
        }
        for (int i = 0; i < arre.length; i++) {
            int index = lowString.indexOf(arre[i]);
            while (index >= 0) {
                for (int j = index; j < index + arre[i].length(); j++) {
                    valid[j] = true;
                }
                index = lowString.indexOf(arre[i], index + 1);
            }
        }
        char[] oStringArray = oString.toCharArray();
        for (int i = 0; i < oStringArray.length; i++) {
            if (valid[i]) {
                oStringArray[i] = letter1;
            } else {
                oStringArray[i] = letter2;
            }
        }
        String result = new String(oStringArray);
        System.out.println(result);
    }
}
```
Note that this code assumes that the input is a string, and it will print the result as a string. If you want to print the result as a list of characters, you can modify the code accordingly.
