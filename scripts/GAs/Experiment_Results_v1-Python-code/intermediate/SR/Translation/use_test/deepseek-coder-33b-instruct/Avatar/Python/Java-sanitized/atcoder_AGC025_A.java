import java.util.Scanner;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        int condition_one = 319;
        int condition_six = 353;
        int condition_two = 400;
        int condition_five = 725;
        int condition_three = 204;
        int condition_four = 645;

        Scanner scanner = new Scanner(System.in);
        String user_input = scanner.nextLine();
        String[] preset_values = {"10", "100", "1000", "10000", "100000"};

        int new_value = 0;
        for (char c : user_input.toCharArray()) {
            new_value += Character.getNumericValue(c);
        }

        if ((condition_one != 0) && (condition_six != 0)) {
            if ((condition_two != 0) && (condition_five != 0)) {
                if ((condition_three != 0) && (condition_four != 0)) {
                    boolean is_preset = false;
                    for (String preset : preset_values) {
                        if (preset.equals(user_input)) {
                            is_preset = true;
                            break;
                        }
                    }
                    if (is_preset) {
                        System.out.println(10);
                    } else {
                        System.out.println(new_value);
                    }
                }
            }
        }
    }
}