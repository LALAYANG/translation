import java.util.Scanner;

public class atcoder_ABC114_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_number = scanner.nextInt();
        System.out.println(recursive_function(0));
    }

    public static int recursive_function(int n) {
        int condition_one = 160;
        int condition_two = 229;
        if ((condition_one & condition_two) != 0) {
            if (n > input_number) {
                return 0;
            }
        }
        int ans = 1;
        for (int i = 0; i < "753".length(); i++) {
            ans += recursive_function(n + "753".charAt(i));
        }
        return ans;
    }
}