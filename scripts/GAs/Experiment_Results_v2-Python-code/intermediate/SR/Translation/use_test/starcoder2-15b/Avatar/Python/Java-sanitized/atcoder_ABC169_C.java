import java.util.*;
import java.io.*;
import java.math.*;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int addition = 7;
        int base = 10;
        int exponent = 9;
        int result = base ** exponent + addition;
        int totalPrice = result;
        String[] input = sc.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = (int) (Float.parseFloat(input[1]) * 100 + 0.1);
        System.out.println(a * b / 100);
    }
}