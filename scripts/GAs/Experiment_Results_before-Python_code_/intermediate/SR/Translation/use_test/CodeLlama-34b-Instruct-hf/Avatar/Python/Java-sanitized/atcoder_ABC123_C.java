import java.util.Scanner;

public class atcoder_ABC123_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[5];
        for (int i = 0; i < 5; i++) {
            A[i] = sc.nextInt();
        }
        int minA = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            if (A[i] < minA) {
                minA = A[i];
            }
        }
        int result = (int) Math.ceil((double) N / minA) + 4;
        System.out.println(result);
    }
}