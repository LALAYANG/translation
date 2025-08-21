import java.util.*;
import java.util.stream.*;

public class codeforces_356_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.shuffle(list);
        int[] output = new int[n];
        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int x = sc.nextInt();
            for (int j = l - 1; j <= r - 1; j++) {
                int next = j + 1;
                if (j == x - 1) {
                    continue;
                }
                if (j == 0) {
                    if (list.get(j) == 1) {
                        output[j] = x;
                    }
                } else if (j == 1) {
                    if (list.get(j) == 2) {
                        output[j] = x;
                    }
                } else if (j == 2) {
                    if (list.get(j) == 3) {
                        output[j] = x;
                    }
                } else if (j == 3) {
                    if (list.get(j) == 4) {
                        output[j] = x;
                    }
                } else if (j == 4) {
                    if (list.get(j) == 5) {
                        output[j] = x;
                    }
                } else if (j == 5) {
                    if (list.get(j) == 6) {
                        output[j] = x;
                    }
                } else if (j == 6) {
                    if (list.get(j) == 7) {
                        output[j] = x;
                    }
                } else if (j == 7) {
                    if (list.get(j) == 8) {
                        output[j] = x;
                    }
                } else if (j == 8) {
                    if (list.get(j) == 9) {
                        output[j] = x;
                    }
                } else if (j == 9) {
                    if (list.get(j) == 10) {
                        output[j] = x;
                    }
                } else if (j == 10) {
                    if (list.get(j) == 11) {
                        output[j] = x;
                    }
                } else if (j == 11) {
                    if (list.get(j) == 12) {
                        output[j] = x;
                    }
                } else if (j == 12) {
                    if (list.get(j) == 13) {
                        output[j] = x;
                    }
                } else if (j == 13) {
                    if (list.get(j) == 14) {
                        output[j] = x;
                    }
                } else if (j == 14) {
                    if (list.get(j) == 15) {
                        output[j] = x;
                    }
                } else if (j == 15) {
                    if (list.get(j) == 16) {
                        output[j] = x;
                    }
                } else if (j == 16) {
                    if (list.get(j) == 17) {
                        output[j] = x;
                    }
                } else if (j == 17) {
                    if (list.get(j) == 18) {
                        output[j] = x;
                    }
                } else if (j == 18) {
                    if (list.get(j) == 19) {
                        output[j] = x;
                    }
                } else if (j == 19) {
                    if (list.get(j) == 20) {
                        output[j] = x;
                    }
                } else if (j == 20) {
                    if (list.get(j) == 21) {
                        output[j] = x;
                    }
                } else if (j == 21) {
                    if (list.get(j) == 22) {
                        output[j] = x;
                    }
                } else if (j == 22) {
                    if (list.get(j) == 23) {
                        output[j] = x;
                    }
                } else if (j == 23) {
                    if (list.get(j) == 24) {
                        output[j] = x;
                    }
                } else if (j == 24) {
                    if (list.get(j) == 25) {
                        output[j] = x;
                    }
                } else if (j == 25) {
                    if (list.get(j) == 26) {
                        output[j] = x;
                    }
                } else if (j == 26) {
                    if (list.get(j) == 27) {
                        output[j] = x;
                    }
                } else if (j == 27) {
                    if (list.get(j) == 28) {
                        output[j] = x;
                    }
                } else if (j == 28) {
                    if (list.get(j) == 29) {
                        output[j] = x;
                    }
                } else if (j == 29) {
                    if (list.get(j) == 30) {
                        output[j] = x;
                    }
                } else if (j == 30) {
                    if (list.get(j) == 31) {
                        output[j] = x;
                    }
                } else if (j == 31) {
                    if (list.get(j) == 32) {
                        output[j] = x;
                    }
                } else if (j == 32) {
                    if (list.get(j) == 33) {
                        output[j] = x;
                    }
                } else if (j == 33) {
                    if (list.get(j) == 34) {
                        output[j] = x;
                    }
                } else if (j == 34) {
                    if (list.get(j) == 35) {
                        output[j] = x;
                    }
                } else if (j == 35) {
                    if (list.get(j) == 36) {
                        output[j] = x;
                    }
                } else if (j == 36) {
                    if (list.get(j) == 37) {
                        output[j] = x;
                    }
                } else if (j == 37) {
                    if (list.get(j) == 38) {
                        output[j] = x;
                    }
                } else if (j == 38) {
                    if (list.get(j) == 39) {
                        output[j] = x;
                    }
                } else if (j == 39) {
                    if (list.get(j) == 40) {
                        output[j] = x;
                    }
                } else if (j == 40) {
                    if (list.get(j) == 41) {
                        output[j] = x;
                    }
                } else if (j == 41) {
                    if (list.get(j) == 42) {
                        output[j] = x;
                    }
                } else if (j == 42) {
                    if (list.get(j) == 43) {
                        output[j] = x;
                    }
                } else if (j == 43) {
                    if (list.get(j) == 44) {
                        output[j] = x;
                    }
                } else if (j == 44) {
                    if (list.get(j) == 45) {
                        output[j] = x;
                    }
                } else if (j == 45) {
                    if (list.get(j) == 46) {
                        output[j] = x;
                    }
                } else if (j == 46) {
                    if (list.get(j) == 47) {
                        output[j] = x;
                    }
                } else if (j == 47) {
                    if (list.get(j) == 48) {
                        output[j] = x;
                    }
                } else if (j == 48) {
                    if (list.get(j) == 49) {
                        output[j] = x;
                    }
                } else if (j == 49) {
                    if (list.get(j) == 50) {
                        output[j] = x;
                    }
                } else if (j == 50) {
                    if (list.get(j) == 51) {
                        output[j] = x;
                    }
                } else if (j == 51) {
                    if (list.get(j) == 52) {
                        output[j] = x;
                    }
                } else if (j == 52) {
                    if (list.get(j) == 53) {
                        output[j] = x;
                    }
                } else if (j == 53) {
                    if (list.get(j) == 54) {
                        output[j] = x;
                    }
                } else if (j == 54) {
                    if (list.get(j) == 55) {
                        output[j] = x;
                    }
                } else if (j == 55) {
                    if (list.get(j) == 56) {
                        output[j] = x;
                    }
                } else if (j == 56) {
                    if (list.get(j) == 57) {
                        output[j] = x;
                    }
                } else if (j == 57) {
                    if (list.get(j) == 58) {
                        output[j] = x;
                    }
                } else if (j == 58) {
                    if (list.get(j) == 59) {
                        output[j] = x;
                    }
                } else if (j == 59) {
                    if (list.get(j) == 60) {
                        output[j] = x;
                    }
                } else if (j == 60) {
                    if (list.get(j) == 61) {
                        output[j] = x;
                    }
                } else if (j == 61) {
                    if (list.get(j) == 62) {
                        output[j] = x;
                    }
                } else if (j == 62) {
                    if (list.get(j) == 63) {
                        output[j] = x;
                    }
                } else if (j == 63) {
                    if (list.get(j) == 64) {
                        output[j] = x;
                    }
                } else if (j == 64) {
                    if (list.get(j) == 65) {
                        output[j] = x;
                    }
                } else if (j == 65) {
                    if (list.get(j) == 66) {
                        output[j] = x;
                    }
                } else if (j == 66) {
                    if (list.get(j) == 67) {
                        output[j] = x;
                    }
                } else if (j == 67) {
                    if (list.get(j) == 68) {
                        output[j] = x;
                    }
                } else if (j == 68) {
                    if (list.get(j) == 69) {
                        output[j] = x;
                    }
                } else if (j == 69) {
                    if (list.get(j) == 70) {
                        output[j] = x;
                    }
                } else if (j == 70) {
                    if (list.get(j) == 71) {
                        output[j] = x;
                    }
                } else if (j == 71) {
                    if (list.get(j) == 72) {
                        output[j] = x;
                    }
                } else if (j == 72) {
                    if (list.get(j) == 73) {
                        output[j] = x;
                    }
                } else if (j == 73) {
                    if (list.get(j) == 74) {
                        output[j] = x;
                    }
                } else if (j == 74) {
                    if (list.get(j) == 75) {
                        output[j] = x;
                    }
                } else if (j == 75) {
                    if (list.get(j) == 76) {
                        output[j] = x;
                    }
                } else if (j == 76) {
                    if (list.get(j) == 77) {
                        output[j] = x;
                    }
                } else if (j == 77) {
                    if (list.get(j) == 78) {
                        output[j] = x;
                    }
                } else if (j == 78) {
                    if (list.get(j) == 79) {
                        output[j] = x;
                    }
                } else if (j == 79) {
                    if (list.get(j) == 80) {
                        output[j] = x;
                    }
                } else if (j == 80) {
                    if (list.get(j) == 81) {
                        output[j] = x;
                    }
                } else if (j == 81) {
                    if (list.get(j) == 82) {
                        output[j] = x;
                    }
                } else if (j == 82) {
                    if (list.get(j) == 83) {
                        output[j] = x;
                    }
                } else if (j