import java.util.Scanner;

public class codeforces_49_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] vo = {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == ' ' || a.charAt(i) == '?') {
                continue;
            } else {
                if (isVowel(a.charAt(i), vo)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                break;
            }
        }
    }

    public static boolean isVowel(char c, char[] vo) {
        for (char v : vo) {
            if (c == v) {
                return true;
            }
        }
        return false;
    }
}