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
        int target = elems[startIndex - 1];
        int toDelete = 0;
        for (int i = startIndex - 1; i < numElements; i++) {
            if (elems[i] == target) {
                toDelete++;
            } else {
                break;
            }
        }
        System.out.println(toDelete);
    }
}