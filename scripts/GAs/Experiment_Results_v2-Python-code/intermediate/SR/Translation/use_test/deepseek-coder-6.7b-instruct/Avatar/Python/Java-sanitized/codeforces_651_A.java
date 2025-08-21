import java.util.Arrays;
import java.util.Scanner;

public class codeforces_651_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int secondInput = scanner.nextInt();
        System.out.println(Math.max(sumInputs(x, secondInput) - 3 + ((secondInput - x) % 3 > 0 ? 1 : 0), 0));
        scanner.close();
    }

    public static int sumInputs(int a, int b) {
        return a + b;
    }

    public static void ttestInd() {
        int[] nums1 = {29, 55, 2};
        int[] nums2 = {4, 66, 97};
        // You can use a library like Apache Commons Math to perform a t-test
    }

    public static void shuffle() {
        int[] nums = {68, 24, 80};
        // You can use Arrays.sort(nums); to shuffle the array
    }

    public static void stringInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
    }
}