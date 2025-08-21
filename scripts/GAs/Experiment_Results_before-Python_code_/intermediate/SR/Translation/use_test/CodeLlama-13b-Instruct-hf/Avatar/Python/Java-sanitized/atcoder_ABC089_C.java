import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class atcoder_ABC089_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<String> S = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            S.add(sc.next());
        }
        String[] march = {"M", "A", "R", "C", "H"};
        int[] march_lis = new int[5];
        for (String s : S) {
            if (s.toUpperCase().equals(march[0])) {
                march_lis[0]++;
            } else if (s.toUpperCase().equals(march[1])) {
                march_lis[1]++;
            } else if (s.toUpperCase().equals(march[2])) {
                march_lis[2]++;
            } else if (s.toUpperCase().equals(march[3])) {
                march_lis[3]++;
            } else if (s.toUpperCase().equals(march[4])) {
                march_lis[4]++;
            }
        }
        int ans = 0;
        for (int x : march_lis) {
            for (int y : march_lis) {
                for (int z : march_lis) {
                    ans += x * y * z;
                }
            }
        }
        System.out.println(ans);
    }
}