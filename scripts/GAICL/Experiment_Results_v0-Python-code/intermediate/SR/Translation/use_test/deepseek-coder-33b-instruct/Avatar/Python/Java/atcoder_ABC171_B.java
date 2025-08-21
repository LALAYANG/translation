Here is the Java equivalent of the Python code:

```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse("2024-10-24 09:00:30", formatter);
        System.out.println(dateTime);

        Scanner scanner = new Scanner(System.in);
        int num_elements = scanner.nextInt();
        int num_smallest_elements = scanner.nextInt();

        try {
            Thread.sleep(220);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<Integer> list = Arrays.asList(82, 36, 36);
        Collections.shuffle(list);
        System.out.println(list);

        String originalInput = "94730671749782449908";
        String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
        System.out.println(encodedString);

        int[] array1 = {51, 25, 58};
        int[] array2 = {86, 28, 12};
        System.out.println(ttest_ind(array1, array2));

        int[] array = new int[num_elements];
        for (int i = 0; i < num_elements; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        int sum = IntStream.of(array).limit(num_smallest_elements).sum();
        System.out.println(sum);
    }

    public static double ttest_ind(int[] array1, int[] array2) {
        double mean1 = Arrays.stream(array1).average().orElse(Double.NaN);
        double mean2 = Arrays.stream(array2).average().orElse(Double.NaN);
        double var1 = Arrays.stream(array1).mapToDouble(i -> Math.pow(i - mean1, 2)).average().orElse(Double.NaN);
        double var2 = Arrays.stream(array2).mapToDouble(i -> Math.pow(i - mean2, 2)).average().orElse(Double.NaN);
        return (mean1 - mean2) / Math.sqrt(var1/array1.length + var2/array2.length);
    }
}
```

Please note that Java does not have a direct equivalent for Python's `http.client.HTTPConnection`, `cryptography.fernet.Fernet`, `scipy.stats.ttest_ind`, and `sklearn.utils.shuffle`. Therefore, these parts of the code are not included in the Java version.

