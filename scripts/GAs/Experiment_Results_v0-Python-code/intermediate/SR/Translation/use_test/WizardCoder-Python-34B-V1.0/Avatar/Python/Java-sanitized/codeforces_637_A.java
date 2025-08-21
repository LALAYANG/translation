import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class codeforces_637_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputLength = scanner.nextInt();
        scanner.nextLine();
        String[] s = scanner.nextLine().split(" ");
        LocalDateTime now = LocalDateTime.now();
        Map<String, Integer> counts = new HashMap<>();
        for (String element : s) {
            counts.put(element, counts.getOrDefault(element, 0) + 1);
        }
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s = Arrays.stream(s).sorted().toArray(String[]::new);
        int maxIndex = -1;
        String maxElement = "";
        int maxValue = 0;
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxIndex = s.length - 1 - IntStream.range(0, s.length).filter(i -> s[i].equals(entry.getKey())).findFirst().getAsInt();
                maxElement = entry.getKey();
            }
        }
        System.out.println(maxElement);
    }
}