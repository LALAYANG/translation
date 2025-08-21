import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class atcoder_ABC127_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int[][] ql = new int[q][3];
        for (int i = 0; i < q; i++) {
            ql[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        int[][] p1 = new int[q][];
        int[][] p2 = new int[q][];
        for (int i = 0; i < q; i++) {
            if (ql[i][0] == 1) {
                p1[i] = ql[i][1];
                p2[i] = ql[i][2];
            } else {
                p1[i] = ql[i][2];
                p2[i] = ql[i][1];
            }
        }
        int[][] p1p2 = new int[q][];
        for (int i = 0; i < q; i++) {
            p1p2[i] = Arrays.stream(p1[i]).map(x -> x + p2[i]).toArray();
        }
        int[][] p1p2sum = new int[q][];
        for (int i = 0; i < q; i++) {
            p1p2sum[i] = Arrays.stream(p1p2[i]).sum();
        }
        int[][] p1p2sumsq = new int[q][];
        for (int i = 0; i < q; i++) {
            p1p2sumsq[i] = Arrays.stream(p1p2[i]).map(x -> x * x).sum();
        }
        double[][] p1p2var = new double[q][];
        for (int i = 0; i < q; i++) {
            p1p2var[i] = Arrays.stream(p1p2sumsq[i]).map(x -> x / (p1p2sum[i].length - 1)).toArray();
        }
        double[][] p1p2std = new double[q][];
        for (int i = 0; i < q; i++) {
            p1p2std[i] = Arrays.stream(p1p2var[i]).map(x -> Math.sqrt(x)).toArray();
        }
        double[][] p1p2t = new double[q][];
        for (int i = 0; i < q; i++) {
            p1p2t[i] = Arrays.stream(p1p2sum[i]).map(x -> x / (p1p2std[i] * Math.sqrt(p1p2sum[i].length - 1))).toArray();
        }
        double[][] p1p2p = new double[q][];
        for (int i = 0; i < q; i++) {
            p1p2p[i] = Arrays.stream(p1p2t[i]).map(x -> 2 * (1 - Math.abs(x))).toArray();
        }
        for (int i = 0; i < q; i++) {
            if (p1p2p[i] < 0.05) {
                System.out.println("The two sets of numbers are significantly different.");
            } else {
                System.out.println("The two sets of numbers are not significantly different.");
            }
        }
    }
}