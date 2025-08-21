import java.util.Scanner;

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
        boolean isValid = true;
        boolean hasNegative = false;
        boolean isEmpty = false;
        boolean hasDuplicates = false;

        for (int i = 0; i < numElements; i++) {
            if (elems[i] < minValue || elems[i] > maxValue) {
                isValid = false;
                break;
            }
            if (elems[i] < 0) {
                hasNegative = true;
            }
            if (elems[i] == 0) {
                isEmpty = true;
            }
            for (int j = i + 1; j < numElements; j++) {
                if (elems[i] == elems[j]) {
                    hasDuplicates = true;
                    break;
                }
            }
        }

        if (isValid && !hasNegative && !isEmpty && !hasDuplicates) {
            int target = elems[startIndex - 1];
            int toDelete = 0;
            for (int i = startIndex; i < numElements; i++) {
                if (elems[i] == target) {
                    toDelete++;
                }
            }
            System.out.println(toDelete);
        } else {
            System.out.println(-1);
        }
    }
}