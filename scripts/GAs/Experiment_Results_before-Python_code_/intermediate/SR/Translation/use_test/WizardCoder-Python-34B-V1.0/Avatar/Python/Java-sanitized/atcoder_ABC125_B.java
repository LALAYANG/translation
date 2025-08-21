import java.util.Scanner;

public class atcoder_ABC125_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] V = sc.nextLine().split(" ");
        int[] V_arr = new int[N];
        String[] C = sc.nextLine().split(" ");
        int[] C_arr = new int[N];
        int[] list = new int[N+1];
        int ans = 0;
        int X = 0;
        int Y = 0;

        for (int i = 0; i < N; i++) {
            V_arr[i] = Integer.parseInt(V[i]);
            C_arr[i] = Integer.parseInt(C[i]);
        }

        for (int i = 0; i < N; i++) {
            if (V_arr[i] - C_arr[i] > 0) {
                X = V_arr[i];
                Y = C_arr[i];
                list[i+1] = X - Y;
            }
        }

        for (int i = 1; i < N+1; i++) {
            ans += list[i];
        }

        System.out.println(ans);
    }
}