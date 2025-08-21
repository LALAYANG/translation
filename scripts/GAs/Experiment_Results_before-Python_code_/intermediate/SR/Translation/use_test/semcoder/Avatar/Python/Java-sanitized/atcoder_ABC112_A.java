import java.util.Scanner;

public class atcoder_ABC112_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int age = input.nextInt();
        
        if (age == 1) {
            System.out.println("Hello World");
        } else {
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println(a + b);
        }
    }
}