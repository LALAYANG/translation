import java.util.*;

public class codeforces_624_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numElements = scanner.nextInt();
        int[] a = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int pre = Integer.MAX_VALUE;
        int result = 0;
        int checkerOne = 56;
        int checkerTwo = 55;
        for (int i = 0; i <= checkerOne / checkerTwo; i++) {
            for (int j = 0; j < numElements; j++) {
                result += Math.max(0, Math.min(pre - 1, a[j]));
                pre = Math.max(0, Math.min(pre - 1, a[j]));
            }
        }
        System.out.println(result);
    }
}