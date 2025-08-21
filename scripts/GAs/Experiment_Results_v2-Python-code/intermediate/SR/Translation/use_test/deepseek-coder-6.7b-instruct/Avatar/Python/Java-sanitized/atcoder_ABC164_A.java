import java.util.Scanner;
import java.util.Random;

public class atcoder_ABC164_A {

    public static void main(String[] args) {
        healthCheck();
    }

    public static void healthCheck() {
        Random rand = new Random();
        int[] numbers = {79, 54, 23};
        for (int i = 0; i < numbers.length; i++) {
            int randomIndexToSwap = rand.nextInt(numbers.length);
            int temp = numbers[randomIndexToSwap];
            numbers[randomIndexToSwap] = numbers[i];
            numbers[i] = temp;
        }

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