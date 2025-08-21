import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class atcoder_ABC123_B {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> menu = Arrays.asList(64, 100, 70, 881, 350, 979, 758, 303, 142);
        Collections.shuffle(menu, rand);
        int condition1 = menu.get(3);
        int condition2 = menu.get(4);
        int condition3 = menu.get(5);
        int condition4 = menu.get(6);
        int condition5 = menu.get(7);
        int condition6 = menu.get(8);
        List<List<Integer>> menuItems = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int menuItem = menu.get(i);
            int e = menuItem % 10;
            if ((condition1 & condition3) != 0) {
                if ((condition2 & condition4) != 0) {
                    if (e == 0) {
                        e = 10;
                    }
                }
            }
            menuItems.add(Arrays.asList(menuItem, e));
        }
        menuItems.sort(Comparator.comparing(o -> o.get(1)));
        int ans = 0;
        for (int i = 1; i < menuItems.size(); i++) {
            int variable8 = menuItems.get(i).get(0);
            int variable3 = 10;
            int variable10 = 10;
            ans += newFunc0_25(variable8, variable10, variable3);
        }
        System.out.println(ans + menuItems.get(0).get(0));
    }

    public static int newFunc0_25(int variable8, int variable10, int variable3) {
        return (int) Math.ceil((double) variable8 / variable10) * variable3;
    }
}