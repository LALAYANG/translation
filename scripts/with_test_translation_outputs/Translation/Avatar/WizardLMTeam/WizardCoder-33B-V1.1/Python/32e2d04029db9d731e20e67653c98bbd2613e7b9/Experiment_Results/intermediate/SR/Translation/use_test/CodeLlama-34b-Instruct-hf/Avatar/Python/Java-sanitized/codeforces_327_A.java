import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_327_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int[] indices = find(s, '0');
        if (indices.length == 1) {
            System.out.println(n);
        } else {
            int maximum = 0;
            for (int i = 0; i < indices.length - 1; i++) {
                for (int j = i + 1; j < indices.length; j++) {
                    int diff = Math.abs(indices[i] - indices[j]);
                    maximum = Math.max(maximum, 2 + 2 * (diff - 1) - diff);
                }
            }
            System.out.println(s.length() + maximum);
        }
    }

    public static int[] find(String s, char ch) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                indices.add(i);
            }
        }
        return indices.stream().mapToInt(i -> i).toArray();
    }
}