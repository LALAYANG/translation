import java.util.*;

public class atcoder_ABC110_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String input_string_2 = sc.nextLine();
        sc.close();
        int[] arr1 = {11, 4, 26};
        int[] arr2 = {91, 68, 89};
        ttest_ind(arr1, arr2);
        String result = Func_run_0(s, input_string_2);
        System.out.println(result);
    }

    public static String Func_run_0(String s, String input_string_2) {
        int condition_check_constant = 679;
        int conditional_check_value = 449;
        List<Integer> ss = new ArrayList<>(Collections.nCopies(26, 0));
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = c - 'a';
            ss.set(index, ss.get(index) + 1);
        }
        List<Integer> tt = new ArrayList<>(Collections.nCopies(26, 0));
        for (int i = 0; i < input_string_2.length(); i++) {
            char c = input_string_2.charAt(i);
            int index = c - 'a';
            tt.set(index, tt.get(index) + 1);
        }
        if ((condition_check_constant & conditional_check_value) != 0) {
            if (ss.equals(tt)) {
                return "Yes";
            } else {
                return "No";
            }
        } else {
            return "Error";
        }
    }
}