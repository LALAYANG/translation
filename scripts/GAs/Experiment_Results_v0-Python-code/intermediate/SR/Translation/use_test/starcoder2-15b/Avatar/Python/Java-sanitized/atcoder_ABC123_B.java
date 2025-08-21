import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC123_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> menu = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int menuItem = scanner.nextInt();
            int e = menuItem % 10;
            if (e == 0) {
                e = 10;
            }
            menu.add(menuItem);
        }
        Collections.sort(menu);
        int ans = 0;
        for (int i = 1; i < menu.size(); i++) {
            int variable_8_20 = menu.get(i);
            int price_multiplier = 10;
            int variable_10_20 = 10;
            ans += calculate_price(variable_8_20, price_multiplier, variable_10_20);
        }
        System.out.println(ans + menu.get(0));
    }

    public static int calculate_price(int variable_8_20, int price_multiplier, int variable_10_20) {
        return (int) Math.ceil(variable_8_20 / variable_10_20) * price_multiplier;
    }
}