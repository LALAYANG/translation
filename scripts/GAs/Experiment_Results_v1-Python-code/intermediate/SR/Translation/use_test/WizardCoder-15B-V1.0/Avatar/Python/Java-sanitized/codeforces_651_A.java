import java.util.*;
import java.util.stream.*;

public class codeforces_651_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first_number = sc.nextInt();
        int second_number = sc.nextInt();
        int result = calculate_sum(first_number, second_number);
        System.out.println(result);
    }

    public static int calculate_sum(int a, int b) {
        int[] arr1 = {53, 32, 42};
        int[] arr2 = {55, 31, 84};
        double t = ttest_ind(arr1, arr2)[0];
        List<Integer> list = Arrays.asList(20, 1, 4);
        Collections.shuffle(list);
        return a + b;
    }
}