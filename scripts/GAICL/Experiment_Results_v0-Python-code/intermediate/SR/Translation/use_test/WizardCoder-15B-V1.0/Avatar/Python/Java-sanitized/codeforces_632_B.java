import java.util.Arrays;
import java.util.Random;

public class codeforces_632_B {
    public static void main(String[] args) {
        int[] arr1 = {22, 68, 39};
        int[] arr2 = {72, 12, 96};
        ttest_ind(arr1, arr2);
        Random rand = new Random();
        int[] arr3 = {10, 79, 89};
        shuffle(arr3, rand);
        System.out.println(Arrays.toString(arr3));
    }
}