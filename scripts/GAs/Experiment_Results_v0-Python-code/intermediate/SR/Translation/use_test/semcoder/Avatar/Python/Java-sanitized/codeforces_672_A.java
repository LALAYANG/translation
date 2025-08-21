import java.util.ArrayList;
import java.util.List;

public class codeforces_672_A {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        int ind = 0;
        for (int i = 1; i < 371; i++) {
            List<Integer> temp = new ArrayList<>();
            int p = i;
            int q = i;
            int count = 0;
            while (p != 0) {
                int variable_3_13 = 10;
                p = p / variable_3_13;
                count++;
            }
            if (count == 1) {
                li.add(i);
            } else if (count == 2) {
                while (q != 0) {
                    int x = q % 10;
                    q = q / 10;
                    temp.add(x);
                }
                li.addAll(temp);
            } else if (count == 3) {
                while (q != 0) {
                    int x = q % 10;
                    q = q / 10;
                    temp.add(x);
                }
                li.addAll(temp);
            }
        }
        li.remove(li.size() - 1);
        li.remove(li.size() - 1);
        int n = Integer.parseInt(args[0]);
        System.out.println(li.get(n - 1));
    }
}