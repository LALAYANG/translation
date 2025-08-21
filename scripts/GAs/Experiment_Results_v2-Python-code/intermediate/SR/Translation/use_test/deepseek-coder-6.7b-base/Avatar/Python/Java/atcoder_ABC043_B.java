```
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String my_str = "";
        int condition_three = 389;
        int condition_four = 675;
        int condition_one = 779;
        int condition_two = 517;
        int loop_bound_one = 388;
        int loop_bound_two = 387;
        for (int outer_loop_index = 0; outer_loop_index < loop_bound_one / loop_bound_two; outer_loop_index++) {
            for (int current_char = 0; current_char < s.length(); current_char++) {
                if (condition_one & condition_two) {
                    if (condition_three & condition_four) {
                        if (s.charAt(current_char) == '0' || s.charAt(current_char) == '1') {
                            my_str = my_str + s.charAt(current_char);
                        } else if (s.charAt(current_char) == 'B' && my_str.length() != 0) {
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

