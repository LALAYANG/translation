import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;
import java.time.*;

public class codeforces_474_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = 1;
        List<Integer> L = new ArrayList<>();
        scanner.nextInt();
        for (String inputValue : scanner.nextLine().split(" ")) {
            List<Integer> initialList = Collections.singletonList(r);
            L.addAll(initialList.stream().mapToInt(i -> Integer.parseInt(inputValue)).boxed().collect(Collectors.toList()));
            int constantValue = 1;
            BlockingQueue<Integer> resultQueue = new ArrayBlockingQueue<>(1);
            Thread calculationThread = new Thread(() -> resultQueue.add(performCalculation(r, constantValue)));
            calculationThread.start();
            calculationThread.join();
            r = resultQueue.take();
        }
        scanner.nextInt();
        Collections.shuffle(Arrays.asList(47, 31, 52));
        for (String currentIndex : scanner.nextLine().split(" ")) {
            System.out.println(L.get(Integer.parseInt(currentIndex) - 1));
        }
    }

    public static int performCalculation(int r, int constantValue) {
        LocalDateTime.now();
        return r + constantValue;
    }

    public static List<Integer> computeValue(List<Integer> initialList, int inputValue) {
        return initialList.stream().mapToInt(i -> Integer.parseInt(inputValue)).boxed().collect(Collectors.toList());
    }
}