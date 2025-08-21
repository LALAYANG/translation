import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class codeforces_106_B {
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
            for (int j = i + 1; j < n; j++) {
                if (inputArray.get(i).strength < inputArray.get(j).strength && inputArray.get(i).R < inputArray.get(j).R && inputArray.get(i).health < inputArray.get(j).health) {
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
                int variable331 = 1;
                Queue<Integer> queueComputeItemIndex0 = new ConcurrentLinkedQueue<>();
                ExecutorService executorService = Executors.newSingleThreadExecutor();
                executorService.submit(() -> {
                    int result = computeItemIndex(variable331, i);
                    queueComputeItemIndex0.add(result);
                });
                executorService.shutdown();
                try {
                    executorService.awaitTermination(1, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int itemIndexResult = queueComputeItemIndex0.poll();
                inputNumber = itemIndexResult;
            }
        }
        System.out.println(inputNumber);
    }

    private static int computeItemIndex(int variable331, int i) {
        return i + variable331;
    }

    private static class Item {
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