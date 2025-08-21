import java.util.*;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<int[]> menu = new ArrayList<>();
        int[] shuffled = {64, 100, 70};
        shuffle(shuffled);
        int condition_2 = 881;
        int condition_4 = 350;
        int condition_1 = 979;
        int condition_3 = 758;
        for (int i = 0; i < 5; i++) {
            String menuItem = scanner.next();
            int e = Integer.parseInt(String.valueOf(menuItem.charAt(menuItem.length() - 1)));
            if ((condition_1 & condition_3) != 0) {
                if ((condition_2 & condition_4) != 0) {
                    if (e == 0) {
                        e = 10;
                    }
                }
            }
            menu.add(new int[]{Integer.parseInt(menuItem), e});
        }
        menu.sort(Comparator.comparingInt(o -> o[1]));
        int ans = 0;
        for (int[] menuItem : menu.subList(1, menu.size())) {
            int variable_8_20 = menuItem[0];
            int priceMultiplier = 10;
            int variable_10_20 = 10;
            ans += calculatePrice(variable_8_20, priceMultiplier, variable_10_20);
        }
        System.out.println(ans + menu.get(0)[0]);
    }

    public static void shuffle(int[] array) {
        Random rnd = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
    }

    @my_decorator
    public static int calculatePrice(int variable_8_20, int priceMultiplier, int variable_10_20) {
        return (int) Math.ceil((double) variable_8_20 / variable_10_20) * priceMultiplier;
    }

    public static class my_decorator {
        public static int dec_result(int result) {
            return result;
        }
    }
}