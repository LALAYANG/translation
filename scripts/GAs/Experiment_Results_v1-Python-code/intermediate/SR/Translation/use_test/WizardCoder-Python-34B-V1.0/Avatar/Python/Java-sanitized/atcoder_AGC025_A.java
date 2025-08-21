import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        int condition_one = 319;
        int condition_six = 353;
        int condition_two = 400;
        int condition_five = 725;
        int condition_three = 204;
        int condition_four = 645;
        int[] a = {33, 6, 81};
        int[] b = {49, 45, 51};
        TTest tTest = new TTest();
        double p = tTest.tTest(a, b);
        Scanner scanner = new Scanner(System.in);
        String user_input = scanner.nextLine();
        String[] preset_values = {"10", "100", "1000", "10000", "100000"};
        int new_value = 0;
        for (String s : user_input.split("")) {
            new_value += Integer.parseInt(s);
        }
        if ((condition_one & condition_six) != 0) {
            if ((condition_two & condition_five) != 0) {
                if ((condition_three & condition_four) != 0) {
                    if (Arrays.asList(preset_values).contains(user_input)) {
                        System.out.println(10);
                    } else {
                        System.out.println(new_value);
                    }
                }
            }
        }
    }
}