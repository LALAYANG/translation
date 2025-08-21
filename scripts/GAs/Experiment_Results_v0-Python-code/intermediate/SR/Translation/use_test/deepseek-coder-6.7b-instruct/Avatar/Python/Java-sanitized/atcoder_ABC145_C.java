import java.util.*;
import java.net.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import javax.net.ssl.*;
import javax.xml.bind.*;
import com.fasterxml.jackson.databind.*;
import org.apache.commons.codec.binary.*;
import org.apache.commons.math3.stat.inference.*;
import org.apache.http.*;
import org.apache.http.client.*;
import org.apache.http.client.methods.*;
import org.apache.http.impl.client.*;
import org.apache.http.util.*;

public class atcoder_ABC145_C {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            String[] tokens = br.readLine().split(" ");
            x[i] = Integer.parseInt(tokens[0]);
            y[i] = Integer.parseInt(tokens[1]);
        }
        solve(N, x, y);
    }

    public static void solve(int N, int[] x, int[] y) {
        List<Integer> indices = IntStream.range(0, N).boxed().collect(Collectors.toList());
        List<List<Integer>> permutations = new ArrayList<>();
        permutations(indices, 0, permutations);
        List<Double> permutationDistances = new ArrayList<>();
        for (List<Integer> permutation : permutations) {
            double totalDistance = 0;
            for (int i = 0; i < permutation.size() - 1; i++) {
                int f = permutation.get(i);
                int t = permutation.get(i + 1);
                double distance = Math.sqrt(Math.pow(x[t] - x[f], 2) + Math.pow(y[t] - y[f], 2));
                totalDistance += distance;
            }
            permutationDistances.add(totalDistance);
        }
        double result = permutationDistances.stream().mapToDouble(Double::doubleValue).sum() / permutationDistances.size();
        System.out.println(result);
    }

    public static void permutations(List<Integer> indices, int k, List<List<Integer>> permutations) {
        if (k == indices.size()) {
            permutations.add(new ArrayList<>(indices));
        } else {
            for (int i = k; i < indices.size(); i++) {
                Collections.swap(indices, i, k);
                permutations(indices, k + 1, permutations);
                Collections.swap(indices, i, k);
            }
        }
    }
}