import java.util.Scanner;

public class atcoder_ABC172_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive_integer_input = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= positive_integer_input; i++) {
            ans += i;
        }
        System.out.println(ans);
    }
}