```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String soz = sc.nextLine();
        int[] a = new int[soz.length() + 1];
        for (int i = 1; i < soz.length(); i++) {
            a[i] = a[i - 1];
            if (soz.charAt(i - 1) == soz.charAt(i)) {
                a[i]++;
            }
        }
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            String[] ml = sc.nextLine().split(" ");
            int m = Integer.parseInt(ml[0]);
            int l = Integer.parseInt(ml[1]);
            arr[i] = a[l - 1] - a[m - 1];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
```
Note: In the Java code, I have used `Scanner` class to read input from the user. You can also use `BufferedReader` class to read input from the user.
