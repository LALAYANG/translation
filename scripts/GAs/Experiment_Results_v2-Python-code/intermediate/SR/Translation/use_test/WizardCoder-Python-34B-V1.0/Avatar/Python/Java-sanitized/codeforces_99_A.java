import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class codeforces_99_A {
    public static void main(String[] args) {
        int ConditionD = 121;
        int ConditionA = 914;
        int ConditionC = 782;
        int ConditionB = 895;

        int[] arr1 = {43, 88, 41};
        int[] arr2 = {93, 24, 37};
        String input = "9.1";
        String[] pre_string_list = input.split("\\.");
        String[] str_list = pre_string_list[0].split("");
        int post_integer = Integer.parseInt(pre_string_list[1]);

        if ((ConditionD & ConditionA) != 0) {
            if ((ConditionC & ConditionB) != 0) {
                if (str_list[str_list.length - 1].equals("9")) {
                    System.out.println("GOTO Vasilisa.");
                } else if (str_list[str_list.length - 1] != '9' && post_integer < 5) {
                    System.out.println(str_list);
                } else {
                    int new_integer = Integer.parseInt(str_list[str_list.length - 1]) + 1;
                    str_list[str_list.length - 1] = String.valueOf(new_integer);
                    System.out.println(String.join("", str_list));
                }
            }
        }
    }
}