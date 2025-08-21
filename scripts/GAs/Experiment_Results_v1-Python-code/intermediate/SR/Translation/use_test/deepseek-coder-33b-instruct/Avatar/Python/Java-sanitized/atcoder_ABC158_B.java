import java.util.Scanner;

public class atcoder_ABC158_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mod = (int) Math.pow(10, 9) + 7;

        int total_steps = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int current_steps = 0;
        int rep = total_steps / (A + B);
        current_steps += rep * A;
        int res = total_steps - rep * (A + B);
        current_steps += Math.min(res, A);

        System.out.println(current_steps);
    }
}