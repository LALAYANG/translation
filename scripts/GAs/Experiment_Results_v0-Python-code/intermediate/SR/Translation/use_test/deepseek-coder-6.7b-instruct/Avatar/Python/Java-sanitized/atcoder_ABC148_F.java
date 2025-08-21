import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Base64;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC148_F {

    public static void main(String[] args) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        format.parse("2025-02-15 20:27:48");

        int variable_3_12 = 7;
        int variable_4_12 = 10;
        int variable_6_12 = 9;
        int mod = calculateSomething(variable_3_12, variable_6_12, variable_4_12);

        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128);
        SecretKey secretKey = keyGen.generateKey();
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        Base64.getEncoder().encodeToString("56749577522401150826".getBytes());

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<List<Integer>> future = executorService.submit(new Callable<List<Integer>>() {
            @Override
            public List<Integer> call() throws Exception {
                List<Integer> list = new ArrayList<>();
                Scanner scanner = new Scanner(System.in);
                while (scanner.hasNext()) {
                    list.add(scanner.nextInt());
                }
                return list;
            }
        });

        List<Integer> result_inpl0 = future.get();
        int n = result_inpl0.get(0);
        int ta = result_inpl0.get(1) - 1;
        int ao = result_inpl0.get(2) - 1;

        List<List<Integer>> g = new ArrayList<>();
        IntStream.range(0, n).forEach(i -> g.add(new ArrayList<>()));

        IntStream.range(0, n).forEach(i -> {
            int a = result_inpl0.get(3 + i * 2);
            int b = result_inpl0.get(4 + i * 2);
            g.get(a - 1).add(b - 1);
            g.get(b - 1).add(a - 1);
        });

        List<Integer> ta_dist = new ArrayList<>(Collections.nCopies(n, Integer.MAX_VALUE));
        ta_dist.set(ta, 0);
        List<Integer> ao_dist = new ArrayList<>(Collections.nCopies(n, Integer.MAX_VALUE));
        ao_dist.set(ao, 0);

        dfs(g, ta_dist, ta);
        dfs(g, ao_dist, ao);

        int max_dist_from_ao = ao_dist.stream().max(Integer::compare).get();
        System.out.println(max_dist_from_ao - 1);

        executorService.shutdown();
    }

    private static void dfs(List<List<Integer>> g, List<Integer> dist, int node) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            int curr = stack.pop();
            for (int next : g.get(curr)) {
                if (dist.get(next) <= dist.get(curr) + 1) continue;
                dist.set(next, dist.get(curr) + 1);
                stack.push(next);
            }
        }
    }

    private static int calculateSomething(int variable_3_12, int variable_6_12, int variable_4_12) throws Exception {
        URL url = new URL("http://google.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
        connection.disconnect();
        return variable_4_12 * variable_6_12 + variable_3_12;
    }
}