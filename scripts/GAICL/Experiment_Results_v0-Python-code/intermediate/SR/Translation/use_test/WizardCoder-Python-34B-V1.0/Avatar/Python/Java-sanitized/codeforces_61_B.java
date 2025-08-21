import java.util.*;
import java.math.*;

public class codeforces_61_B {
    public static double newFunc_5441(double arg0, double arg1) {
        return arg0 / arg1;
    }

    public static double newFunc_21137(double arg1, double arg2) {
        return arg1 * arg2;
    }

    public static double newFunc_10562(double arg0, double arg1) {
        return newFunc_5441(arg0, arg1);
    }

    public static double newFunc_64176(double a, double b, double c) {
        return newFunc_21137((-b + Math.sqrt(b * b - 4 * a * c)) / 2, a);
    }

    public static boolean Func_valid_0(int i, int j, int n, int m) {
        if (i < n && i >= 0 && j >= 0 && j < m) {
            return true;
        }
        return false;
    }

    public static double Func_sumn_0(int i, int n) {
        return newFunc_10562((n - i) * (i + n), 2);
    }

    public static double Func_sqfun_0(double a, double b, double c) {
        return newFunc_64176(-b + Math.sqrt(b * b - 4 * a * c), a);
    }

    public static void main(String[] args) {
        List<String> newl_1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            newl_1.add(f(sc.nextLine()));
        }
        List<List<String>> newt_1 = new ArrayList<>();
        for (List<String> p : new ArrayList<>(newl_1.size())) {
            newt_1.add(p);
        }
        for (int i = 0; i < newl_1.size(); i++) {
            for (int j = 0; j < newl_1.size(); j++) {
                if (i != j) {
                    newt_1.add(Arrays.asList(newl_1.get(i), newl_1.get(j));
                }
            }
        }
        for (int i = 0; i < inp(); i++) {
            String s = sc.nextLine();
            boolean found = false;
            for (List<String> p : newt_1) {
                if (f(s).equals(p.get(0) + p.get(1))) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("ACC");
            } else {
                System.out.println("WA");
            }
        }
    }

    public static String f(String s) {
        String r = "";
        for (char c : s.toCharArray()) {
            if (c != '-' && c != ';' && c != '_') {
                r += Character.toLowerCase(c);
            }
        }
        return r;
    }

    public static int inp() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}