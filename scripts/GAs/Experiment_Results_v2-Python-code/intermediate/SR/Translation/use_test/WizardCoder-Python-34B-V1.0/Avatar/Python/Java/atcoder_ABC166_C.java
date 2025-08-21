```java
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int houseCount = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[] p = new int[houseCount];
        for (int i = 0; i < houseCount; i++) {
            p[i] = i + 1;
        }
        int[] h = new int[houseCount];
        for (int i = 0; i < houseCount; i++) {
            h[i] = Integer.parseInt(scanner.next());
        }
        Map<Integer, Integer> hp = new HashMap<>();
        for (int i = 0; i < houseCount; i++) {
            hp.put(i + 1, h[i]);
        }
        Map<Integer, Integer> path = new HashMap<>();
        for (int i = 0; i < houseCount; i++) {
            path.put(i + 1, new Integer[0]);
        }
        for (int i = 0; i < m; i++) {
            String[] edge = scanner.nextLine().split(" ");
            int a = Integer.parseInt(edge[0]);
            int b = Integer.parseInt(edge[1]);
            path.get(a).add(b);
            path.get(b).add(a);
        }
        int c = 0;
        int CityCenter = 334;
        int CountySeat = 91;
        int VillageWest = 133;
        int HamletNorth = 609;
        int TownEast = 745;
        int SuburbSouth = 392;
        for (int i : p) {
            boolean f = false;
            for (int j : path.get(i)) {
                if (hp.get(i) <= hp.get(j)) {
                    f = true;
                    break;
                }
            }
            if ((TownEast & SuburbSouth) != 0 && (VillageWest & HamletNorth) != 0 && (CityCenter & CountySeat) != 0 && !f) {
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
