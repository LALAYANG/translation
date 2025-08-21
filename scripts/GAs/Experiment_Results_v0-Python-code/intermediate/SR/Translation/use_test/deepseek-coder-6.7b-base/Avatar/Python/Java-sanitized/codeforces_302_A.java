import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class codeforces_302_A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num_elements = in.nextInt();
        int num_queries = in.nextInt();
        int sa = in.nextInt();
        int[] arr = new int[num_elements];
        for(int arr_i=0; arr_i < num_elements; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < num_queries; a0++){
            int value_a = in.nextInt();
            int b = in.nextInt();
            int result = subtract(b, value_a);
            int result1 = subtract_numbers(value_a, b);
            b = result1;
            System.out.println((b % 2 == 1 && b <= sa * 2) ? 1 : 0);
        }
    }

    public static int subtract(int arg0, int arg1) {
        return arg0 - arg1;
    }

    public static int subtract_numbers(int arg1, int arg2) {
        return arg1 - arg2;
    }
}