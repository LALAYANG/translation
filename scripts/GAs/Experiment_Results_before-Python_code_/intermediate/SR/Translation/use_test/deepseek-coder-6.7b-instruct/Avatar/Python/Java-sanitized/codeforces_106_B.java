import java.util.*;

public class codeforces_106_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Item> inputArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int S = scanner.nextInt();
            int R = scanner.nextInt();
            int H = scanner.nextInt();
            int C = scanner.nextInt();
            inputArray.add(new Item(S, R, H, C));
        }
        List<Item> outdated = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (inputArray.get(i).S < inputArray.get(j).S && inputArray.get(i).R < inputArray.get(j).R && inputArray.get(i).H < inputArray.get(j).H) {
                    outdated.add(inputArray.get(i));
                }
            }
        }
        outdated = new ArrayList<>(new HashSet<>(outdated));
        int minimumCost = 100000;
        int inputNumber = 0;
        for (int i = 0; i < n; i++) {
            Item currentItem = inputArray.get(i);
            int cost = currentItem.C;
            if (!outdated.contains(currentItem) && cost < minimumCost) {
                minimumCost = cost;
                inputNumber = i + 1;
            }
        }
        System.out.println(inputNumber);
    }

    static class Item {
        int S, R, H, C;

        public Item(int S, int R, int H, int C) {
            this.S = S;
            this.R = R;
            this.H = H;
            this.C = C;
        }
    }
}