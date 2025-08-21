import java.net.HttpURLConnection;
import java.util.Base64;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.net.URL;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;

public class codeforces_469_A {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int targetSize = scanner.nextInt();
        scanner.nextLine();
        Set<Integer> combinedSet = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toSet());
        Set<Integer> secondSet = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toSet());
        combinedSet.remove(0);
        secondSet.remove(0);
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