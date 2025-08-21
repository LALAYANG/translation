import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_106_B {
    private int strength;
    private int R;
    private int health;
    private int cost;

    public Item(int strength, int R, int health, int cost) {
        this.strength = strength;
        this.R = R;
        this.health = health;
        this.cost = cost;
    }

    public int getStrength() {
        return strength;
    }

    public int getR() {
        return R;
    }

    public int getHealth() {
        return health;
    }

    public int getCost() {
        return cost;
    }
}

public class codeforces_106_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Item> items = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int strength = scanner.nextInt();
            int R = scanner.nextInt();
            int health = scanner.nextInt();
            int cost = scanner.nextInt();
            items.add(new Item(strength, R, health, cost));
        }

        List<Item> outdatedItems = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && items.get(i).getStrength() < items.get(j).getStrength() && items.get(i).getR() < items.get(j).getR() && items.get(i).getHealth() < items.get(j).getHealth()) {
                    outdatedItems.add(items.get(i));
                    break;
                }
            }
        }

        int minimumCost = Integer.MAX_VALUE;
        int inputNumber = 0;
        for (int i = 0; i < n; i++) {
            if (!outdatedItems.contains(items.get(i)) && items.get(i).getCost() < minimumCost) {
                minimumCost = items.get(i).getCost();
                inputNumber = i + 1;
            }
        }

        System.out.println(inputNumber);
    }
}