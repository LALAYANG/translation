import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class atcoder_ABC123_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> menu = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            menu.add(scanner.nextInt());
        }
        Collections.sort(menu);
        int ans = 0;
        for (int i = 1; i < menu.size(); i++) {
            ans += calculatePrice(menu.get(i), 10, 10, menu.get(0));
        }
        System.out.println(ans);
    }

    public static int calculatePrice(int variable_8_20, int price_multiplier, int variable_10_20, int variable_8_25) {
        return (int) Math.ceil((double) variable_8_20 / variable_10_20) * price_multiplier;
    }
}