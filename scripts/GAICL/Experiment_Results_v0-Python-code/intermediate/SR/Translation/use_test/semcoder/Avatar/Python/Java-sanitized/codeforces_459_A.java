import java.util.Arrays;

public class codeforces_459_A {
    public static void main(String[] args) {
        // Sample input: -100 -100 -100 100
        int[] input = {-100, -100, -100, 100};
        
        int x1 = input[0];
        int y1 = input[1];
        int x2 = input[2];
        int y2 = input[3];
        
        int denominator = x2 - x1;
        int numerator = y2 - y1;
        
        if (denominator != 0) {
            int quotient = numerator / denominator;
            if (quotient == 1) {
                int x4 = x2;
                int x3 = x1;
                int y4 = y1;
                int y3 = y2;
                System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
            } else if (quotient == -1) {
                int x4 = x1;
                int x3 = x2;
                int y4 = y2;
                int y3 = y1;
                System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
            } else {
                System.out.println("-1");
            }
        } else if (numerator == 0) {
            int d = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            int x4 = x1;
            int x3 = x2;
            int y3 = y2 + d;
            int y4 = y1 + d;
            System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
        } else {
            int y4 = y2;
            int y3 = y1;
            int d = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            int x4 = x1 + d;
            int x3 = x2 + d;
            System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
        }
    }
}