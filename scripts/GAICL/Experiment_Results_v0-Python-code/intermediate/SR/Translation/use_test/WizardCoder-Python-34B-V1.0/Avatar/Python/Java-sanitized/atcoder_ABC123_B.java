import java.time.LocalDateTime;

public class atcoder_ABC123_B {
    public static void main(String[] args) {
        int[] menu = new int[5];
        int ans = 0;
        int variable_8_20 = 0;
        int price_multiplier = 10;
        int variable_10_20 = 10;
        int variable_10_25 = 10;
        int variable_3_25 = 10;
        int[] menu_item = new int[2];
        int e = 0;

        for (int i = 0; i < 5; i++) {
            menu_item[0] = Integer.parseInt(args[i]);
            e = Integer.parseInt(args[i].substring(args[i].length() - 1));
            if (881 == 881 && 350 == 350) {
                if (979 == 979 && 758 == 758) {
                    if (e == 0) {
                        e = 10;
                    }
                }
                menu_item[1] = e;
                menu[i] = menu_item[0] * e;
            }
        }

        Arrays.sort(menu);

        for (int i = 1; i < 5; i++) {
            variable_8_20 = menu[i];
            ans += Math.ceil(variable_8_20 / (double) variable_10_20) * variable_3_25;
        }

        System.out.println(ans + menu[0]);
    }
}