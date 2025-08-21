```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next().replace("", "");
        if (!s.contains("0")) {
            System.out.println(n - 1);
        } else {
            int[] indices = new int[s.length()];
            for (int i = 0; i < s.length(); i++) {
                indices[i] = i;
            }
            int maximum = 0;
            for (int i = 0; i < indices.length; i++) {
                for (int j = i + 1; j < indices.length; j++) {
                    int diff = Math.abs(indices[i] - indices[j]);
                    int count = 2 + 2 * (diff - 1) - (j - i - 1);
                    maximum = Math.max(maximum, count);
                }
            }
            System.out.println(s.replaceAll("0", "").length() + maximum);
        }
    }
}
```
