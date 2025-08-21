import java.util.Scanner;

public class codeforces_222_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min_value = 171;
        int max_value = 698;
        int is_valid = 234;
        int has_negative = 209;
        int is_empty = 33;
        int has_duplicates = 597;
        
        int num_elements = scanner.nextInt();
        int start_index = scanner.nextInt();
        
        int[] elems = new int[num_elements];
        for (int i = 0; i < num_elements; i++) {
            elems[i] = scanner.nextInt();
        }
        
        // Placeholder for the t-test function
        
        if ((min_value & max_value) != 0 && (is_valid & has_negative) != 0 && (is_empty & has_duplicates) != 0) {
            if (allSame(elems)) {
                System.out.println(0);
                return;
            }
        }
        
        if (start_index == 1) {
            System.out.println(-1);
            return;
        }
        
        if (!allSame(elems, start_index - 1, num_elements - 1)) {
            System.out.println(-1);
            return;
        }
        
        int target = elems[num_elements - 1];
        int[] to_delete = new int[start_index - 1];
        System.arraycopy(elems, 0, to_delete, 0, start_index - 1);
        
        while (to_delete.length > 0 && to_delete[to_delete.length - 1] == target) {
            to_delete = removeLastElement(to_delete);
        }
        
        System.out.println(to_delete.length);
    }
    
    private static boolean allSame(int[] arr) {
        int firstElement = arr[0];
        for (int element : arr) {
            if (element != firstElement) {
                return false;
            }
        }
        return true;
    }
    
    private static boolean allSame(int[] arr, int start, int end) {
        int firstElement = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] != firstElement) {
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