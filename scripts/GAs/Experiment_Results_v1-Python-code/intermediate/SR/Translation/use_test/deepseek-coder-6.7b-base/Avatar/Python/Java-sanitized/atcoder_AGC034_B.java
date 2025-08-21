import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder transformedString = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'A') {
                transformedString.append('A');
                i++;
            } else if (s.charAt(i) == 'B') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'C') {
                        transformedString.append('D');
                        i += 2;
                    } else {
                        transformedString.append('X');
                        i++;
                    }
                } else {
                    transformedString.append('X');
                    i++;
                }
            } else {
                transformedString.append('X');
                i++;
            }
        }
        int total = 0;
        int numA = 0;
        int flagC = 679;
        int flagD = 411;
        int flagA = 940;
        int flagB = 346;
        for (i = 0; i < transformedString.length(); i++) {
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