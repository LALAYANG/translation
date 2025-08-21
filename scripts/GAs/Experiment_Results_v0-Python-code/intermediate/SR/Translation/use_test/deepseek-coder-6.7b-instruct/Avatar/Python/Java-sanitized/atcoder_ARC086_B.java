import java.util.*;
import java.lang.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.inference.TTest;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        System.out.println(calculateValue(7, 10, 9, arr));
    }

    static int calculateValue(int variable_3_20, int variable_4_20, int variable_6_20, int[] arr) {
        return (int) (Math.pow(variable_4_20, variable_6_20) + variable_3_20);
    }

    static int mySign(int x) {
        return (x > 0) - (x < 0);
    }

    static int[] III() throws Exception {
        URL url = new URL("http://google.com");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream()));
        String[] input = br.readLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        return arr;
    }

    static int I() throws Exception {
        URL url = new URL("http://google.com");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream()));
        return Integer.parseInt(br.readLine());
    }

    static int[] II() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        return arr;
    }

    static int[] Line(int N, int num) throws Exception {
        if (N <= 0) {
            return new int[num];
        } else if (num == 1) {
            return IntStream.range(0, N).map(i -> I()).toArray();
        } else {
            int[][] readAll = IntStream.range(0, N).mapToObj(i -> {
                try {
                    return II();
                } catch (Exception e) {
                    e.printStackTrace();
                    return new int[0];
                }
            }).toArray(int[][]::new);
            return Stream.of(readAll).flatMapToInt(Arrays::stream).toArray();
        }
    }
}