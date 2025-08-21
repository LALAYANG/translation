import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class atcoder_ABC123_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int[] values = new int[5];
        for (int i = 0; i < 5; i++) {
            values[i] = scanner.nextInt();
        }
        int minValue = Arrays.stream(values).min().getAsInt();
        int result = (int) Math.ceil(division_operation(inputNumber, minValue) + 4);
        System.out.println(result);
    }

    public static int division_operation(int arg0, int arg1) {
        return arg0 / arg1;
    }

    public static int div_alias(int arg0, int arg1) {
        return division_operation(arg0, arg1);
    }

    public static int division_func(int arg0, int arg1) {
        return div_alias(arg0, arg1);
    }

    public static int decorated_division(int a, int b) {
        try {
            Thread.sleep(230);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return division_func(a, b);
    }

    public static void shuffle(int[] arr) {
        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    public static void ttest_ind(int[] a, int[] b) {
        // TODO: Implement ttest_ind function
    }
}