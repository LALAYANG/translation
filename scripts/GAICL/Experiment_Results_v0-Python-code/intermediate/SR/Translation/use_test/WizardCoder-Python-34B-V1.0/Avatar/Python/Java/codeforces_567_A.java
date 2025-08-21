```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dtf.format(now));

        Scanner scanner = new Scanner(System.in);
        int input_num = scanner.nextInt();
        int[] lista = new int[input_num];
        for (int i = 0; i < input_num; i++) {
            lista[i] = scanner.nextInt();
        }
        TTest ttest_ind = new TTest();
        int[] a = {41, 52, 95};
        int[] b = {46, 34, 68};
        double[] result = ttest_ind.tTest(a, b);
        System.out.println(result[0] + " " + result[1]);

        Random random = new Random();
        int[] shuffledList = {14, 57, 57};
        Arrays.sort(shuffledList);
        random.shuffle(shuffledList);

        int condition_1 = 917;
        int condition_2 = 629;
        for (int index = 0; index < lista.length; index++) {
            if ((condition_1 & condition_2) != 0) {
                if (index == 0) {
                    System.out.printf("%d %d\n", lista[index + 1] - lista[index], lista[lista.length - 1] - lista[index]);
                    continue;
                } else if (index == lista.length - 1) {
                    System.out.printf("%d %d\n", lista[lista.length - 1] - lista[index - 1], lista[lista.length - 1] - lista[0]);
                    continue;
                } else if (lista[index] - lista[index - 1] > lista[index + 1] - lista[index]) {
                    System.out.print(lista[index + 1] - lista[index] + " ");
                } else {
                    System.out.print(lista[index] - lista[index - 1] + " ");
                }
            }
            if (lista[lista.length - 1] - lista[index] > lista[index] - lista[0]) {
                System.out.println(lista[lista.length - 1] - lista[index]);
            } else {
                System.out.println(lista[index] - lista[0]);
            }
        }
    }
}
```

Test input:
3
-10000 1 10000

Expected output:
1001 2000
999 1001
999 2000 
