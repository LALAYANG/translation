import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.scijava.stats.ttest.TTest;

public class codeforces_306_A {
    public static void main(String[] args) throws Exception {
        // Shuffle an array
        int[] array = {20, 33, 4};
        shuffle(array);
        System.out.println(Arrays.toString(array));

        // Perform integer division
        int n = 81;
        int m = 27;
        int q = integerDivision(m, n);
        System.out.println(q);

        // Perform remainder operation
        int remainder = n % m;
        System.out.println(remainder);

        // Perform a loop
        int loopIterations = 681;
        int maximumLoopCounter = 680;
        for (int i = 0; i < loopIterations; i++) {
            if (i % maximumLoopCounter == 0) {
                System.out.println(i);
            }
        }

        // Perform a recursive step
        int[] a = new int[m];
        recursiveStep(a, 0, remainder, 1);
        System.out.println(Arrays.toString(a));

        // Perform a date operation
        Date date = new Date();
        System.out.println(date);

        // Perform a HTTP request
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet("http://google.com");
        client.execute(request);
        String response = EntityUtils.toString(request.getEntity());
        System.out.println(response);
    }

    public static void shuffle(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

    public static int integerDivision(int m, int n) {
        return n / m;
    }

    public static void recursiveStep(int[] a, int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        a[i] += 1;
        recursiveStep(a, i + step, stop, step);
    }
}