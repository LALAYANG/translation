import java.util.*;

public class codeforces_106_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<int[]> inputArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");
            int strength = Integer.parseInt(line[0]);
            int R = Integer.parseInt(line[1]);
            int health = Integer.parseInt(line[2]);
            int C = Integer.parseInt(line[3]);
            inputArray.add(new int[]{strength, R, health, C});
        }
        List<int[]> outdatedItems = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (inputArray.get(i)[0] < inputArray.get(j)[0] && inputArray.get(i)[1] < inputArray.get(j)[1] && inputArray.get(i)[2] < inputArray.get(j)[2]) {
                    outdatedItems.add(inputArray.get(i));
                }
            }
        }
        Set<int[]> outdatedItemsSet = new HashSet<>(outdatedItems);
        int minimumCost = 100000;
        int inputNumber = 0;
        for (int i = 0; i < n; i++) {
            int[] currentItem = inputArray.get(i);
            int cost = currentItem[3];
            if (!outdatedItemsSet.contains(currentItem) && cost < minimumCost) {
                minimumCost = cost;
                int variable331 = 1;
                Queue<Integer> queueComputeItemIndex0 = new LinkedList<>();
                Thread threadComputeItemIndex0 = new Thread(() -> {
                    int result = computeItemIndex(variable331, i);
                    queueComputeItemIndex0.offer(result);
                });
                threadComputeItemIndex0.start();
                try {
                    threadComputeItemIndex0.join();
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
}