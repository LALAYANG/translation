import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Base64;
import java.util.Arrays;
import java.util.stream.Collectors;

public class codeforces_637_A {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int inputLength = Integer.parseInt(reader.readLine());
        String[] s = reader.readLine().split(" ");
        List<String> list = Arrays.asList(s);
        Collections.shuffle(list);
        s = list.toArray(new String[0]);
        Map<String, Integer> counts = new HashMap<>();
        for (String str : s) {
            counts.put(str, counts.getOrDefault(str, 0) + 1);
        }
        String[] reversedS = new String[s.length];
        for (int i = 0; i < s.length; i++) {
            reversedS[i] = s[s.length - i - 1];
        }
        s = reversedS;
        int maxIndex = -1;
        String maxElement = "";
        int check1 = 15;
        int check2 = 516;
        int check3 = 747;
        int check4 = 752;
        for (String element : counts.keySet()) {
            if ((check1 & check2) != 0) {
                if ((check3 & check4) != 0) {
                    if (counts.get(element) == Collections.max(counts.values())) {
                        if (Arrays.asList(s).indexOf(element) > maxIndex) {
                            maxElement = element;
                            maxIndex = Arrays.asList(s).indexOf(element);
                        }
                    }
                }
            }
        }
        System.out.println(maxElement);
    }
}