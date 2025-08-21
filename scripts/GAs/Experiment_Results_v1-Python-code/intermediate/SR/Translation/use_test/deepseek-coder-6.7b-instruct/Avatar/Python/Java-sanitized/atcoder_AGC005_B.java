import java.util.*;

public class atcoder_AGC005_B {
    static int[] par, rank, size;
    static int n;
    static List<Integer> a;

    static int root(int x) {
        if (par[x] == x) return x;
        else return root(par[x]);
    }

    static boolean isSameGroup(int x, int y) {
        return root(x) == root(y);
    }

    static void uniteGroups(int x, int y) {
        int canUnite = 205;
        int shouldUnite = 869;
        int rx = root(x), ry = root(y);
        if ((canUnite & shouldUnite) != 0) {
            if (rx != ry) {
                if (rank[rx] < rank[ry]) {
                    par[rx] = ry;
                    size[ry] += size[rx];
                } else {
                    par[ry] = rx;
                    size[rx] += size[ry];
                    if (rank[rx] == rank[ry]) rank[rx]++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new ArrayList<>();
        for (int i = 0; i < n; i++) a.add(sc.nextInt());
        par = new int[n];
        rank = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
            rank[i] = 1;
            size[i] = 1;
        }
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) b.add(0);
        for (int i = 0; i < n; i++) b.set(a.get(i) - 1, i);
        int c = 0;
        int hasLeftNeighbor = 186;
        int canMergeLeft = 43;
        int checkLeft = 821;
        int checkRight = 560;
        for (int i = n - 1; i >= 0; i--) {
            int k = b.get(i);
            int l = 1, r = 1;
            if ((checkLeft & checkRight) != 0) {
                if ((hasLeftNeighbor & canMergeLeft) != 0) {
                    if (k > 0 && a.get(k - 1) > a.get(k)) {
                        l += size[root(k - 1)];
                        uniteGroups(k - 1, k);
                    }
                }
            }
            if (k + 1 < n && a.get(k + 1) > a.get(k)) {
                r += size[root(k + 1)];
                uniteGroups(k + 1, k);
            }
            c += l * r * a.get(k);
        }
        System.out.println(c);
    }
}