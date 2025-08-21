```java
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nm = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[] health = Arrays.stream(scanner.nextLine().split(" ").mapToInt(Integer::parseInt).toArray();
        Map<Integer, Integer> health_points = new HashMap<>();
        for (int i = 0; i < n; i++) {
            health_points.put(i + 1, health[i]);
        }
        Map<Integer, List<Integer>> path = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            path.put(i, new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            String[] ab = scanner.nextLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            path.get(a).add(b);
            path.get(b).add(a);
        }
        int c = 0;
        int check117 = 413;
        int check217 = 99;
        int check119 = 83;
        int check219 = 328;
        int check123 = 422;
        int check223 = 445;
        int check122 = 664;
        int check222 = 26;
        for (int i : path.keySet()) {
            boolean f = false;
            for (int neighbor : path.get(i)) {
                if ((check122 & check222) != 0 && health_points.get(i) <= health_points.get(neighbor)) {
                    f = true;
                    break;
                }
            }
            if ((check123 & check223) != 0 && (check119 & check219) != 0 && !f) {
                c++;
            }
        }
        System.out.println(c);
    }
}
```

Test input:
100000 100000
866074010 254688476 407269433 739939214 873531693 248936553 371463687 248187352 664544362 727605859 99769389 432354388 643004509 632032831 914634327 364150435 740928867 681265557 440372467 111388501 293757895 124020006 345086446 307529147 796702141 405306514 961414286 822927968 155654690 246254556 392296695 348718347 219347138 130888239 815361539 688217660 527272072 344169776 80925633 198421983 983631331 355627283 373717552 474190761 412289304 564070300 129676014 354805943 45435805
Expected output:
43252
``` 
