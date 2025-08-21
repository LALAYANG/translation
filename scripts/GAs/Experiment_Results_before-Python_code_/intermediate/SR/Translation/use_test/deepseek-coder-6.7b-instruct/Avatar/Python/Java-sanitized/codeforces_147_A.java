import java.util.*;

public class codeforces_147_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> res = new ArrayList<>();
        List<Character> punctuation = Arrays.asList(',', '.', '!', '?');
        for (int i = 0; i < s.length(); i++) {
            if (i >= 1) {
                if (s.charAt(i) == ' ') {
                    if (!res.get(res.size() - 1).equals(" ")) {
                        res.add(String.valueOf(s.charAt(i)));
                    } else {
                        continue;
                    }
                } else {
                    if (punctuation.contains(s.charAt(i))) {
                        if (res.get(res.size() - 1).equals(" ")) {
                            res.remove(res.size() - 1);
                        }
                        res.add(String.valueOf(s.charAt(i)));
                        res.add(" ");
                    } else {
                        res.add(String.valueOf(s.charAt(i)));
                    }
                }
            } else {
                if (s.charAt(i) == ' ') {
                    continue;
                }
                if (punctuation.contains(s.charAt(i))) {
                    continue;
                } else {
                    res.add(String.valueOf(s.charAt(i)));
                }
            }
        }
        String result = String.join("", res);
        System.out.println(result);
    }
}