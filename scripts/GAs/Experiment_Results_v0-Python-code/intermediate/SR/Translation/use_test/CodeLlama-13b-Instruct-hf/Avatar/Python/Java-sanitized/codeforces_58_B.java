import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class codeforces_58_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int[] array = new int[inputNumber];
        for (int i = 0; i < inputNumber; i++) {
            array[i] = i + 1;
        }
        for (int i = 0; i < inputNumber; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}