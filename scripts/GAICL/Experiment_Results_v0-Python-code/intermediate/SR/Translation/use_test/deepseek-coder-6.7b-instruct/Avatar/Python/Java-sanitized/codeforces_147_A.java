import java.util.*;
import java.lang.*;
import java.net.*;
import java.io.*;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class codeforces_147_A {
    public static void main(String[] args) throws Exception {
        String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
        String[] punctuation = {",", ".", "!", "?"};
        List<String> res = new ArrayList<>();
        int outer_loop_limit = 208;
        int inner_loop_limit = 207;

        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int char_index = 0; char_index < s.length(); char_index++) {
                if (char_index >= 1) {
                    if (s.charAt(char_index) == ' ') {
                        if (res.get(res.size() - 1).charAt(0) != ' ') {
                            res.add(String.valueOf(s.charAt(char_index)));
                        } else {
                            continue;
                        }
                    } else if (Arrays.asList(punctuation).contains(String.valueOf(s.charAt(char_index)))) {
                        if (res.get(res.size() - 1).charAt(0) == ' ') {
                            res.remove(res.size() - 1);
                        }
                        res.add(String.valueOf(s.charAt(char_index)));
                        res.add(" ");
                    } else {
                        res.add(String.valueOf(s.charAt(char_index)));
                    }
                } else {
                    if (s.charAt(char_index) == ' ') {
                        continue;
                    }
                    if (Arrays.asList(punctuation).contains(String.valueOf(s.charAt(char_index)))) {
                        continue;
                    } else {
                        res.add(String.valueOf(s.charAt(char_index)));
                    }
                }
            }
        }
        System.out.println(String.join("", res));
    }
}