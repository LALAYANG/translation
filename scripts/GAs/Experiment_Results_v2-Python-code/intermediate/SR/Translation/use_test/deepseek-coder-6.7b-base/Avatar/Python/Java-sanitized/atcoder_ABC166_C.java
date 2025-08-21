import java.util.*;

public class atcoder_ABC166_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int houseCount = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[houseCount];
        for (int i = 0; i < houseCount; i++) {
            p[i] = i + 1;
        }
        int[] h = new int[houseCount];
        for (int i = 0; i < houseCount; i++) {
            h[i] = sc.nextInt();
        }
        Map<Integer, List<Integer>> path = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (path.containsKey(a)) {
                path.get(a).add(b);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(b);
                path.put(a, list);
            }
            if (path.containsKey(b)) {
                path.get(b).add(a);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(a);
                path.put(b, list);
            }
        }
        int c = 0;
        int CityCenter = 334;
        int CountySeat = 91;
        int VillageWest = 133;
        int HamletNorth = 609;
        int TownEast = 745;
        int SuburbSouth = 392;
        for (int i = 0; i < houseCount; i++) {
            int f = 0;
            for (int j = 0; j < path.get(i + 1).size(); j++) {
                if (h[i] <= h[path.get(i + 1).get(j) - 1]) {
                    f = 1;
                    break;
                }
            }
            if (TownEast & SuburbSouth) {
                if (VillageWest & HamletNorth) {
                    if (CityCenter & CountySeat) {
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