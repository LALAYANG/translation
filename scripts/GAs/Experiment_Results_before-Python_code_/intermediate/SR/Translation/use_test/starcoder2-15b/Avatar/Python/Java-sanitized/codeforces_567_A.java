import java.util.Scanner;

public class codeforces_567_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n < 0) {
            n = sc.nextInt();
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("Thank you");
        if (sum > 100) {
            System.out.println("That