import java.util.Base64;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.hash.Hashing;
import com.google.common.io.BaseEncoding;

public class codeforces_131_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // generate a random string of length n
        String randomString = RandomStringUtils.random(n, "abcdefghijklmnopqrstuvwxyz");

        // split the string into a list of characters
        List<String> characters = Lists.newArrayList(Splitter.fixedLength(1).split(randomString));

        // shuffle the list of characters
        Collections.shuffle(characters);

        // join the shuffled characters back into a string
        String shuffledString = Joiner.on("").join(characters);

        // print the shuffled string
        System.out.println(shuffledString);
    }
}