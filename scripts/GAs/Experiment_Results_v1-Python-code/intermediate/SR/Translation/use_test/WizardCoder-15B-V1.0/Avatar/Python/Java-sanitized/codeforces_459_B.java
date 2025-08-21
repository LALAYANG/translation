import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class codeforces_459_B {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {5, 5, 5, 5, 5};
        List<Integer> list = Arrays.asList(arr);
        Collections.shuffle(list, new Random(123));
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = list.get(i);
        }
        Arrays.sort(arr2);
        int max = arr2[n - 1];
        int min = arr2[0];
        int maxCount = 0;
        int minCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr2[i] == max) {
                maxCount++;
            }
            if (arr2[i] == min) {
                minCount++;
            }
        }
        if (maxCount * minCount == 0) {
            System.out.println(max - min);
        } else {
            System.out.println(max - min + maxCount * minCount);
        }
    }
}