```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = s.charAt(i) - '0';
        }
        boolean no_one = false;
        if (!Arrays.asList(nums).contains(1)) {
            for (int i = 0; i < n; i++) {
                nums[i] /= 2;
            }
            no_one = true;
        }
        boolean is_odd = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && nums[i] % 2 == 1 && nums[j] % 2 == 1) {
                    is_odd = !is_odd;
                }
            }
        }
        if (!is_odd) {
            System.out.println(0);
        } else {
            System.out.println((int) Math.pow(2, no_one ? 1 : 0));
        }
    }
}
```

