import java.util.Scanner;

public class codeforces_92_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (int) Math.pow(25, i);
        }
        System.out.println(sum);
    }
}