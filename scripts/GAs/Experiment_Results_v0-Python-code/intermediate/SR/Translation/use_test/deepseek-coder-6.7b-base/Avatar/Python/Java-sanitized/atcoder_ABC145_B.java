import java.util.Scanner;

public class atcoder_ABC145_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input_number = sc.nextInt();
        String input_string = sc.next();
        if (input_number % 2 != 0) {
            System.out.println("No");
        } else {
            String first_half = input_string.substring(0, input_number / 2);
            String second_half = input_string.substring(input_number / 2);
            if (first_half.equals(second_half)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}