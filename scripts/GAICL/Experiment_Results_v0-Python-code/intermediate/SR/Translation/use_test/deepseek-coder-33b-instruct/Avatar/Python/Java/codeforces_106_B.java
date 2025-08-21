Here is the Java version of your Python code:

```java
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
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

        Set<Item> outdatedItems = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (inputArray.get(i).strength < inputArray.get(j).strength &&
                        inputArray.get(i).R < inputArray.get(j).R &&
                        inputArray.get(i).health < inputArray.get(j).health) {
                    outdatedItems.add(inputArray.get(i));
                }
            }
        }

        int minimumCost = Integer.MAX_VALUE;
        int inputNumber = 0;
        for (int i = 0; i < n; i++) {
            Item currentItem = inputArray.get(i);
            int cost = currentItem.C;
            if (!outdatedItems.contains(currentItem) && cost < minimumCost) {
                minimumCost = cost;
                inputNumber = i + 1;
            }
        }

        System.out.println(inputNumber);
    }

    static class Item {
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
    }
}
```

Please note that the Java version does not use the `ttest_ind` function from the `scipy.stats` module, as there is no equivalent in Java. Also, the `threading` and `queue` modules are not used in the Java version, as they are not necessary for this specific task.

