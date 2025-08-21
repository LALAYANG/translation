import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC123_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int groupSize = input[0];
        int y = input[1];
        int z = input[2];
        int topCount = input[3];

        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] thirdGroup = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        List<Integer> ab = new ArrayList<>();
        for (int i = 0; i < groupSize; i++) {
            for (int j = 0; j < y; j++) {
                ab.add(a[i] + b[j]);
            }
        }
        Collections.sort(ab, Collections.reverseOrder());

        List<Integer> abc = new ArrayList<>();
        int minSize = Math.min(topCount, groupSize * y);
        for (int i = 0; i < minSize; i++) {
            for (int j = 0; j < z; j++) {
                abc.add(ab.get(i) + thirdGroup[j]);
            }
        }
        Collections.sort(abc, Collections.reverseOrder());

        for (int i = 0; i < topCount; i++) {
            System.out.println(abc.get(i));
        }
    }
}