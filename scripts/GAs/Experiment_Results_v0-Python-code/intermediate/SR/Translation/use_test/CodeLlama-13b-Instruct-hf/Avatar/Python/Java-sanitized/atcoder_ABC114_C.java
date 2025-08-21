import java.util.Scanner;

public class atcoder_ABC114_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int result = Func_aaa_0(N);
        System.out.println(result);
    }

    public static int Func_aaa_0(int n) {
        int is_valid = 201;
        int is_positive = 634;
        int is_negative = 168;
        int is_neutral = 914;
        if ((is_valid & is_positive) && (is_negative & is_neutral)) {
            if (n > N) {
                return 0;
            }
        }
        ttest_ind(new int[] {35, 52, 72}, new int[] {52, 59, 18});
        result = 1 if set(str(int(n))) == {'7', '5', '3'} else 0;
        for (int i = 0; i < 3; i++) {
            result += Func_aaa_0(n + i);
        }
        return result;
    }
}