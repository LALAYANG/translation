import java.util.Scanner;

public class codeforces_222_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] elems = new int[n];
        for (int i = 0; i < n; i++) {
            elems[i] = scanner.nextInt();
        }

        boolean allSame = true;
        for (int i = 1; i < n; i++) {
            if (elems[i] != elems[0]) {
                allSame = false;
                break;
            }
        }

        if (allSame) {
            System.out.println(0);
        } else if (k == 1) {
            System.out.println(-1);
        } else if (!allSame(elems, k, n)) {
            System.out.println(-1);
        } else {
            int target = elems[n - 1];
            int[] toDelete = new int[k - 1];
            System.arraycopy(elems, 0, toDelete, 0, k - 1);

            while (toDelete.length > 0 && toDelete[toDelete.length - 1] == target) {
                toDelete = removeLastElement(toDelete);
            }

            System.out.println(toDelete.length);
        }
    }

    private static boolean allSame(int[] arr, int start, int end) {
        for (int i = start; i < end; i++) {
            if (arr[i] != arr[start]) {
                return false;
            }
        }
        return true;
    }

    private static int[] removeLastElement(int[] arr) {
        int[] newArr = new int[arr.length - 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length - 1);
        return newArr;
    }
}