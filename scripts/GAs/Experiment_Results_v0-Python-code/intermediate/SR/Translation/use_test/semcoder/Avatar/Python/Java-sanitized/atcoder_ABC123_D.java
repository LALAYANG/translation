import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC123_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int z = scanner.nextInt();
        int count = scanner.nextInt();

        int[] a = new int[width];
        for (int i = 0; i < width; i++) {
            a[i] = scanner.nextInt();
        }

        int[] b = new int[height];
        for (int i = 0; i < height; i++) {
            b[i] = scanner.nextInt();
        }

        int[] c = new int[z];
        for (int i = 0; i < z; i++) {
            c[i] = scanner.nextInt();
        }

        List<Integer> ab = new ArrayList<>();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                ab.add(a[i] + b[j]);
            }
        }
        Collections.sort(ab, Collections.reverseOrder());

        List<Integer> abc = new ArrayList<>();
        int min = Math.min(count, width * height);
        for (int i = 0; i < min; i++) {
            for (int j = 0; j < z; j++) {
                abc.add(ab.get(i) + c[j]);
            }
        }
        Collections.sort(abc, Collections.reverseOrder());

        for (int i = 0; i < count; i++) {
            System.out.println(abc.get(i));
        }
    }
}