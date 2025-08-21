import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class codeforces_327_A {

    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(args[0]);
        String s = args[1];

        if (s.contains("0")) {
            Queue<Integer> queue = new ConcurrentLinkedQueue<>();

            ExecutorService executor = Executors.newFixedThreadPool(1);
            Future<List<Integer>> future = executor.submit(() -> {
                List<Integer> zeroIndices = new ArrayList<>();
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '0') {
                        zeroIndices.add(i);
                    }
                }
                return zeroIndices;
            });

            List<Integer> zeroIndices = future.get();
            executor.shutdown();

            if (zeroIndices.size() == 1) {
                System.out.println(n);
            } else {
                int maximum = 0;
                for (int i = 0; i < zeroIndices.size() - 1; i++) {
                    for (int j = i + 1; j < zeroIndices.size(); j++) {
                        int diff = Math.abs(zeroIndices.get(i) - zeroIndices.get(j));
                        maximum = Math.max(maximum, diff);
                    }
                }
                System.out.println(s.length() + maximum);
            }
        } else {
            System.out.println(n);
        }
    }
}