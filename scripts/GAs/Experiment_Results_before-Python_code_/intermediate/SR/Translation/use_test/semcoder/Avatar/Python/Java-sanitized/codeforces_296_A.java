import java.util.Scanner;

public class codeforces_296_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        String[] m = scanner.nextLine().split(" ");
        
        boolean possible = true;
        for (String i : set(m)) {
            if (count(m, i) >= n / 2 + 1) {
                possible = false;
                break;
            }
        }
        
        System.out.println(possible ? "YES" : "NO");
    }
    
    public static String[] set(String[] arr) {
        // Implement set logic to remove duplicates
        return arr;
    }
    
    public static int count(String[] arr, String target) {
        // Implement count logic to count occurrences of target in arr
        return 0;
    }
}