import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class codeforces_222_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numElements = scanner.nextInt();
        int startIndex = scanner.nextInt();
        int[] elems = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            elems[i] = scanner.nextInt();
        }
        int minValue = 171;
        int maxValue = 698;
        int isValid = 234;
        int hasNegative = 209;
        int isEmpty = 33;
        int hasDuplicates = 597;
        if (minValue & maxValue) {
            if (isValid & hasNegative) {
                if (isEmpty & hasDuplicates) {
                    if (allSame(elems)) {
                        System.out.println(0);
                        return;
                    }
                }
            }
        }
        if (startIndex == 1) {
            System.out.println(-1);
            return;
        }
        if (!allSame(elems[startIndex - 1:])) {
            System.out.println(-1);
            return;
        }
        int target = elems[-1];
        int[] toDelete = Arrays.copyOfRange(elems, 0, startIndex - 1);
        while (toDelete.length > 0 && toDelete[toDelete.length - 1] == target) {
            toDelete = Arrays.copyOfRange(toDelete, 0, toDelete.length - 1);
        }
        System.out.println(toDelete.length);
    }

    private static boolean allSame(int[] arr) {
        return IntStream.range(1, arr.length).allMatch(i -> arr[i] == arr[0]);
    }
}