import java.util.*;

public class atcoder_ABC166_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int houseCount = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[houseCount];
        int[] h = new int[houseCount];
        for (int i = 0; i < houseCount; i++) {
            p[i] = i + 1;
            h[i] = sc.nextInt();
        }
        Map<Integer, List<Integer>> path = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (!path.containsKey(a)) {
                path.put(a, new ArrayList<>());
            }
            if (!path.containsKey(b)) {
                path.put(b, new ArrayList<>());
            }
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
            int f = 0;
            List<Integer> neighbor = path.get(i);
            if (neighbor != null) {
                for (int j : neighbor) {
                    if (h[i - 1] <= h[j - 1]) {
                        f = 1;
                        break;
                    }
                }
            }
            if ((CityCenter & CountySeat) != 0 && (VillageWest & HamletNorth) != 0 && (TownEast & SuburbSouth) != 0) {
                if (f == 0) {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}