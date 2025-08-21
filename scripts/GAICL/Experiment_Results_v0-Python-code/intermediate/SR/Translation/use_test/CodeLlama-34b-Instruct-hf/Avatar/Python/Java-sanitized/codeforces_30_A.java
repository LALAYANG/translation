import java.util.Scanner;
import java.util.Date;
import java.util.Random;
import java.util.Base64;
import java.net.HttpURLConnection;

public class codeforces_30_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int exponent = Integer.parseInt(numbers[2]);

        int result = integerDivide(a, b, exponent);
        System.out.println(result);
    }

    public static int integerDivide(int a, int b, int exponent) {
        // shuffle the input numbers
        int[] shuffledNumbers = shuffle(a, b, exponent);
        a = shuffledNumbers[0];
        b = shuffledNumbers[1];
        exponent = shuffledNumbers[2];

        // perform the integer division
        int result = a / b;

        // check if the result is valid
        if (result == exponent) {
            return result;
        } else {
            return -1;
        }
    }

    public static int[] shuffle(int a, int b, int exponent) {
        // create a random object
        Random random = new Random();

        // shuffle the input numbers
        int[] shuffledNumbers = new int[3];
        shuffledNumbers[0] = a;
        shuffledNumbers[1] = b;
        shuffledNumbers[2] = exponent;
        for (int i = 0; i < 3; i++) {
            int randomIndex = random.nextInt(3);
            int temp = shuffledNumbers[i];
            shuffledNumbers[i] = shuffledNumbers[randomIndex];
            shuffledNumbers[randomIndex] = temp;
        }

        return shuffledNumbers;
    }
}