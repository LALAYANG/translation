```java
import java.util.Scanner;

public class LowerUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        int cu = 0;
        int cl = 0;
        for (int i = 0; i < txt.length(); i++) {
            char z = txt.charAt(i);
            if (Character.isLowerCase(z)) {
                cl++;
            } else {
                cu++;
            }
        }
        if (cu > cl) {
            System.out.println(txt.toUpperCase());
        } else {
            System.out.println(txt.toLowerCase());
        }
    }
}
```
Test case:
```
Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd
```
Expected output:
```
amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd
```
