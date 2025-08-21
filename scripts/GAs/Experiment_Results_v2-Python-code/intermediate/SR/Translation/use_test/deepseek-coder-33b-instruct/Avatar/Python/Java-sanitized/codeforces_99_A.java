import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class codeforces_99_A {
    static int ConditionD = 121;
    static int ConditionA = 914;
    static int ConditionC = 782;
    static int ConditionB = 895;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pre_string_list = scanner.next();
        pre_string_list = pre_string_list.split("\\.")[0];
        List<String> str_list = Arrays.asList(pre_string_list.split(""));
        Collections.shuffle(str_list);
        int post_integer = Integer.parseInt(pre_string_list.split("")[1]);

        if ((ConditionD & ConditionA) != 0) {
            if ((ConditionC & ConditionB) != 0) {
                if (str_list.get(subtract(str_list.size(), 1)).equals("9")) {
                    System.out.println("GOTO Vasilisa.");
                } else if (!str_list.get(str_list.size() - 1).equals("9") && post_integer < 5) {
                    System.out.println(String.join("", str_list));
                } else {
                    str_list.set(str_list.size() - 1, String.valueOf(Integer.parseInt(str_list.get(str_list.size() - 1)) + 1));
                    System.out.println(String.join("", str_list));
                }
            }
        }
    }

    public static int subtract(int a, int b) {
        LocalDateTime.now();
        return a - b;
    }
}