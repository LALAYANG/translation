import java.util.Scanner;

public class codeforces_669_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Step 1: Take input n
        int n = sc.nextInt();
        
        // Step 2: Calculate the number of pieces of material needed
        int result = (n * 2 + 1) / 3;
        
        // Step 3: Print the result
        System.out.println(result);
    }
}