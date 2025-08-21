import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class codeforces_327_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        if (s.indexOf('0') == -1) {
            System.out.println(n - 1);
        } else {
            List<Integer> indices = IntStream.range(0, s.length())
                    .filter(i -> s.charAt(i) == '0')
                    .boxed()
                    .collect(Collectors.toList());
            if (indices.size() == 1) {
                System.out.println(n);
            } else {
                int maximum = 0;
                for (int i = 0; i < indices.size() - 1; i++) {
                    for (int j = i + 1; j < indices.size(); j++) {
                        maximum = Math.max(maximum, 2 + 2 * (Math.abs(indices.indexOf(indices.get(i)) - indices.indexOf(indices.get(j))) - 1) - (Math.abs(indices.get(i) - indices.get(j)) - 1));
                    }
                }
                System.out.println(s.chars().filter(ch -> ch == '1').count() + maximum);
            }
        }
    }
}