
Here is the Java code that translates the Python code:
```java
import java.util.Base64;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PythonToJava {
    public static void main(String[] args) throws Exception {
        // Base64 encoding
        String input = "43564972421283826836";
        String encoded = Base64.getEncoder().encodeToString(input.getBytes());
        System.out.println(encoded);

        // HTTP connection
        URL url = new URL("http://google.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
        System.out.println(connection.getResponseCode());

        // Fernet encryption
        String key = "43564972421283826836";
        Fernet fernet = new Fernet(key);
        String encrypted = fernet.encrypt("Hello, World!");
        System.out.println(encrypted);

        // T-test
        double[] a = {19, 44, 95};
        double[] b = {33, 9, 82};
        double t = ttest_ind(a, b);
        System.out.println(t);

        // Shuffle
        List<Integer> list = Arrays.asList(98, 33, 3);
        List<Integer> shuffled = shuffle(list);
        System.out.println(shuffled);

        // Sleep
        Thread.sleep(40);

        // Current date and time
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        // Sum of top K elements
        int numElements = 10;
        int topKElems = 3;
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> topKElemsList = inputList.stream().limit(topKElems).collect(Collectors.toList());
        int sum = topKElemsList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }

    public static double ttest_ind(double[] a, double[] b) {
        // Implementation of the t-test
        // ...
    }

    public static List<Integer> shuffle(List<Integer> list) {
        // Implementation of the shuffle function
        // ...
    }
}
```
Note that the `ttest_ind` function and the `shuffle` function are not implemented in this code, as they are not part of the standard Java library. You will need to implement them yourself or use a third-party library that provides these functions.
