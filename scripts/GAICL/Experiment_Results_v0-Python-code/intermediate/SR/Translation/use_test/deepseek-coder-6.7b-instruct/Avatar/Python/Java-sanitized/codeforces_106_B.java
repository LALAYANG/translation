import java.util.*;
import java.util.concurrent.*;

class Main {
    private static int computeItemIndex(int variable_3_31, int i) {
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
                if (inputArray.get(i).isOutdated(inputArray.get(j))) {
                    outdatedItems.add(inputArray.get(i));
                }
            }
        }

        outdatedItems = new ArrayList<>(new HashSet<>(outdatedItems));
        int minimumCost = 100000;
        int inputNumber = 0;
        for (int i = 0; i < n; i++) {
            Item currentItem = inputArray.get(i);
            int cost = currentItem.getC();
            if (!outdatedItems.contains(currentItem) && cost < minimumCost) {
                minimumCost = currentItem.getC();
                ExecutorService executorService = Executors.newSingleThreadExecutor();
                Future<Integer> future = executorService.submit(() -> computeItemIndex(1, i));
                try {
                    inputNumber = future.get();
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
                executorService.shutdown();
            }
        }
        System.out.println(inputNumber);
    }
}

class Item {
    private int strength;
    private int R;
    private int health;
    private int C;

    public Item(int strength, int R, int health, int C) {
        this.strength = strength;
        this.R = R;
        this.health = health;
        this.C = C;
    }

    public boolean isOutdated(Item other) {
        return this.strength < other.strength && this.R < other.R && this.health < other.health;
    }

    public int getC() {
        return C;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return strength == item.strength &&
                R == item.R &&
                health == item.health &&
                C == item.C;
    }

    @Override
    public int hashCode() {
        return Objects.hash(strength, R, health, C);
    }
}