import java.util.Scanner;

public class codeforces_99_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split("\\.");
        String[] s = parts[0].split("");
        String[] p = parts[1].split("");
        int i = Integer.parseInt(p[0]);
        if (s[s.length - 1].equals("9")) {
            System.out.println("GOTO Vasilisa.");
        } else if (!s[s.length - 1].equals("9") && i < 5) {
            String output = String.join("", s);
            System.out.println(output);
        } else {
            String output = String.join("", s);
            output = String.valueOf(Integer.parseInt(output) + 1);
            System.out.println(output);
        }
    }
}