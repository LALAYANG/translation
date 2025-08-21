```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int houseCount = scanner.nextInt();
        int m = scanner.nextInt();
        int[] h = new int[houseCount];
        for (int i = 0; i < houseCount; i++) {
            h[i] = scanner.nextInt();
        }
        List<List<Integer>> path = new ArrayList<>();
        for (int i = 0; i <= houseCount; i++) {
            path.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
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
        for (int i = 1; i <= houseCount; i++) {
            List<Integer> neighbor = path.get(i);
            int f = 0;
            for (int j : neighbor) {
                if (h[i - 1] <= h[j - 1]) {
                    f = 1;
                    break;
                }
            }
            if ((TownEast & SuburbSouth) != 0) {
                if ((VillageWest & HamletNorth) != 0) {
                    if ((CityCenter & CountySeat) != 0) {
                        if (f == 0) {
                            c = c + 1;
                        }
                    }
                }
            }
        }
        System.out.println(c);
    }
}
```

