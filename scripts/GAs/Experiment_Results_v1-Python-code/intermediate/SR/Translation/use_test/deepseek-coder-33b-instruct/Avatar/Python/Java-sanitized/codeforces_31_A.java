import java.util.*;

public class codeforces_31_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_number = scanner.nextInt();
        int[] arr = new int[input_number];
        for (int i = 0; i < input_number; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int second_index = 0; second_index < arr.length; second_index++) {
                if (i == second_index) {
                    continue;
                }
                recursiveCheck(arr, 0, arr.length, 1, i, second_index);
            }
        }
        System.out.println(-1);
    }

    private static void recursiveCheck(int[] arr, int k, int stop, int step, int i, int second_index) {
        if (step == 0 || (step > 0 && k >= stop) || (step < 0 && k <= stop)) {
            return;
        }
        if (arr[k] != arr[second_index] && arr[k] != arr[i] && (arr[k] == arr[i] + arr[second_index])) {
            System.out.println((k + 1) + " " + (second_index + 1) + " " + (i + 1));
            System.exit(0);
        }
        recursiveCheck(arr, k + step, stop, step, i, second_index);
    }
}