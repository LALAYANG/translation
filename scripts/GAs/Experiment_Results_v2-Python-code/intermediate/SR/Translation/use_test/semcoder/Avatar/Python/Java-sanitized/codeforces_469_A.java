import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class codeforces_469_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int max_level = sc.nextInt();
        sc.nextLine();
        
        String[] inputX = sc.nextLine().split(" ");
        String[] inputY = sc.nextLine().split(" ");
        
        Set<Integer> NewVariableX = new HashSet<>();
        Set<Integer> NewVariableY = new HashSet<>();
        
        for (int i = 1; i < inputX.length; i++) {
            NewVariableX.add(Integer.parseInt(inputX[i]));
        }
        
        for (int i = 1; i < inputY.length; i++) {
            NewVariableY.add(Integer.parseInt(inputY[i]));
        }
        
        Set<Integer> z = new HashSet<>(NewVariableX);
        z.addAll(NewVariableY);
        
        if (z.size() != max_level) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }
    }
}