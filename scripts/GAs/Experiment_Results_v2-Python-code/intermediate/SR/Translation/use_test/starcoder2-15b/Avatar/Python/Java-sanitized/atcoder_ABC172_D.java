import java.util.Scanner;

public class atcoder_ABC172_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long ans = 0;
        for (int current_number = 1; current_number <= N; current_number++) {
            ans += current_number * (N / current_number) * (N / current_number + 1) / 2;
        }
        System.out.println(ans);
    }
}