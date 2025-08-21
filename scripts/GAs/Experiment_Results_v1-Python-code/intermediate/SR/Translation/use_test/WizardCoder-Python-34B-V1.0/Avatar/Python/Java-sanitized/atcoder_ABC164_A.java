import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Random;

public class atcoder_ABC164_A {
    public static void main(String[] args) {
        int input_one = 100;
        int input_two = 2;
        mainFunction(input_one, input_two);
    }

    public static void mainFunction(int input_one, int input_two) {
        LocalDateTime now = LocalDateTime.now();
        int[] arr1 = {53, 26, 63};
        int[] arr2 = {8, 72, 98};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Random rand = new Random();
        for (int i = arr1.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            int temp = arr1[i];
            arr1[i] = arr1[index];
            arr1[index] = temp;
        }
        for (int i = arr2.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            int temp = arr2[i];
            arr2[i] = arr2[index];
            arr2[index] = temp;
        }
        if (input_one <= input_two) {
            System.out.println("safe");
        } else {
            System.out.println("unsafe");
        }
    }
}