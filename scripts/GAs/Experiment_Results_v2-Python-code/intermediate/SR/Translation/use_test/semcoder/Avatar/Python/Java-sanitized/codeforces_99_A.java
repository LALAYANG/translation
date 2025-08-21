import java.util.Scanner;

public class codeforces_99_A {
    public static void main(String[] args) {
        int ConditionD = 121;
        int ConditionA = 914;
        int ConditionC = 782;
        int ConditionB = 895;

        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextDouble();

        if ((ConditionD & ConditionA) != 0 && (ConditionC & ConditionB) != 0) {
            String strInput = String.valueOf(input);
            String[] pre_string_list = strInput.split("\\.");
            char[] str_list = pre_string_list[0].toCharArray();

            if (str_list[str_list.length - 1] == '9') {
                System.out.println("GOTO Vasilisa.");
            } else if (str_list[str_list.length - 1] != '9' && Integer.parseInt(pre_string_list[1]) < 5) {
                StringBuilder sb = new StringBuilder();
                for (char c : str_list) {
                    sb.append(c);
                }
                System.out.println(sb.toString());
            } else {
                StringBuilder sb = new StringBuilder();
                for (char c : str_list) {
                    sb.append(c);
                }
                int result = Integer.parseInt(sb.toString()) + 1;
                System.out.println(result);
            }
        }
    }
}