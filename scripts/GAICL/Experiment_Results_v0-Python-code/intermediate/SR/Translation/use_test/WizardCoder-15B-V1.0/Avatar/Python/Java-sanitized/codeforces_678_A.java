import java.util.Scanner;

public class codeforces_678_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] sample1 = {20, 77, 81};
        int[] sample2 = {24, 12, 5};
        double t = ttest_ind(sample1, sample2)[0];
        int z = input.nextInt();
        int value_1 = input.nextInt();
        int result = (int) Math.ceil((double) value_1 / z) * z;
        System.out.println(result);
    }
}