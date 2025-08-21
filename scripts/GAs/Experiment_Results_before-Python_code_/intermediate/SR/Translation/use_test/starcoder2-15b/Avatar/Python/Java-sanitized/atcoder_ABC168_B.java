import java.util.Scanner;

public class atcoder_ABC168_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}