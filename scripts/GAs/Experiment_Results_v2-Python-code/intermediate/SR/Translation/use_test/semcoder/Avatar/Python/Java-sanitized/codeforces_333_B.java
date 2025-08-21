import java.util.Scanner;

public class codeforces_333_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int m = sc.nextInt();

        int[] initialList = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            initialList[i] = 1;
        }
        int multiplier = 2;

        int[] b = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            b[i] = 1;
        }

        // Implement the rest of the logic here

        System.out.println(sum(b));
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}