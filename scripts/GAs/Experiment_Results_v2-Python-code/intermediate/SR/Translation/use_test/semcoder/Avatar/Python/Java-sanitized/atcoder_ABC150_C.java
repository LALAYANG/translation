import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class atcoder_ABC150_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine();
        
        ArrayList<Integer> permutationList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            permutationList.add(i);
        }
        
        String[] source = scanner.nextLine().split(" ");
        String[] target = scanner.nextLine().split(" ");
        
        int sourceIndex = permutationList.indexOf(Integer.parseInt(source[0]));
        int targetIndex = permutationList.indexOf(Integer.parseInt(target[0]));
        
        int difference = Math.abs(sourceIndex - targetIndex);
        
        System.out.println(difference);
    }
}