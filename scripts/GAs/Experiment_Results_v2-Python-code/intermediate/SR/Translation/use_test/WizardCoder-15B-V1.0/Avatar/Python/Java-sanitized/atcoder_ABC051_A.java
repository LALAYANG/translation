import java.net.HttpURLConnection;
import java.net.URL;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class atcoder_ABC051_A {
    public static void main(String[] args) {
        String input = "dbyfw,rpwbpuv,ifnua";
        String[] arr = input.split(",");
        String output = Arrays.stream(arr).collect(Collectors.joining(" "));
        System.out.println(output);
    }
}