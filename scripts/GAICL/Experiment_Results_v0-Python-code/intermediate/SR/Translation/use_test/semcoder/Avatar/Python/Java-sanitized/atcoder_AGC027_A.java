import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_AGC027_A {
    public static void main(String[] args) {
        int[] a = {100, 18132779, 412682070, 141309189, 659925274, 104765981, 381531051, 241880367, 836885153, 420034290, 754052121, 178522842, 209531577, 75672253, 28480496, 411621561, 69147266, 929947988, 130046275, 908122596, 52634146, 115025712, 314230633, 64760919, 180806978, 581197296, 830657404, 270167410, 539684751, 822137046, 664454365, 250513018, 777952570, 523871048, 310831022, 324743959, 385204089, 524225360, 619387222, 416796116, 556443908, 256763933, 649106689, 752519331, 778017432, 410001536, 967395870, 963633494, 451228535, 659878768, 116999903, 47};
        Arrays.sort(a);
        int x = 100;
        int ans = 0;

        if (a[0] > x) {
            System.out.println(0);
            return;
        }

        for (int current_value : a) {
            if (current_value > x) {
                x = 0;
                break;
            }
            x -= current_value;
            ans++;
        }

        if (x != 0) {
            ans--;
        }

        System.out.println(ans);
    }
}