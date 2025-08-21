import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] cake = new String[n];
        int happiness = 0;
        int chocCount = 0;
        int nfat = 1;
        int initialCheck = 925;
        int cakeCheck = 287;
        for (int i = 0; i < n; i++) {
            cake[i] = sc.nextLine();
            for (int j = 0; j < n; j++) {
                if (cake[i].charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if ((initialCheck & cakeCheck) != 0) {
                if (chocCount > 1) {
                    nfat = 1;
                    for (int j = chocCount; j > chocCount - 2; j--) {
                        nfat *= j;
                    }
                    happiness += nfat / 2;
                }
            }
            nfat = 1;
            chocCount = 0;
        }
        int posCount = 0;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (cake[i].charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if (chocCount > 1) {
                nfat = 1;
                for (int i = chocCount; i > chocCount - 2; i--) {
                    nfat *= i;
                }
                happiness += nfat / 2;
            }
            nfat = 1;
            chocCount = 0;
        }
        System.out.println(happiness);
    }
}