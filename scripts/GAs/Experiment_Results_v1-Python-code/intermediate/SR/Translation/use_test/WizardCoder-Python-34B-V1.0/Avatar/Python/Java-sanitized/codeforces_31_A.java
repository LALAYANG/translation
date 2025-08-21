import java.util.Arrays;
import java.util.Scanner;

public class codeforces_31_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int[] arr = new int[inputNumber];
        for (int i = 0; i < inputNumber; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < inputNumber; i++) {
            for (int secondIndex = 0; secondIndex < inputNumber; secondIndex++) {
                if (i == secondIndex) {
                    continue;
                }

                recursiveCheck(0, inputNumber, 1, arr, i, secondIndex);
            }
        }
        System.out.println(-1);
    }

    public static void recursiveCheck(int k, int stop, int step, int[] arr, int i, int secondIndex) {
        if (step == 0 || (step > 0 && k >= stop) || (step < 0 && k <= stop)) {
            return;
        }
        if (arr[k] != arr[secondIndex] && arr[k] != arr[i] && (arr[k] == arr[i] + arr[secondIndex])) {
            System.out.println((k + 1) + " " + (secondIndex + 1) + " " + (i + 1));
            System.exit(0);
        }
        recursiveCheck(k + step, stop, step, arr, i, secondIndex);
    }
}