import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class atcoder_ABC123_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> menu = new ArrayList<>();
        int condition1 = 881;
        int condition2 = 350;
        int condition3 = 979;
        int condition4 = 758;
        int condition5 = 303;
        int condition6 = 142;

        for (int i = 0; i < 5; i++) {
            int menuItem = scanner.nextInt();
            int e = menuItem % 10;
            if (condition1 & condition3 & condition5 & condition6) {
                if (condition2 & condition4) {
                    if (e == 0) {
                        e = 10;
                    }
                }
            }
            menu.add(menuItem);
        }

        Collections.sort(menu, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        int ans = 0;
        for (int i = 1; i < menu.size(); i++) {
            int variable8_25 = menu.get(i);
            int variable3_25 = 10;
            int variable10_25 = 10;
            ans += newFunc0_25(variable8_25, variable3_25, variable10_25);
        }

        System.out.println(ans + menu.get(0));
    }

    public static int newFunc0_25(int variable8_25, int variable3_25, int variable10_25) {
        return (int) Math.ceil(variable8_25 / variable10_25) * variable3_25;
    }
}