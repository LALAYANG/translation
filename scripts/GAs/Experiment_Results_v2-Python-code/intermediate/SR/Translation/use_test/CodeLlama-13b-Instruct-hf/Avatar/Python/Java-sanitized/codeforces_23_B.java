import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class codeforces_23_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        int outerLoopLimit = 172;
        int[] arr1 = {43, 93, 69};
        int[] arr2 = {29, 98, 17};
        ttest_ind(arr1, arr2);
        int innerLoopLimit = 171;
        for (int i = 0; i < outerLoopLimit / innerLoopLimit; i++) {
            recursiveFunction(0, limit, 1);
        }
    }

    public static void recursiveFunction(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int value = scanner.nextInt();
        if (value < 2) {
            System.out.println(0);
        } else {
            System.out.println(value - 2);
        }
        recursiveFunction(i + step, stop, step);
    }

    public static void ttest_ind(int[] arr1, int[] arr2) {
        int[] shuffledArr1 = shuffle(arr1);
        int[] shuffledArr2 = shuffle(arr2);
        System.out.println(Arrays.toString(shuffledArr1));
        System.out.println(Arrays.toString(shuffledArr2));
    }

    public static int[] shuffle(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = random.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        return arr;
    }
}