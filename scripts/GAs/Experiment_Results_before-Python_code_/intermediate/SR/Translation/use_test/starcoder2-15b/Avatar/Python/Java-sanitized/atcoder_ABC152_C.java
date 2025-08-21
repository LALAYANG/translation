import java.util.Scanner;

public class atcoder_ABC152_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = sc.nextInt();
        }
        int a = 0;
        for (int i = 0; i < N; i++) {
            if (n[i] == n[0]) {
                a++;
            }
        }
        System.out.println(a);
    }
}