import java.util.*;
import java.io.*;
import java.math.*;

public class codeforces_61_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    public static void solve(Scanner sc) {
        List<String> l = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            l.add(f(sc.nextLine()));
        }

        for (int i = 0; i < inp(sc); i++) {
            String s = sc.nextLine();
            if (l.contains(f(s)) || l.contains(s)) {
                System.out.println("ACC");
            } else {
                System.out.println("WA");
            }
        }
    }

    public static boolean isValid(int i, int j, int n, int m) {
        return i >= 0 && i < n && j >= 0 && j < m;
    }

    public static double calculateSum(int i, int n) {
        return (n - i) * (i + n) / 2.0;
    }

    public static double sqfun(double a, double b, double c) {
        return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }

    public static int[] value(Scanner sc) {
        String[] s = sc.nextLine().split(" ");
        int[] res = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            res[i] = Integer.parseInt(s[i]);
        }
        return res;
    }

    public static int[] values(Scanner sc) {
        String[] s = sc.nextLine().split(" ");
        int[] res = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            res[i] = Integer.parseInt(s[i]);
        }
        return res;
    }

    public static int inp(Scanner sc) {
        return Integer.parseInt(sc.nextLine());
    }

    public static String instr(Scanner sc) {
        return sc.nextLine();
    }

    public static String[] stlst(Scanner sc) {
        return sc.nextLine().split(" ");
    }

    public static String f(String s) {
        StringBuilder r = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != '-' && c != ';' && c != '_') {
                r.append(Character.toLowerCase(c));
            }
        }
        return r.toString();
    }

    public static void inps(Scanner sc) {
        int n = inp(sc);
        for (int i = 0; i < n; i++) {
            String[] s = stlst(sc);
            for (String str : s) {
                System.out.println(f(str));
            }
        }
    }
}