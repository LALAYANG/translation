```java
import java.util.Scanner;

public class Main {
    public static int twosInFactorial(int n) {
        int count = 0;
        while (n > 0) {
            n >>= 1;
            count += n;
        }
        return count;
    }

    public static boolean parityOfNCr(int n, int i) {
        return twosInFactorial(n) - twosInFactorial(n - i) - twosInFactorial(i) > 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        String[] input = scanner.next().split(" ");
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(input[i]) - 1;
        }
        boolean noOne = true;
        if (nums[0] != 1) {
            for (int i = 0; i < n; i++) {
                nums[i] /= 2;
            }
            noOne = true;
        }
        boolean isOdd = false;
        for (int i = 0; i < n; i++) {
            if (!parityOfNCr(n - 1, i) && nums[i] % 2 == 1) {
                isOdd = !isOdd;
            }
        }
        if (!isOdd) {
            System.out.println(0);
        } else {
            System.out.println(1 << noOne ? 1 : 0);
        }
    }
}
```

Test input:
524288
113111333131313313111311113133131331131311313333331111113311111311333311331131313311131113331133111311313131133113113333113331133333133131131113111111331113313113111333331313131311333133113131331111131113331133333333331131111333333131331333331333113131313133133111111333331313111131133331133111131131311331111133113311333113113333133113331333333131133313313133313331311331113311333133313333331313311111331133313131131133133313331133333133311313331131331133131333133111113333313131111311333111311113113131133111113311331133311311333313311313331333333
Expected output:
0
``` 
