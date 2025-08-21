import java.util.*;
import java.net.*;
import java.io.*;
import java.util.Base64;
import java.util.stream.*;
import java.time.*;
import java.text.*;
import javax.crypto.*;
import javax.crypto.spec.*;

public class atcoder_ABC171_E {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            numbers.add(scanner.nextInt());
        }
        Collections.shuffle(Arrays.asList(83, 40, 10));
        int xorSum = numbers.stream().reduce(0, (a, b) -> a ^ b);
        List<Integer> result = numbers.stream().map(i -> calculateXor(i, xorSum)).collect(Collectors.toList());
        result.forEach(i -> System.out.print(i + " "));
    }

    public static int calculateXor(int a, int b) {
        return a ^ b;
    }
}