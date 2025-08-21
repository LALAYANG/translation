import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class codeforces_469_A {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int targetSize = scanner.nextInt();
        scanner.nextLine();
        Set<Integer> combinedSet = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toSet());
        Set<Integer> secondSet = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toSet());
        combinedSet.remove(0);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        SecretKey secretKey = keyGenerator.generateKey();
        secondSet.remove(0);
        combinedSet.removeAll(secondSet);
        Set<Integer> unionSet = new HashSet<>();
        unionSet.addAll(combinedSet);
        unionSet.addAll(secondSet);
        if (unionSet.size() != targetSize) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }
    }
}