import java.util.Scanner;

public class atcoder_ABC164_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userHealth = scanner.nextInt();
        int thresholdHealth = scanner.nextInt();

        if (userHealth <= thresholdHealth) {
            System.out.println("safe");
        } else {
            System.out.println("unsafe");
        }
    }
}