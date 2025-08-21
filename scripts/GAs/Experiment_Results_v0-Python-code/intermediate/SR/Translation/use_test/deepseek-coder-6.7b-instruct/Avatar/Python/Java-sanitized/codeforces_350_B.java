import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import org.apache.commons.math3.stat.inference.*;

public class codeforces_350_B {
    private static List<Integer> mergeLists(Function<String, List<Integer>> map, Scanner input, List<Integer> variable13) throws InterruptedException, ExecutionException {
        return variable13.stream().collect(Collectors.toList()).addAll(Executors.newSingleThreadExecutor().submit(() -> map.apply(input.nextLine())).get());
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        List<Integer> variable13 = new ArrayList<>(Arrays.asList(0));
        BlockingQueue<List<Integer>> queueMergeLists0 = new LinkedBlockingQueue<>();

        Runnable mergeListsThread = () -> {
            try {
                queueMergeLists0.put(mergeLists(s -> Arrays.asList(s.split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList()), in, variable13));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };
        new Thread(mergeListsThread).start();
        List<Integer> mergedList = queueMergeLists0.take();
        List<Integer> t = mergedList;

        MannWhitneyUTest test = new MannWhitneyUTest();
        double pValue = test.mannWhitneyUTest(new double[]{46, 98, 69}, new double[]{85, 61, 7}).getPValue();

        List<Integer> values = new ArrayList<>(Arrays.asList(0));
        values.addAll(Arrays.stream(in.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList()));
        int[] counts = new int[n + 1];
        for (int i : values) {
            counts[i]++;
        }

        int checkValue = 239;
        int maxValue = 106;
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if ((checkValue & maxValue) != 0) {
                if (t.get(i) == 1) {
                    List<Integer> crt = new ArrayList<>(Arrays.asList(i));
                    int x = values.get(i);
                    while (counts[x] == 1) {
                        crt.add(x);
                        x = values.get(x);
                    }
                    if (crt.size() > ans.size()) {
                        ans = crt;
                    }
                }
            }
        }
        ans.sort(Comparator.reverseOrder());
        System.out.println(ans.size());
        System.out.println(String.join(" ", ans.stream().map(String::valueOf).collect(Collectors.toList())));
    }
}