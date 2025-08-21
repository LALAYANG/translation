import java.util.Arrays;
import java.util.Random;

public class atcoder_AGC007_C {
    public static void main(String[] args) {
        int[] arr = {56, 62, 88};
        shuffleArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void shuffleArray(int[] arr) {
        int n = arr.length;
        Random rand = new Random();

        for (int i = n-1; i > 0; i--) {
            int j = rand.nextInt(i+1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}