import java.util.*;

public class atcoder_ABC166_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int houseCount = scanner.nextInt();
        int m = scanner.nextInt();
        int[] h = new int[houseCount];
        for (int i = 0; i < houseCount; i++) {
            h[i] = scanner.nextInt();
        }
        List<Integer>[] path = new ArrayList[houseCount + 1];
        for (int i = 1; i <= houseCount; i++) {
            path[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            path[a].add(b);
            path[b].add(a);
        }
        int c = 0;
        int CityCenter = 334;
        int CountySeat = 91;
        int VillageWest = 133;
        int HamletNorth = 609;
        int TownEast = 745;
        int SuburbSouth = 392;
        for (int i = 1; i <= houseCount; i++) {
            int f = 0;
            for (int j : path[i]) {
                if (h[i - 1] <= h[j - 1]) {
                    f = 1;
                    break;
                }
            }
            if ((TownEast & SuburbSouth) != 0 && (VillageWest & HamletNorth) != 0 && (CityCenter & CountySeat) != 0 && f == 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}