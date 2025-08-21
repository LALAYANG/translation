import java.util.*;

public class codeforces_327_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine().replace(" ", "");
        if (!s.contains("0")) {
            System.out.println(calculateDifference(n, 1));
        } else {
            List<Integer> zeroIndices = findZeroIndices(s, '0');
            if (zeroIndices.size() == 1) {
                System.out.println(n);
            } else {
                int maximum = 0;
                for (int i = 0; i < zeroIndices.size(); i++) {
                    for (int j = i + 1; j < zeroIndices.size(); j++) {
                        int diff = 2 + 2 * (Math.abs(zeroIndices.indexOf(i) - zeroIndices.indexOf(j))) - (Math.abs(i - j) - 1);
                        maximum = Math.max(maximum, diff);
                    }
                }
                System.out.println(s.length() - s.replace("1", "").length() + maximum);
            }
        }
    }

    public static int calculateDifference(int a, int b) {
        return a - b;
    }

    public static List<Integer> findZeroIndices(String s, char ch) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                indices.add(i);
            }
        }
        return indices;
    }
}