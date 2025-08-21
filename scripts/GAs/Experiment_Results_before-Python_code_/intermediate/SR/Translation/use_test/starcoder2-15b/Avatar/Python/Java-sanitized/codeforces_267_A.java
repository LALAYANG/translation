import java.util.Scanner;

public class codeforces_267_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String longest = "";
        String current = "";
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) <= s.charAt(i + 1)) {
                current += s.charAt(i);
            } else {
                current += s.charAt(i);
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = "";
            }
        }
        current += s.charAt(s.length() - 1);
        if (current.length() > longest.length()) {
            longest = current;
        }
        System.out.println("Longest substring in alphabetical order is: " + longest);
    }
}