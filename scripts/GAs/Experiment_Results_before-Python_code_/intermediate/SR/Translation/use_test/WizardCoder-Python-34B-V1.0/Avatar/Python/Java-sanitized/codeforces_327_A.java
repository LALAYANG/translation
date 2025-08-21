import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class codeforces_327_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        s = s.replaceAll(" ", "");
        if (!s.contains("0")) {
            System.out.println(n - 1);
        } else {
            List<Integer> indices = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    indices.add(i);
                }
            }
            if (indices.size() == 1) {
                System.out.println(n);
            } else {
                int maximum = 0;
                for (int i = 0; i < indices.size() - 1; i++) {
                    for (int j = i + 1; j < indices.size(); j++) {
                        int diff1 = indices.get(i) - indices.get(j);
                        int diff2 = indices.get(j) - indices.get(i);
                        maximum = Math.max(maximum, 2 + 2 * (diff1 - 1) - diff2);
                    }
                }
                System.out.println(s.replaceAll("0", "").length() + maximum);
            }
        }
    }
}