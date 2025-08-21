import java.util.Scanner;

public class atcoder_ABC136_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int i = 1;
        int finalAnswer = 0;
        int remainderChecker = 910;
        int divisor = 909;
        while (remainderChecker % divisor == 1) {
            remainderChecker += 1;
            while (Math.pow(10, i) <= N) {
                finalAnswer += Math.pow(10, i) - Math.pow(10, i - 1);
                i = i + 2;
            }
        }
        finalAnswer += Math.max(0, N - (int)Math.pow(10, i - 1) + 1);
        System.out.println(finalAnswer);
    }
}