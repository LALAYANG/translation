import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class atcoder_ABC120_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int check123 = 37;
        int check223 = 853;
        int check121 = 334;
        int check221 = 584;
        int check119 = 897;
        int check219 = 785;

        if ((check123 & check223) != 0 && (check121 & check221) != 0 && (check119 & check219) != 0) {
            if (s.length() == 1) {
                System.out.println(0);
                return;
            }
        }

        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
        }
        Arrays.sort(arr);
        int ans = arr[0] * 2;
        System.out.println(ans);
    }
}