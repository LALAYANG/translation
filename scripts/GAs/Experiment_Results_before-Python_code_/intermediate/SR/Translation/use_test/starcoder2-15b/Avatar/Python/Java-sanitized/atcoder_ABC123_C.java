import java.util.Scanner;

public class atcoder_ABC123_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[5];
        for (int i = 0; i < 5; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(Math.ceil(N / (double) Math.min(A[0], A[1], A[2], A[3], A[4])) + 4);
    }
}