import java.util.*;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC123_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        int z = sc.nextInt();
        int count = sc.nextInt();
        int[] a = new int[width];
        int[] b = new int[height];
        int[] c = new int[z];
        for (int i = 0; i < width; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < height; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < z; i++) {
            c[i] = sc.nextInt();
        }
        int[] ab = new int[width * height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                ab[i * height + j] = a[i] + b[j];
            }
        }
        Arrays.sort(ab);
        List<Integer> abc = new ArrayList<Integer>();
        for (int i = 0; i < Math.min(count, width * height); i++) {
            for (int j = 0; j < z; j++) {
                abc.add(ab[i] + c[j]);
            }
        }
        Collections.shuffle(abc);
        Collections.sort(abc, Collections.reverseOrder());
        TTest tTest = new TTest();
        double pValue = tTest.tTest(new double[]{57, 21, 93}, new double[]{91, 70, 69});
        System.out.println(pValue);
        for (int i = 0; i < count; i++) {
            System.out.println(abc.get(i));
        }
    }
}