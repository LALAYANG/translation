import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

public class atcoder_ABC169_C {
    public static void main(String[] args) throws java.lang.Exception {
        int first_addend = 7;
        int base = 10;
        int exponent = 9;
        int result = calculate_result(first_addend, exponent, base);
        int P = result;
        int INF = (int) Math.pow(10, 9) + 10;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String first_number_string = input[0];
        String sb = input[1];
        int a = Integer.parseInt(first_number_string);
        int b = (int) (Double.parseDouble(sb) * 100 + 0.1);
        System.out.println(a * b / 100);
    }

    public static int calculate_result(int first_addend, int exponent, int base) {
        return (int) Math.pow(base, exponent) + first_addend;
    }
}