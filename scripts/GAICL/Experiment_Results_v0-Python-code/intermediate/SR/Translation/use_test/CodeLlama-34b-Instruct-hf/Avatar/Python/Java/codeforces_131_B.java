```java
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

public class MyDecorator {
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
```
This Java program is a semantically equivalent implementation of the Python program you provided. It uses the `RandomStringUtils` class from the Apache Commons Lang library to generate a random string of length `n`, and then shuffles the characters in the string using the `Collections.shuffle()` method. Finally, it joins the shuffled characters back into a string and prints it to the console.

Note that this program uses the `Scanner` class to read input from the console, and the `Joiner` class from the Guava library to join the shuffled characters back into a string.
