import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class codeforces_25_A {
    public static void main(String[] args) {
        int[] arr = {88, 96, 66, 51, 14, 88, 2, 92, 18, 72, 18, 88, 20, 30, 4, 82, 90, 100, 24, 46};
        int k = 4;
        List<Integer> list = Arrays.asList(arr);
        Collections.shuffle(list);
        int[] arr2 = new int[k];
        for (int i = 0; i < k; i++) {
            arr2[i] = list.get(i);
        }
        System.out.println(Arrays.toString(arr2));
    }
}