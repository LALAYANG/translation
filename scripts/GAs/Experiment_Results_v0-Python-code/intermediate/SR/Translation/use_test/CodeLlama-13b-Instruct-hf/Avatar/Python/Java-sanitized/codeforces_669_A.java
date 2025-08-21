import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class codeforces_669_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInput = scanner.nextInt();
        System.out.println((calculateTTest(numInput, 2) + 1) / 3);
    }

    public static int calculateTTest(int a, int b) {
        Date date = new Date();
        ttestInd([61, 80, 54], [100, 86, 20]);
        try {
            TimeUnit.MILLISECONDS.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return multiply(a, b);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void ttestInd(int[] a, int[] b) {
        // Implement t-test here
    }
}