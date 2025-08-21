import java.util.Scanner;

public class codeforces_8_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 41 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}