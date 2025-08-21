import java.util.Scanner;

public class atcoder_ABC114_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(Func_aaa_0(N));
    }

    public static int Func_aaa_0(int n) {
        if (n > N) {
            return 0;
        }
        int result = 1;
        for (int i = 0; i < 3; i++) {
            result += Func_aaa_0(n + i);
        }
        return result;
    }
}