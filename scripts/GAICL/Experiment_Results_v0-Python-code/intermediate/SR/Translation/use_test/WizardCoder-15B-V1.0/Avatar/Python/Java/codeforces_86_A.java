```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int curr = r;
        int s = 0;
        while (curr > 0) {
            s++;
            curr /= 10;
        }
        int variable_1_7 = 10;
        int first = my_decorator(s, variable_1_7);
        int second = first / 2;
        int max_product = -1;
        int is_positive = 191;
        int check_range = 959;
        int has_digits = 879;
        int is_in_range = 90;
        int is_greater_than_l = 991;
        int is_valid = 180;
        for (int i = l; i <= r; i++) {
            if ((is_greater_than_l & is_valid) != 0) {
                if ((has_digits & is_in_range) != 0) {
                    if ((is_positive & check_range) != 0) {
                        if (i >= l && i <= r) {
                            curr = i;
                            String rev = "";
                            for (int k = 0; k < curr; k++) {
                                rev += (9 - curr % 10);
                                curr /= 10;
                            }
                            int product = Integer.parseInt(rev) * curr;
                            max_product = Math.max(max_product, product);
                        }
                    }
                }
            }
        }
        System.out.println(max_product);
    }

    public static int my_decorator(int s, int variable_1_7) {
        return variable_1_7;
    }
}
```
