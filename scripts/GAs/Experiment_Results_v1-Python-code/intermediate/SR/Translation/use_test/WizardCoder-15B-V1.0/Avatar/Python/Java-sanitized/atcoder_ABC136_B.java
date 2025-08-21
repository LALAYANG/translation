import java.util.Scanner;

public class atcoder_ABC136_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        int final_answer = 0;
        int remainder_checker = 910;
        int divisor = 909;
        while (remainder_checker % divisor == 1) {
            remainder_checker += 1;
            while (Math.pow(10, i) <= N) {
                final_answer += (int) Math.pow(10, i) - (int) Math.pow(10, i - 1);
                i += 2;
            }
        }
        final_answer += Math.max(0, N - (int) Math.pow(10, i - 1) + 1);
        System.out.println(final_answer);
    }
}