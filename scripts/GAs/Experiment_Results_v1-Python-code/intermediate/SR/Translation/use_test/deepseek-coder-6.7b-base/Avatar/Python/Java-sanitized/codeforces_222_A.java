import java.util.Scanner;

public class codeforces_222_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int splitPoint = sc.nextInt();
        int[] elems = new int[n];
        for (int i = 0; i < n; i++) {
            elems[i] = sc.nextInt();
        }
        if (splitPoint == 1) {
            System.out.println(-1);
            return;
        }
        if (!allSame(elems, splitPoint)) {
            System.out.println(-1);
            return;
        }
        int target = elems[splitPoint - 1];
        int elementsToDelete = 0;
        for (int i = 0; i < splitPoint - 1; i++) {
            if (elems[i] == target) {
                elementsToDelete++;
            }
        }
        System.out.println(elementsToDelete);
    }

    private static boolean allSame(int[] elems, int splitPoint) {
        int target = elems[splitPoint - 1];
        for (int i = 0; i < splitPoint - 1; i++) {
            if (elems[i] != target) {
                return false;
            }
        }
        return true;
    }
}