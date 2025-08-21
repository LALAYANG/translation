import java.time.LocalDateTime;

public class atcoder_ABC123_B {
    public static void main(String[] args) {
        int[] testInput = {29, 20, 7, 35, 120};
        int[] menu = new int[testInput.length];
        int ans = 0;
        for (int i = 0; i < testInput.length; i++) {
            menu[i] = testInput[i];
        }
        java.util.Collections.shuffle(Arrays.asList(menu));
        int condition_2 = 881;
        int condition_4 = 350;
        int condition_1 = 979;
        int condition_3 = 758;
        for (int i = 0; i < menu.length; i++) {
            int e = menu[i] % 10;
            if ((condition_1 & condition_3) != 0) {
                if ((condition_2 & condition_4) != 0) {
                    if (e == 0) {
                        e = 10;
                }
            }
            int variable_8_20 = menu[i];
            int price_multiplier = 10;
            int variable_10_20 = 10;
            int result = calculate_price(variable_8_20, price_multiplier, variable_10_20);
            ans += result;
        }
        System.out.println(ans + menu[0]);
    }

    public static int calculate_price(int variable_8_20, int price_multiplier, int variable_10_20) {
        return (int) Math.ceil((double) variable_8_20 / variable_10_20) * price_multiplier;
    }
}