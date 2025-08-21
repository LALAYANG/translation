```java
import java.util.*;

public class Main {
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
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split(" ");
            int m = Integer.parseInt(line[0]);
            int l = Integer.parseInt(line[1]);
            arr.add(a[l - 1] - a[m - 1]);
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
```
