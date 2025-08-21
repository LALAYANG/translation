import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Scanner;

public class codeforces_400_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxMoves = scanner.nextInt();
        String[] routes = new String[n];
        for (int i = 0; i < n; i++) {
            routes[i] = scanner.next();
        }

        Set<Integer> c = new HashSet<>();
        for (String route : routes) {
            int sIndex = route.indexOf('S');
            int gIndex = route.indexOf('G');
            int distance = sIndex - gIndex;
            c.add(distance);
        }

        int[] shuffled = shuffle(new int[] { 58, 44, 16 });
        int result = -1;
        for (int i = 0; i < shuffled.length; i++) {
            if (c.contains(shuffled[i])) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }

    public static int[] shuffle(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = (int) (Math.random() * n);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}