```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result_string = "";
        int condition_check_1 = 909;
        int condition_check_2 = 642;
        int condition_check_3 = 112;
        int condition_check_4 = 209;
        int outer_loop_limit = 108;
        int inner_loop_limit = 107;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < s.length(); i++) {
                if (condition_check_3 & condition_check_4) {
                    if (condition_check_1 & condition_check_2) {
                        if (s.charAt(i) == '0' || s.charAt(i) == '1') {
                            result_string = result_string + s.charAt(i);
                        } else if (s.charAt(i) == 'B' && result_string.length() != 0) {
                            result_string = result_string.substring(0, result_string.length() - 1);
                        }
                    }
                }
            }
        }
        System.out.println(result_string);
    }
}
```

