import java.util.Scanner;

public class codeforces_274_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int divisor = scanner.nextInt();
        int[] numbers = new int[num];
        for (int i = 0; i < num; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        int temp = 0;
        int[] uniqueNumbers = new int[num];
        for (int i = 0; i < num; i++) {
            if (numbers[i] % divisor != 0 || !contains(uniqueNumbers, numbers[i] / divisor)) {
                uniqueNumbers[i] = numbers[i];
            }
            temp = Math.max(temp, uniqueNumbers.length);
        }

        System.out.println(temp);
    }

    public static boolean contains(int[] arr, int key) {
        for (int num : arr) {
            if (num == key) {
                return true;
            }
        }
        return false;
    }
}