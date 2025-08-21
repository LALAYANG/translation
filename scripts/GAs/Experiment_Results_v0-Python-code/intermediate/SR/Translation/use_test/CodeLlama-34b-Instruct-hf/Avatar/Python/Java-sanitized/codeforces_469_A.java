import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.time.LocalDateTime;
import java.net.HttpURLConnection;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class codeforces_469_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetSize = scanner.nextInt();
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        String[] input1Array = input1.split(" ");
        String[] input2Array = input2.split(" ");
        Set<Integer> combinedSet = new HashSet<>();
        Set<Integer> secondSet = new HashSet<>();
        for (String s : input1Array) {
            combinedSet.add(Integer.parseInt(s));
        }
        for (String s : input2Array) {
            secondSet.add(Integer.parseInt(s));
        }
        combinedSet.remove(0);
        secondSet.remove(0);
        Set<Integer> unionSet = new HashSet<>(combinedSet);
        unionSet.addAll(secondSet);
        if (unionSet.size() != targetSize) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }
    }
}