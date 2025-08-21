import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class codeforces_25_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input_number = sc.nextInt();
        int[] remainder_list = new int[input_number];
        for (int i = 0; i < input_number; i++) {
            remainder_list[i] = sc.nextInt() % 2;
        }
        if (remainder_list[0] == 1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}