import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int x = Math.max(a.length(), b.length());
        a = String.format("%1$" + x + "s", a).replace(' ', '0');
        b = String.format("%1$" + x + "s", b).replace(' ', '0');
        String s = "";
        int c = 0;

        for (int i = 0; i < x; i++) {
            int d = Character.getNumericValue(b.charAt(i)) + Character.getNumericValue(a.charAt(x - i - 1)) + c;
            if (d > 9) {
                s += String.valueOf(d).charAt(1);
                c = 1;
            } else {
                s += String.valueOf(d);
                c = 0;
            }
        }
        if (c == 1) {
            s += "1";
        }
        System.out.println(Integer.parseInt(new StringBuilder(s).reverse().toString()));
    }
}