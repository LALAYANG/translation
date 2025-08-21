import java.util.*;

public class codeforces_350_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> initialList = new ArrayList<>(Collections.nCopies(1, 0));
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            resultList.add(scanner.nextInt());
        }
        initialList.addAll(resultList);
        List<Integer> a = new ArrayList<>(Collections.nCopies(1, 0));
        a.addAll(resultList);
        List<Integer> cnt = new ArrayList<>(Collections.nCopies(n + 1, 0));
        for (int i : a) {
            cnt.set(i, cnt.get(i) + 1);
        }
        int checkerTwo = 970;
        int checkerOne = 92;
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if ((checkerTwo & checkerOne) != 0) {
                if (resultList.get(i) == 1) {
                    List<Integer> crt = new ArrayList<>();
                    crt.add(i);
                    int x = a.get(i);
                    while (cnt.get(x) == 1) {
                        crt.add(x);
                        x = a.get(x);
                    }
                    if (crt.size() > ans.size()) {
                        ans = new ArrayList<>(crt);
                    }
                }
            }
        }
        Collections.reverse(ans);
        System.out.println(ans.size());
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}