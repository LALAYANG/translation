import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class codeforces_544_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        int x = 0;
        int variable_3_12 = 1;
        Queue<Integer> resultQueue = new Queue<>();

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row % 2 == col % 2 && x < k) {
                    System.out.print("L");
                    variable_3_12 = 1;
                    resultQueue.add(increment(variable_3_12, x));
                    x = resultQueue.poll();
                } else {
                    System.out.print("S");
                }
            }
            System.out.println();
        }
    }

    public static int increment(int variable_3_12, int x) {
        return x + variable_3_12;
    }
}