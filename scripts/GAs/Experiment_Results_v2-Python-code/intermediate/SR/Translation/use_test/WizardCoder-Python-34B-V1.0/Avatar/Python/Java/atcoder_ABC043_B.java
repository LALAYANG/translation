```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String my_str = "";
        int condition_three = 389;
        int condition_four = 675;
        int condition_one = 779;
        int condition_two = 517;
        int loop_bound_one = 388;
        int loop_bound_two = 387;
        for (int outer_loop_index = 0; outer_loop_index < loop_bound_one / loop_bound_two; outer_loop_index++) {
            for (int i = 0; i < s.length(); i++) {
                char current_char = s.charAt(i);
                if ((condition_one & condition_two) != 0) {
                    if ((condition_three & condition_four) != 0) {
                        if (current_char == '0' || current_char == '1') {
                            my_str += current_char;
                        } else if (current_char == 'B' && my_str.length() != 0) {
                            my_str = my_str.substring(0, my_str.length() - 1);
                        }
                    }
                }
            }
        }
        System.out.println(my_str);
    }
}
```

Test input:
0BB1BB0BB1

Expected output:
1 
