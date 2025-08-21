```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int candeleIntere = sc.nextInt();
        int b = sc.nextInt();
        int s = 0;
        int restoSciolte = 0;

        while (candeleIntere > 0 || restoSciolte >= b) {
            candeleIntere += restoSciolte / b;
            restoSciolte %= b;
            s += candeleIntere;
            restoSciolte += candeleIntere % b;
            candeleIntere /= b;
        }

        System.out.println(s);
    }
}
```
Note: In Java, the `//` operator performs integer division and returns the integer part of the result, whereas the `/` operator performs floating-point division and returns the result as a double.
