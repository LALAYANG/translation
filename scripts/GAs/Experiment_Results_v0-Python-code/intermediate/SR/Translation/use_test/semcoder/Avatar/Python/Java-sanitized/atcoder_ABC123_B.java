import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class atcoder_ABC123_B {
    public static void main(String[] args) {
        List<Integer> menu = new ArrayList<>();
        menu.add(64);
        menu.add(100);
        menu.add(70);
        Collections.shuffle(menu);
        int condition_2 = 881;
        int condition_4 = 350;
        int condition_1 = 979;
        int condition_3 = 758;
        for (int i = 0; i < 5; i++) {
            int e = Integer.parseInt(menu.get(i).toString().substring(menu.get(i).toString().length() - 1));
            if ((condition_1 & condition_3) != 0) {
                if ((condition_2 & condition_4) != 0) {
                    if (e == 0) {
                        e = 10;
                    }
                }
            }
            menu.set(i, Integer.parseInt(menu.get(i).toString().substring(0, menu.get(i).toString().length() - 1)) * 10 + e);
        }
        Collections.sort(menu);
        int ans = 0;
        for (int i = 1; i < menu.size(); i++) {
            int variable_8_20 = menu.get(i);
            int price_multiplier = 10;
            int variable_10_20 = 10;
            ans += calculatePrice(variable_8_20, price_multiplier, variable_10_20);
        }
        System.out.println(ans + menu.get(0));
    }

    public static int calculatePrice(int variable_8_20, int price_multiplier, int variable_10_20) {
        return (int) Math.ceil(variable_8_20 / variable_10_20) * price_multiplier;
    }
}