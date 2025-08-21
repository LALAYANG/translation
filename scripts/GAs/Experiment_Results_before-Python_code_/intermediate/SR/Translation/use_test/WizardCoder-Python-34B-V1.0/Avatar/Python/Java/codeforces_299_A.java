```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_inp = sc.nextInt();
        int[] arr_inp = new int[num_inp];
        for (int i = 0; i < num_inp; i++) {
            arr_inp[i] = sc.nextInt();
        }
        Arrays.sort(arr_inp);
        int gcd = arr_inp[0];
        for (int i = 1; i < num_inp; i++) {
            gcd = gcd(gcd, arr_inp[i]);
        }
        System.out.println(gcd == 1 ? arr_inp[0] : -1);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
```

Test input:
5
2 2 2 2 1000000000

Expected output:
2 
