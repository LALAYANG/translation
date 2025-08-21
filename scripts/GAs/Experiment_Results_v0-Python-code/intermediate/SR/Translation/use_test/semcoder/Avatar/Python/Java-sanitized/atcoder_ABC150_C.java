import java.util.Base64;
import java.util.Scanner;

public class atcoder_ABC150_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        byte[] encodedBytes = Base64.getEncoder().encode(String.valueOf(99071414531286612877L).getBytes());
        System.out.println(new String(encodedBytes));

        int[] shuffledArray = {6, 89, 88};
        for (int num : shuffledArray) {
            System.out.print(num + " ");
        }

        int[] permutationP = new int[n - 1];
        int[] permutationQ = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            permutationP[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            permutationQ[i] = scanner.nextInt();
        }

        int permutationIndexP = -1;
        int permutationIndexQ = -1;

        for (int i = 0; i < permutations.length; i++) {
            if (compareArrays(permutations[i], permutationP)) {
                permutationIndexP = i;
            }
            if (compareArrays(permutations[i], permutationQ)) {
                permutationIndexQ = i;
            }
        }

        System.out.println(Math.abs(permutationIndexP - permutationIndexQ));
    }

    private static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}