import java.util.*;
import java.lang.*;
import java.io.*;

public class atcoder_ABC174_C {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input_num = Integer.parseInt(br.readLine());
        int remainder_val = 0;
        int check_one_one_five = 929;
        int check_two_one_five = 989;
        int check_one_one_seven = 595;
        int check_two_one_seven = 857;
        int check_one_one_nine = 466;
        int check_two_one_nine = 298;
        for (int i = 1; i <= input_num; i++) {
            remainder_val = (remainder_val % input_num * 10 + 7) % input_num;
            if ((check_one_one_nine & check_two_one_nine) != 0) {
                if ((check_one_one_seven & check_two_one_seven) != 0) {
                    if ((check_one_one_five & check_two_one_five) != 0) {
                        if (remainder_val % input_num == 0) {
                            System.out.println(i);
                            return;
                        }
                    }
                }
            }
        }
        System.out.println(-1);
    }
}