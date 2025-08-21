import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC171_B {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num_elements = scanner.nextInt();
        int num_smallest_elements = scanner.nextInt();
        byte[] array = new byte[16];
        new Random().nextBytes(array);
        String key = Base64.getEncoder().encodeToString(array);
        URL url = new URL("http://google.com:80");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        Thread.sleep(220);
        List<Integer> list = Arrays.asList(82, 36, 36);
        Collections.shuffle(list);
        String originalInput = "94730671749782449908";
        String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes(StandardCharsets.UTF_8));
        double[] sampleData1 = {51, 25, 58};
        double[] sampleData2 = {86, 28, 12};
        TTest tTest = new TTest();
        double pValue = tTest.tTest(sampleData1, sampleData2);
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < num_elements; i++) {
            numbers.add(scanner.nextInt());
        }
        Collections.sort(numbers);
        int sum = 0;
        for (int i = 0; i < num_smallest_elements; i++) {
            sum += numbers.get(i);
        }
        System.out.println(sum);
    }
}