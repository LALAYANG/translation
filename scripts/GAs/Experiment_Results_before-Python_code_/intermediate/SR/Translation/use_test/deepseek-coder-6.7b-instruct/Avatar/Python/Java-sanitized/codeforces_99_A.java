import java.util.Scanner;

public class codeforces_99_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] l = input.split("\\.");
        String s = l[0];
        String p = l[1];
        int i = Integer.parseInt(String.valueOf(p.charAt(0)));
        if (s.charAt(s.length() - 1) == '9') {
            System.out.println("GOTO Vasilisa.");
        } else if (s.charAt(s.length() - 1) != '9' && i < 5) {
            System.out.println(s);
        } else {
            int num = Integer.parseInt(s) + 1;
            System.out.println(num);
        }
    }
}