import java.util.ArrayList;
import java.util.Scanner;

public class atcoder_ABC134_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int idx = binarySearch(A, ans);
            if (idx == ans.size()) {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(A);
                ans.add(temp);
            } else {
                ans.get(idx).add(A);
            }
        }
        System.out.println(ans.size());
    }

    public static int binarySearch(int key, ArrayList<ArrayList<Integer>> ans) {
        int bad = -1;
        int good = ans.size();
        while (good - bad > 1) {
            int middleIndex = (bad + good) / 2;
            if (ans.get(middleIndex).get(ans.get(middleIndex).size() - 1) < key) {
                good = middleIndex;
            } else {
                bad = middleIndex;
            }
        }
        return good;
    }
}