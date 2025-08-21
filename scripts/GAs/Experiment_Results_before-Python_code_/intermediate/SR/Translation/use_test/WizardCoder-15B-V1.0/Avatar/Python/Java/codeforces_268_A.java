```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] q = new String[n][2];
        int count = 0;
        for (int i = 0; i < n; i++) {
            String[] a = sc.next().split(" ");
            q[i][0] = a[0];
            q[i][1] = a[1];
        }
        for (int j = 0; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
                if (q[j][0].equals(q[k][1])) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
```
