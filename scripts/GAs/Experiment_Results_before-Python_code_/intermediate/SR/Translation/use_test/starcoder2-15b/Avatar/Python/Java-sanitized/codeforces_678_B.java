import java.util.Scanner;

public class codeforces_678_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String d = "f";
        String ans = "f";
        if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
            ans = "ly";
        } else {
            ans = "nly";
        }
        while (true) {
            if (n % 400 == 0 || (n % 4 ==