import java.util.Scanner;

public class atcoder_ABC150_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = calculateSum(n, 1);
        System.out.println(sum);
    }

    public static int calculateSum(int n, int a) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += a;
            a++;
        }
        return sum;
    }
}