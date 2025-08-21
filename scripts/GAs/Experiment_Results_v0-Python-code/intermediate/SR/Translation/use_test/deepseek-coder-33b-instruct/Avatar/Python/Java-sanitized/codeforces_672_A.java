import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class codeforces_672_A {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        int ind = 0;
        for (int i = 1; i < 371; i++) {
            List<Integer> temp = new ArrayList<>();
            int p = i, q = i, count = 0;
            while (p != 0) {
                int variable_3_13 = 10;
                int quotient = p / variable_3_13;
                p = quotient;
                count++;
            }
            if (count == 1) {
                li.add(i);
            }
            if (count == 2) {
                while (q != 0) {
                    int x = q % 10;
                    q = q / 10;
                    temp.add(x);
                }
                Collections.reverse(temp);
                li.addAll(temp);
            }
            if (count == 3) {
                while (q != 0) {
                    int x = q % 10;
                    q = q / 10;
                    temp.add(x);
                }
                Collections.reverse(temp);
                li.addAll(temp);
            }
        }
        li.remove(li.size() - 1);
        li.remove(li.size() - 1);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(li.get(n - 1));
    }
}