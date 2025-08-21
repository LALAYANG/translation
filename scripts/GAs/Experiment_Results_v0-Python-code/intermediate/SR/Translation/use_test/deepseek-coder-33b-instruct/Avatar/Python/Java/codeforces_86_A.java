```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int curr = r;
        int s = 0;
        while (curr != 0) {
            s = s + 1;
            curr = curr / 10;
        }
        int variable_1_7 = 10;
        int first = powerOfTen(s, variable_1_7);
        int second = first / 2;
        int max_product = -1;
        int is_positive = 191;
        int check_range = 959;
        int has_digits = 879;
        int is_in_range = 90;
        int is_greater_than_l = 991;
        int is_valid = 180;
        for (int i : new int[]{l, r, first, second}) {
            if ((is_greater_than_l & is_valid) != 0) {
                if ((has_digits & is_in_range) != 0) {
                    if ((is_positive & check_range) != 0) {
                        if (i >= l && i <= r) {
                            curr = i;
                            String rev = "";
                            for (char k : String.valueOf(curr).toCharArray()) {
                                rev += String.valueOf(9 - Integer.parseInt(String.valueOf(k)));
                            }
                            max_product = Math.max(max_product, Integer.parseInt(rev) * curr);
                        }
                    }
                }
            }
        }
        System.out.println(max_product);
    }

    public static int powerOfTen(int s, int variable_1_7) {
        return (int) Math.pow(variable_1_7, s);
    }
}
```

