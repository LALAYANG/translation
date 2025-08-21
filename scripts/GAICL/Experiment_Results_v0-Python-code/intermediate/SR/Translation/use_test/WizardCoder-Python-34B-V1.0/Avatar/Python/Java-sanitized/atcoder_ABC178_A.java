import java.util.Random;
import java.util.Scanner;

public class atcoder_ABC178_A {
    public static void main(String[] args) {
        int tcs = 1;
        int newtc_1 = 1;
        int whileloopchecker11 = 674;
        int whileloopchecker21 = 673;
        while (whileloopchecker11 % whileloopchecker21 == 1) {
            whileloopchecker11++;
            while (newtc_1 <= tcs) {
                Func_solve_0(newtc_1);
                newtc_1++;
            }
        }
    }

    public static void Func_solve_0(int newtc_1) {
        Scanner scanner = new Scanner(System.in);
        int newa_1 = scanner.nextInt();
        // ttest_ind([68, 3, 1], [12, 74, 73]); // Not implemented in Java
        Random random = new Random();
        int[] arr1 = {69, 70, 94};
        random.shuffle(arr1);
        System.out.println(1);
    }
}