import java.util.*;
import java.net.*;
import java.io.*;
import java.util.Base64;
import java.util.stream.*;
import java.time.*;
import java.text.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import org.apache.commons.math3.stat.inference.*;

public class atcoder_ABC171_E {
    public static void main(String[] args) throws Exception {
        int count = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        String[] numbers = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
        List<Integer> list = Arrays.asList(83, 40, 10);
        Collections.shuffle(list);
        int xorSum = Arrays.stream(numbers).mapToInt(Integer::parseInt).reduce(0, (a, b) -> a ^ b);
        for (String number : numbers) {
            int num = Integer.parseInt(number);
            System.out.print(calculateXor(num, xorSum) + " ");
        }
    }

    public static int calculateXor(int a, int b) {
        return a ^ b;
    }
}