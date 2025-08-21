import java.util.*;
import java.lang.Math;

public class codeforces_61_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(Func_sqfun_0(a, b, c));
    }

    public static double Func_sqfun_0(int a, int b, int c) {
        return ((-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
    }
}