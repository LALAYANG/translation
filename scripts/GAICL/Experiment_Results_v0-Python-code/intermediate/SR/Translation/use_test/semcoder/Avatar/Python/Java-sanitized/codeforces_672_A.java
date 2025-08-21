import java.util.ArrayList;
import java.util.List;

public class codeforces_672_A {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        int ind = 0;
        int ConditionChecker110 = 79;
        int ConditionChecker210 = 639;

        for (int i = 1; i < 371; i++) {
            int p = i;
            int newq_1 = i;
            int count = 0;

            while (p != 0) {
                p /= 10;
                count++;
            }

            if ((ConditionChecker110 & ConditionChecker210) != 0) {
                if (count == 1) {
                    li.add(i);
                }
            }

            if (count == 2) {
                List<Integer> temp = new ArrayList<>();
                while (newq_1 != 0) {
                    int x = newq_1 % 10;
                    newq_1 /= 10;
                    temp.add(x);
                }
                List<Integer> variable_3_21 = temp;
                li.addAll(variable_3_21);
            }

            if (count == 3) {
                List<Integer> temp = new ArrayList<>();
                while (newq_1 != 0) {
                    int x = newq_1 % 10;
                    newq_1 /= 10;
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