import java.util.Scanner;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int condition_one = 319;
        int condition_six = 353;
        int condition_two = 400;
        int condition_five = 725;
        int condition_three = 204;
        int condition_four = 645;
        int user_input = scanner.nextInt();
        String[] preset_values = {"10", "100", "1000", "10000", "100000"};
        int new = 0;
        for (int i = 0; i < user_input.length(); i++) {
            new += user_input.charAt(i) - '0';
        }
        if (condition_one & condition_six) {
            if (condition_two & condition_five) {
                if (condition_three & condition_four) {
                    if (user_input in preset_values) {
                        System.out.println(10);
                    } else {
                        System.out.println(new);
                    }
                }
            }
        }
    }
}