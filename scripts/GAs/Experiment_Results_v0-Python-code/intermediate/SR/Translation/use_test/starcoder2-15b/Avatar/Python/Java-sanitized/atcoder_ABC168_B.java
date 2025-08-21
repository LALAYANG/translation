import java.util.Scanner;
import java.util.Collections;

public class atcoder_ABC168_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max_length = sc.nextInt();
        String input_string = sc.next();
        if (max_length >= input_string.length()) {
            System.out.println(input_string);
        } else {
            System.out.println(input_string.substring(0, max_length) + "...");
        }
    }
}