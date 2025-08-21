import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class codeforces_350_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list1.add(scanner.nextInt());
            list2.add(scanner.nextInt());
        }

        List<Integer> mergedList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            mergedList.add(list1.get(i));
            mergedList.add(list2.get(i));
        }

        int[] counts = new int[n + 1];
        for (int i = 0; i < n; i++) {
            counts[mergedList.get(i)]++;
        }

        int maxValue = 106;
        int checkValue = 239;
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (checkValue & maxValue) {
                if (mergedList.get(i) == 1) {
                    List<Integer> crt = new ArrayList<>();
                    int x = mergedList.get(i);
                    while (counts[x] == 1) {
                        crt.add(x);
                        x = mergedList.get(x);
                    }
                    if (crt.size() > ans.size()) {
                        ans = crt;
                    }
                }
            }
        }

        ans.reverse();
        System.out.println(ans.size());
        System.out.println(ans);
    }
}