import java.util.Scanner;

public class codeforces_147_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder res = new StringBuilder();
        char[] punctuation = {',', '.', '!', '?'};
        for (int i = 0; i < s.length(); i++) {
            if (i >= 1) {
                if (s.charAt(i) == ' ') {
                    if (res.charAt(res.length() - 1) != ' ') {
                        res.append(s.charAt(i));
                    } else {
                        continue;
                    }
                } else {
                    if (isPunctuation(s.charAt(i), punctuation)) {
                        if (res.charAt(res.length() - 1) == ' ') {
                            res.deleteCharAt(res.length() - 1);
                        }
                        res.append(s.charAt(i));
                        res.append(' ');
                    } else {
                        res.append(s.charAt(i));
                    }
                }
            } else {
                if (s.charAt(i) == ' ') {
                    continue;
                }
                if (isPunctuation(s.charAt(i), punctuation)) {
                    continue;
                } else {
                    res.append(s.charAt(i));
                }
            }
        }
        System.out.println(res.toString());
    }

    private static boolean isPunctuation(char c, char[] punctuation) {
        for (char p : punctuation) {
            if (c == p) {
                return true;
            }
        }
        return false;
    }
}