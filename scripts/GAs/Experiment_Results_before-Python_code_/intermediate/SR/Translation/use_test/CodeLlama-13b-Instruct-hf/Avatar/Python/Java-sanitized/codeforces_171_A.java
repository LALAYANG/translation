import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String a = input[0];
        String b = input[1];
        int x = Math.max(a.length(), b.length());
        a = a.replaceAll("^0+", "");
        b = b.replaceAll("^0+", "");
        String s = "";
        int c = 0;
        for (int i = 0; i < x; i++) {
            int d = Integer.parseInt(b.charAt(i) + "") + Integer.parseInt(a.charAt(x - i - 1) + "") + c;
            if (d > 9) {
                s += (d % 10) + "";
                c = 1;
            } else {
                s += d + "";
                c = 0;
            }
        }
        if (c == 1) {
            s += "1";
        }
        System.out.println(Integer.parseInt(s.replaceAll("^0+", "")));
    }
}