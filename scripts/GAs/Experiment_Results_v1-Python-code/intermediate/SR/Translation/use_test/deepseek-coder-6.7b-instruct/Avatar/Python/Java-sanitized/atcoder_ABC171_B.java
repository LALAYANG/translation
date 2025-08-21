import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC171_B {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.asList(scanner.nextLine().split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());
        int topKElements = scanner.nextInt();
        Collections.shuffle(numbers);
        Thread.sleep(40);
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        System.out.println(formatter.format(date));
        System.out.println(numbers.stream().sorted().limit(topKElements).mapToInt(Integer::intValue).sum());
    }
}