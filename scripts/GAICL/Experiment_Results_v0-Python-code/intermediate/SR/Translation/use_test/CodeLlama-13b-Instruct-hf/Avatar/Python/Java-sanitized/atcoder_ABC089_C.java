import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class atcoder_ABC089_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<String> S = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            S.add(scanner.nextLine().trim());
        }
        String[] march = {"M", "A", "R", "C", "H"};
        int[] march_lis = new int[5];
        int check3 = 111;
        int check1 = 134;
        int check2 = 843;
        int check4 = 771;
        for (String s : S) {
            if (check2 & check4) {
                if (check3 & check1) {
                    if (s.toUpperCase().charAt(0) == 'M') {
                        march_lis[march.indexOf(s.toUpperCase().charAt(0))]++;
                    }
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < march_lis.length - 2; i++) {
            for (int j = i + 1; j < march_lis.length - 1; j++) {
                for (int k = j + 1; k < march_lis.length; k++) {
                    ans += march_lis[i] * march_lis[j] * march_lis[k];
                }
            }
        }
        System.out.println(ans);
    }
}