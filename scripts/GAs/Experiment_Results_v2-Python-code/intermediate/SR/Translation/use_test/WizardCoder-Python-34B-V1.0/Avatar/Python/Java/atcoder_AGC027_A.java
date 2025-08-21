```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] sorted_numbers = new int[n];
        for (int i = 0; i < n; i++) {
            sorted_numbers[i] = scanner.nextInt();
        }
        Arrays.sort(sorted_numbers);
        if (sorted_numbers[0] > x) {
            System.out.println(0);
            return;
        }
        int ans = 0;
        for (int i = 0; i < sorted_numbers.length; i++) {
            if (sorted_numbers[i] > x) {
                break;
            }
            x = x - sorted_numbers[i];
            ans++;
        }
        if (x != 0) {
            ans--;
        }
        System.out.println(ans);
    }
}
```

Test input:
100 18132779
412682070 141309189 659925274 104765981 381531051 241880367 836885153 420034290 754052121 178522842 209531577 75672253 28480496 411621561 69147266 929947988 130046275 908122596 52634146 115025712 314230633 64760919 180806978 581197296 830657404 270167410 539684751 822137046 664454365 250513018 777952570 523871048 310831022 324743959 385204089 524225360 619387222 416796116 556443908 256763933 649106689 752519331 778017432 41001536 967395870 963633494 451228535 659878768 116999903 47
Expected output:
0 
