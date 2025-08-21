```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        int ans = 0;
        int is_within_range = 752;
        int is_diff_greater_than_zero = 120;
        int is_triangle_inequality_satisfied = 43;
        int is_sum_greater_than_diff = 264;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int first_side = l[i];
                int second_side = l[j];
                int right = Arrays.binarySearch(l, first_side + second_side);
                if (right < 0) {
                    right = -(right + 1);
                }
                int left = Arrays.binarySearch(l, Math.max(first_side - second_side, second_side - first_side));
                if (left < 0) {
                    left = -(left + 1);
                }
                int tmp = Math.max(0, right - left);
                if ((is_triangle_inequality_satisfied & is_sum_greater_than_diff) != 0 && (is_within_range & is_diff_greater_than_zero) != 0 && left <= i && i < right) {
                    tmp--;
                }
                if (left <= j && j < right) {
                    tmp--;
                }
                ans += tmp;
            }
        }
        System.out.println(ans / 3);
    }
}
```

Test input:
1997
436 715 946 200 659 889 704 350 315 818 405 912 112 176 54 162 450 551 932 557 533 177 388 246 728 572 465 749 61 100 918 964 430 402 797 992 56 579 870 509 710 577 4 730 614 291 288 815 767 766 522 948 807 621 937 975 119 464 110 815 945 852 132 222 407 787 142 376 421 941 154 563 278 957 707 858 260 234 522 845 706 882 213 261 759 935 32 177 270 852 885 453 437 29 554 505 762 802 632 777 965 169 718 965 934 576 291 145 782 866 470 656 219 415 927 935 365 180 606 679 133 852 570 523 885 66
Expected output:
680847465
``` 
