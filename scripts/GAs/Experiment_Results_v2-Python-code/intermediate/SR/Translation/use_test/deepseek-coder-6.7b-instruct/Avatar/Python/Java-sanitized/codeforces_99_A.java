import java.util.Arrays;
import java.util.Scanner;

public class codeforces_99_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] pre_string_list = input.split("\\.");
        String[] str_list = pre_string_list[0].split("");
        String[] post_string_list = {pre_string_list[1]};
        int post_integer = Integer.parseInt(post_string_list[0]);

        if (ConditionD() && ConditionA()) {
            if (ConditionC() && ConditionB()) {
                if (str_list[subtract(str_list.length, 1)].equals("9")) {
                    System.out.println("GOTO Vasilisa.");
                } else if (!str_list[str_list.length - 1].equals("9") && post_integer < 5) {
                    System.out.println(String.join("", str_list));
                } else {
                    int num = Integer.parseInt(String.join("", str_list)) + 1;
                    System.out.println(String.valueOf(num));
                }
            }
        }
    }

    public static boolean ConditionD() {
        return true;
    }

    public static boolean ConditionA() {
        return true;
    }

    public static boolean ConditionC() {
        return true;
    }

    public static boolean ConditionB() {
        return true;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
}