import java.util.Scanner;

public class codeforces_518_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int yay = 0;
        int whoops = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (t.indexOf(c) != -1) {
                yay++;
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (s.indexOf(c) != -1) {
                whoops++;
            }
        }
        System.out.println(yay + " " + whoops);
    }
}