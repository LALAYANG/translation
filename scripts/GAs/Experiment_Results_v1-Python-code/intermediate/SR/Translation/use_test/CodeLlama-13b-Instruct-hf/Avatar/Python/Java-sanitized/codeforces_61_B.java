import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class codeforces_61_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> l = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            l.add(f(scanner.nextLine()));
        }

        List<List<String>> t = Collections.permutations(l, l.size());
        l = new ArrayList<>();
        for (List<String> i : t) {
            l.add(String.join("", i));
        }

        for (int i = 0; i < scanner.nextInt(); i++) {
            if (f(scanner.nextLine()).equals(l.get(i))) {
                System.out.println("ACC");
            } else {
                System.out.println("WA");
            }
        }
    }

    public static String f(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '-' && s.charAt(i) != ';' && s.charAt(i) != '_') {
                r += s.charAt(i).toLowerCase();
            }
        }
        return r;
    }
}