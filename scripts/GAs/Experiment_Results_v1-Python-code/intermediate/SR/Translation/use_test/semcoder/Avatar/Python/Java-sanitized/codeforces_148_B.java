import java.util.Scanner;

public class codeforces_148_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int princess = input.nextInt();
        int dragon = input.nextInt();
        int t = input.nextInt();
        int f = input.nextInt();
        int c = input.nextInt();
        
        if (dragon <= princess) {
            System.out.println(0);
            return;
        }
        
        int result = 0;
        double position = t * princess;
        position += princess * position / (dragon - princess);
        
        while (position < c) {
            result++;
            position += princess * position / dragon;
            position += princess * f;
            position += princess * position / (dragon - princess);
        }
        
        System.out.println(result);
    }
}