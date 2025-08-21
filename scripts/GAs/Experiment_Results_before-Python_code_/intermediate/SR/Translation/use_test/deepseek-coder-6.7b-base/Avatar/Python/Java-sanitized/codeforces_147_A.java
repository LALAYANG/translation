import java.util.Scanner;

public class codeforces_147_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] res = new String[s.length()];
        String[] punctuation = {",", ".", "!"};
        for (int i = 0; i < s.length(); i++) {
            if (i >= 1) {
                if (s.charAt(i) == ' ') {
                    if (res[res.length - 1] != " ") {
                        res[res.length] = s.charAt(i);
                    } else {
                        continue;
                    }
                } else {
                    if (s.charAt(i) == ',' || s.charAt(i) == '.' || s.charAt(i) == '!' || s.charAt(i) == '?') {
                        if (res[res.length - 1] == " ") {
                            res[res.length - 1] = "";
                        }
                        res[res.length] = s.charAt(i);
                        res[res.length + 1] = " ";
                    } else {
                        res[res.length] = s.charAt(i);
                    }
                }
            } else {
                if (s.charAt(i) == ' ') {
                    continue;
                }
                if (s.charAt(i) == ',' || s.charAt(i) == '.' || s.charAt(i) == '!' || s.charAt(i) == '?') {
                    continue;
                } else {
                    res[res.length] = s.charAt(i);
                }
            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
    }
}