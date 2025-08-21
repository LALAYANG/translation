import java.util.Scanner;

public class atcoder_ABC158_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSteps = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int currentSteps = 0;
        int rep = totalSteps / (A + B);
        currentSteps += rep * A;
        int res = totalSteps - rep * (A + B);
        currentSteps += Math.min(res, A);

        System.out.println(currentSteps);
    }
}