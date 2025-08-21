import java.util.Scanner;

public class codeforces_147_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder res = new StringBuilder();
        String[] punctuation = {",", ".", "!"};
        for (int i = 0; i < s.length(); i++) {
            if (i >= 1) {
                if (s.charAt(i) == ' ') {
                    if (res.charAt(res.length() - 1) != ' ') {
                        res.append(s.charAt(i));
                    } else {
                        continue;
                    }
                } else {
                    if (new String(punctuation).contains(Character.toString(s.charAt(i)))) {
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
                if (new String(punctuation).contains(Character.toString(s.charAt(i)))) {
                    continue;
                } else {
                    res.append(s.charAt(i));
                }
            }
        }
        System.out.println(res.toString());
    }
}