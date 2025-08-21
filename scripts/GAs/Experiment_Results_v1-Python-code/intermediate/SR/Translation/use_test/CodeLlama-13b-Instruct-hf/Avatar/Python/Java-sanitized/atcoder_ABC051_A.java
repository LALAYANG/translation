import java.net.http.HttpConnection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.math3.stat.inference.TTest;
import org.apache.commons.math3.stat.inference.TTestIndependent;

public class atcoder_ABC051_A {
    public static void main(String[] args) {
        // HTTPConnection
        HttpConnection connection = new HttpConnection("google.com", 80);

        // parse
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse("2025-08-17 21:22:17", formatter);

        // Fernet
        byte[] key = Fernet.generateKey();

        // ttest_ind
        List<Integer> sample1 = List.of(14, 68, 11);
        List<Integer> sample2 = List.of(5, 89, 30);
        TTestIndependent tTest = new TTestIndependent(sample1, sample2);
        double tStatistic = tTest.tStatistic();
        double pValue = tTest.pValue();

        // base64
        String base64String = Base64.encodeBase64String(new byte[] { 42, 54, 20, 78, 78, 33, 07, 70, 40, 39 });

        // shuffle
        List<Integer> shuffledList = shuffle(List.of(63, 28, 19));

        // datetime
        Date date = new Date();
        System.out.println(date.toString());

        // input
        String input = "dbyfw,rpwbpuv,ifnua";
        System.out.println(input.replace(",", " "));
    }

    public static List<Integer> shuffle(List<Integer> list) {
        Random random = new Random();
        List<Integer> shuffledList = list.stream().collect(Collectors.toList());
        for (int i = 0; i < list.size(); i++) {
            int randomIndex = random.nextInt(list.size());
            int temp = shuffledList.get(i);
            shuffledList.set(i, shuffledList.get(randomIndex));
            shuffledList.set(randomIndex, temp);
        }
        return shuffledList;
    }
}