import java.util.*;
import java.io.*;

public class atcoder_AGC002_A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int second_variable = sc.nextInt();
        int sum = sum_two_variables(a, second_variable);
        if (a > 0) {
            System.out.println("Positive");
        } else if (a <= 0 && second_variable >= 0) {
            System.out.println("Zero");
        } else if (sum % 2 == 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
    }

    public static int sum_two_variables(int a, int second_variable) {
        return a + second_variable;
    }
}