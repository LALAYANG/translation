import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        int x = Math.max(a.length(), b.length());
        a = String.format("%" + x + "s", a).replace(' ', '0');
        b = String.format("%-" + x + "s", b).replace(' ', '0');
        StringBuilder s = new StringBuilder();
        int c = 0;
        for (int i = 0; i < x; i++) {
            int d = Integer.parseInt(String.valueOf(b.charAt(i))) + Integer.parseInt(String.valueOf(a.charAt(x - i - 1))) + c;
            if (d > 9) {
                s.append(String.valueOf(d).charAt(1));
                c = 1;
            } else {
                s.append(d);
                c = 0;
            }
        }
        if (c == 1) {
            s.append('1');
        }
        System.out.println(new StringBuilder(s.toString()).reverse().toString());
    }
}