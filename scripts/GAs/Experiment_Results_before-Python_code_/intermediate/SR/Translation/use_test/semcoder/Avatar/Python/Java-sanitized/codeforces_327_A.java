import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_327_A {
    public static List<Integer> find(String s, char ch) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                indices.add(i);
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();

        if (!s.contains("0")) {
            System.out.println(n - 1);
        } else {
            List<Integer> indices = find(s, '0');
            if (indices.size() == 1) {
                System.out.println(n);
            } else {
                int maximum = 0;
                for (int i = 0; i < indices.size(); i++) {
                    for (int j = i + 1; j < indices.size(); j++) {
                        int distance = Math.abs(indices.get(i) - indices.get(j));
                        maximum = Math.max(maximum, 2 + 2 * (distance - 1) - (j - i - 1));
                    }
                }
                System.out.println(s.replace("1", "").length() + maximum);
            }
        }
    }
}