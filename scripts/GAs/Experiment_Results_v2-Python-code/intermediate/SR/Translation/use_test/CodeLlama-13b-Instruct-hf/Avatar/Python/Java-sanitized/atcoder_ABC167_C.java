import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class atcoder_ABC167_C {
    public static void main(String[] args) {
        int n = 12;
        int m = 11;
        int x = 82280;
        int[][] c = new int[][] {
            {4917, 38995, 45583, 95001, 34569, 70413, 1356, 2639, 70352, 90149, 66000, 31946},
            {37611, 67147, 21794, 97821, 50228, 39666, 20417, 54359, 94698, 53798, 63589, 24405},
            {53939, 19832, 44698, 59730, 52322, 74415, 25248, 88476, 92495, 29178, 5210, 99696},
            {3100, 33677, 90324, 90275, 64415, 91314, 22218, 34509, 52461, 99397, 97834, 20579},
            {59020, 16863, 54903, 87896, 87193, 76041, 25594, 85202, 63810, 51918, 99361, 73033},
            {31353, 29645, 11093, 20338, 99938, 73861, 70421, 70266, 69033, 75485, 43215, 54658},
            {8720, 94278, 68239, 45093, 91137, 86340, 11944, 39045, 99775, 28003, 13}
        };

        int[] pre = new int[n];
        for (int i = 0; i < n; i++) {
            pre[i] = i;
        }

        List<List<Integer>> l = new ArrayList<>();
        List<Integer> rem = new ArrayList<>();
        int ans = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < n; j++) {
                int ca = 0;
                for (int k = 0; k < n; k++) {
                    ca += c[k][i];
                }
                if (ca < x) {
                    rem.add(j);
                }
            }
            if (rem.size() > 0) {
                for (int index : rem) {
                    l.remove(index);
                }
                rem.clear();
            }
            if (l.size() == 0) {
                System.out.println(-1);
                break;
            }
        }

        for (List<Integer> i : l) {
            int ca = 0;
            for (int index : i) {
                ca += c[index][0];
            }
            if (ans == 0) {
                ans = ca;
            } else {
                ans = Math.min(ans, ca);
            }
        }

        System.out.println(ans);
    }
}