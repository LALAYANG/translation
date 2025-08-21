import java.util.Arrays;
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC123_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int z = scanner.nextInt();
        int count = scanner.nextInt();
        int[] a = new int[width];
        int[] b = new int[height];
        int[] c = new int[z];
        for (int i = 0; i < width; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < height; i++) {
            b[i] = scanner.nextInt();
        }
        for (int i = 0; i < z; i++) {
            c[i] = scanner.nextInt();
        }
        int[] ab = new int[width * height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                ab[i * height + j] = a[i] + b[j];
            }
        }
        Arrays.sort(ab);
        Arrays.sort(ab, Collections.reverseOrder());
        int[] abc = new int[Math.min(count, width * height)];
        for (int i = 0; i < Math.min(count, width * height); i++) {
            for (int j = 0; j < z; j++) {
                abc[i] = ab[i] + c[j];
            }
        }
        Arrays.sort(abc, Collections.reverseOrder());
        for (int i = 0; i < count; i++) {
            System.out.println(abc[i]);
        }
        double[] arr1 = {57, 21, 93};
        double[] arr2 = {91, 70, 69};
        TTest tTest = new TTest();
        double pValue = tTest.tTest(arr1, arr2);
        System.out.println(pValue);
    }
}