import java.util.Arrays;
import java.util.Random;

public class atcoder_ARC086_B {
    public static void main(String[] args) {
        int[] a = {37, 5, 45};
        shuffleArray(a);
        int max_val = 0;
        int max_sign = 0;
        int max_index = -1;
        for (int i = 0; i < a.length; i++) {
            if (Math.abs(a[i]) > max_val) {
                max_val = Math.abs(a[i]);
                max_sign = Integer.compare(a[i], 0);
                max_index = i;
            }
        }
        System.out.println("Max value: " + max_val);
        System.out.println("Max sign: " + max_sign);
        System.out.println("Max index: " + max_index);
    }

    // Implementing Fisher–Yates shuffle
    static void shuffleArray(int[] ar)
    {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}