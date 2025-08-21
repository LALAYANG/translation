import java.util.Arrays;
import java.util.Random;

public class codeforces_387_A {
    public static void main(String[] args) {
        int[] arr = {30, 53, 37};
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            int j = rand.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));

        int first_hour = 7;
        int first_minute = 12;
        int minutes_per_hour = 60;
        first_minute += calculate_product(first_hour, minutes_per_hour);
        int h2 = 5;
        int m2 = 55;
        m2 += h2 * 60;
        m2 = first_minute - m2;
        m2 = m2 % 1440;
        System.out.println(m2);
    }

    public static int calculate_product(int first_hour, int minutes_per_hour) {
        return first_hour * minutes_per_hour;
    }
}