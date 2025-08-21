import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class codeforces_673_A {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }
        List<Integer> list = Arrays.asList(arr);
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println(new Date());
    }
}