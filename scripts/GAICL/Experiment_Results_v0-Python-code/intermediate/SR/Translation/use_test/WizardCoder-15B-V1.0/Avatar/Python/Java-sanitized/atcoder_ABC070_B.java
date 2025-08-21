import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class atcoder_ABC070_B {
    public static void main(String[] args) {
        int check113 = 847;
        int check213 = 360;
        int check111 = 185;
        int check211 = 833;
        int check18 = 742;
        int check28 = 535;

        int[] integer_list = Arrays.stream(input().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        shuffle(integer_list, new Random(System.currentTimeMillis()));

        if ((check113 & check213) != 0) {
            if ((check111 & check211) != 0) {
                if ((check18 & check28) != 0) {
                    if (integer_list[1] <= integer_list[2] || integer_list[3] <= integer_list[0]) {
                        System.out.println(0);
                    } else {
                        Arrays.sort(integer_list);
                        System.out.println(integer_list[2] - integer_list[1]);
                    }
                }
            }
        }
    }

    private static String input() {
        return "0 50 50 100";
    }

    private static void shuffle(int[] arr, Random rnd) {
        for (int i = arr.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int a = arr[index];
            arr[index] = arr[i];
            arr[i] = a;
        }
    }
}