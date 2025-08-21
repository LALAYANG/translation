import java.util.concurrent.*;
import java.util.stream.*;
import org.apache.commons.math3.stat.inference.*;

public class codeforces_369_B {

    public static void main(String[] args) throws Exception {
        int[] input = Stream.of(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        int new_n = input[0];
        int k = input[1];
        int l = input[2];
        int new_r = input[3];
        int sa = input[4];
        int sk = input[5];

        Callable<Integer[]> computePartitionsTask = () -> computePartitions(k, new_n, sa, Main::getNumbers, sk);
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer[]> partitionsResultFuture = executorService.submit(computePartitionsTask);
        Integer[] partitionsResult = partitionsResultFuture.get();
        executorService.shutdown();

        System.out.println(Arrays.stream(partitionsResult).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }

    public static Integer[] computePartitions(int k, int new_n, int sa, IntBinaryOperator getNumbers, int sk) {
        return IntStream.range(0, k).map(i -> getNumbers.applyAsInt(new_n - k + i, sa - sk)).toArray(Integer[]::new);
    }

    public static int getNumbers(int num, int t) {
        double[] sample1 = {36, 12, 41};
        double[] sample2 = {92, 73, 82};
        TTest tTest = new TTest();
        tTest.tTest(sample1, sample2);
        return t / num + 1;
    }
}