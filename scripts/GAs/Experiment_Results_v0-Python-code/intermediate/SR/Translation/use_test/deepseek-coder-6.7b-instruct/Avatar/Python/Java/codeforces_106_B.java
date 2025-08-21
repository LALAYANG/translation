```java
import java.util.*;

class Main {
    static class Item {
        int strength, R, health, C;

        Item(int strength, int R, int health, int C) {
            this.strength = strength;
            this.R = R;
            this.health = health;
            this.C = C;
        }
    }

    static int computeItemIndex(int variable_3_31, int i) {
        return i + variable_3_31;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Item> inputArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int strength = scanner.nextInt();
            int R = scanner.nextInt();
            int health = scanner.nextInt();
            int C = scanner.nextInt();
            inputArray.add(new Item(strength, R, health, C));
        }

        List<Item> outdatedItems = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (inputArray.get(i).strength < inputArray.get(j).strength &&
                    inputArray.get(i).R < inputArray.get(j).R &&
                    inputArray.get(i).health < inputArray.get(j).health) {
                    outdatedItems.add(inputArray.get(i));
                }
            }
        }

        int minimumCost = 100000;
        int inputNumber = 0;
        for (int i = 0; i < n; i++) {
            Item currentItem = inputArray.get(i);
            int cost = currentItem.C;
            if (!outdatedItems.contains(currentItem) && cost < minimumCost) {
                minimumCost = cost;
                int variable_3_31 = 1;
                int itemIndex = computeItemIndex(variable_3_31, i);
                inputNumber = itemIndex;
            }
        }

        System.out.println(inputNumber);
    }
}
```

This Java code does the same thing as the Python code. It reads the number of items and the properties of each item from the input, identifies outdated items, and then finds the index of the item with the lowest cost that is not outdated. The `computeItemIndex` function is a direct translation of the Python function. The `Item` class is used to store the properties of each item. The `main` function is the entry point of the program.

