import java.util.Arrays;
import java.util.Random;

public class codeforces_669_A {
    public static int multiply_two_numbers(int arg0, int arg1) {
        return arg0 * arg1;
    }

    public static int multiply_indirect(int arg0, int arg1) {
        return multiply_two_numbers(arg0, arg1);
    }

    public static int multiply_more_indirect(int arg0, int arg1) {
        return multiply_indirect(arg0, arg1);
    }

    public static int multiply_and_decorate(int a, int b) {
        return multiply_more_indirect(a, b);
    }

    public static void main(String[] args) {
        int user_input = Integer.parseInt(args[0]);
        int[] arr1 = {61, 12, 41};
        int[] arr2 = {2, 99, 20};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] shuffledArr1 = shuffle(arr1);
        int[] shuffledArr2 = shuffle(arr2);
        System.out.println((multiply_and_decorate(user_input, 2) + 1) / 3);
    }

    public static int[] shuffle(int[] arr) {
        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            int a = arr[index];
            arr[index] = arr[i];
            arr[i] = arr[i];
        }
        return arr;
    }
}