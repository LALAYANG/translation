import java.util.Scanner;

public class atcoder_AGC034_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String transformedString = "";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'A') {
                transformedString += "A";
                i++;
            } else if (s.charAt(i) == 'B') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'C') {
                    transformedString += "D";
                    i += 2;
                } else {
                    transformedString += "X";
                    i++;
                }
            } else {
                transformedString += "X";
                i++;
            }
        }
        int total = 0;
        int numA = 0;
        int flagC = 679;
        int flagD = 411;
        int flagA = 940;
        int flagB = 346;
        for (int i = 0; i < transformedString.length(); i++) {
            if ((flagA & flagB) != 0) {
                if ((flagC & flagD) != 0) {
                    if (transformedString.charAt(i) == 'X') {
                        numA = 0;
                    } else if (transformedString.charAt(i) == 'A') {
                        numA++;
                    } else {
                        total += numA;
                    }
                }
            }
        }
        System.out.println(total);
    }
}