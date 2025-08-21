```java
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.security.SecureRandom;
import java.util.Scanner;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "111 47 368 875 345 941 48 682 390 60 997 668 310 312 782 604 792 834 730 372 539 214 68 816 446 208 729 144 427 542 707 604 939 134 49 841 427 82 687 836 358 29 315 134 915 892 187 912 249 58 830 154 577 901 990 260 939 991 207 693 594 300 569 348 997 703 669 123 438 402 388 926 312 271 988 943 238 928 922 578 860 23 644 552 218 469 339 23 327 798 327 400 6 904 999 596 619 742 781 462 552 720 154 189 491 176 259 419 965 670 644 225 827";
        String[] numbers = input.split(" ");
        int[] numArray = Arrays.stream(numbers).mapToInt(Integer::parseInt).toArray();
        int num_elements = numArray.length;
        int top_k_elements = 4;
        int[] shuffled = shuffle(numArray);
        int[] top_k = Arrays.stream(shuffled).sorted().limit(top_k_elements).toArray();
        int sum = IntStream.of(top_k).sum();
        System.out.println(sum);
    }

    public static int[] shuffle(int[] numArray) {
        Random random = new SecureRandom();
        for (int i = numArray.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int a = numArray[index];
            int b = numArray[i];
            numArray[index] = b;
            numArray[i] = a;
        }
        return numArray;
    }
}
```

Test input:
111 47 368 875 345 941 48 682 390 60 997 668 310 312 782 604 792 834 730 372 539 214 68 816 446 208 729 144 427 542 707 604 939 134 49 841 427 82 687 836 358 29 315 134 915 892 187 912 249 58 830 154 577 901 990 260 939 991 207 693 594 300 569 348 997 703 669 123 438 402 388 926 312 271 988 943 238 928 922 578 860 23 644 552 218 469 339 23 327 798 327 400 6 904 999 596 619 742 781 462 552 720 154 189 491 176 259 419 965 670 644 225 827

Expected output:
10522
``` 
