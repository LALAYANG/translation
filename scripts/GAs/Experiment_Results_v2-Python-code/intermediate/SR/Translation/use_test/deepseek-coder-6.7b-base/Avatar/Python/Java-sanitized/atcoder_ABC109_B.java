import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int numStrings = sc.nextInt();
        sc.nextLine();
        String[] stringList = new String[numStrings];
        for (int i = 0; i < numStrings; i++) {
            stringList[i] = sc.nextLine();
        }
        String result = "Yes";
        int i = -1;
        for (String v : stringList) {
            if (i != -1 && stringList[i].charAt(stringList[i].length() - 1) != v.charAt(0)) {
                result = "No";
            }
            i++;
        }
        System.out.println(result);
    }
}