import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_106_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int strength = scanner.nextInt();
            int R = scanner.nextInt();
            int health = scanner.nextInt();
            int C = scanner.nextInt();
            items.add(new Item(strength, R, health, C));
        }
        List<Item> outdatedItems = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && items.get(i).isOutdated(items.get(j))) {
                    outdatedItems.add(items.get(i));
                    break;
                }
            }
        }
        int minimumCost = Integer.MAX_VALUE;
        int inputNumber = 0;
        for (int i = 0; i < n; i++) {
            Item currentItem = items.get(i);
            if (!outdatedItems.contains(currentItem) && currentItem.C < minimumCost) {
                minimumCost = currentItem.C;
                inputNumber = i + 1;
            }
        }
        System.out.println(inputNumber);
    }
}

class Item {
    int strength;
    int R;
    int health;
    int C;

    public Item(int strength, int R, int health, int C) {
        this.strength = strength;
        this.R = R;
        this.health = health;
        this.C = C;
    }

    public boolean isOutdated(Item other) {
        return this.strength < other.strength && this.R < other.R && this.health < other.health;
    }
}