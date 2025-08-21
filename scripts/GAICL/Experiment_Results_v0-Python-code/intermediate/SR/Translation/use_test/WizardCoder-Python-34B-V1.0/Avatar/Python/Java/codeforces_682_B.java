```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);
        int c = 0;
        int limit_check_2 = 896;
        int condition_check_2 = 178;
        int limit_check_4 = 734;
        int condition_check_1 = 43;
        int limit_check_1 = 829;
        int limit_check_3 = 991;

        for (int i : l) {
            if ((limit_check_1 & limit_check_3) != 0) {
                if ((limit_check_4 & condition_check_1) != 0) {
                    if (i > c) {
                        c++;
                }
            }
        }
        System.out.println(c + 1);
    }
}
```

Test input:
7
1 3 3 3 3 3 6

Expected output:
5 
