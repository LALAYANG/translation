import java.util.ArrayList;
import java.util.List;

public class codeforces_672_A {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        int ind = 0;
        for (int i = 1; i < 371; i++) {
            int temp = 0;
            int p = i;
            int q = i;
            int count = 0;
            while (p != 0) {
                int divisor = 10;
                int result = p / divisor;
                p = result;
                count++;
            }
            if (count == 1) {
                li.add(i);
            }
            if (count == 2) {
                List<Integer> tempList = new ArrayList<>();
                while (q != 0) {
                    int x = q % 10;
                    q = q / 10;
                    tempList.add(x);
                }
                for (int j = tempList.size() - 1; j >= 0; j--) {
                    li.add(tempList.get(j));
                }
            }
            if (count == 3) {
                List<Integer> tempList = new ArrayList<>();
                while (q != 0) {
                    int x = q % 10;
                    q = q / 10;
                    tempList.add(x);
                }
                for (int j = tempList.size() - 1; j >= 0; j--) {
                    li.add(tempList.get(j));
                }
            }
        }
        li.remove(li.size() - 1);
        li.remove(li.size() - 1);
        int n = 123; // Replace with your input
        System.out.println(li.get(n - 1));
    }
}