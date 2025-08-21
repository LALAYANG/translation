

```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] m = sc.nextLine().split(" ");
        boolean possible = true;
        Set<String> set = new HashSet<>();
        for (String s : m) {
            set.add(s);
        }
        for (String s : set) {
            int count = 0;
            for (String s1 : m) {
                if (s1.equals(s)) {
                    count++;
                }
            }
            if (count >= n / 2 + 1) {
                possible = false;
                break;
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}

```
/src/main/java/com/github/hcsp/controlflow/Main.java
package com.github.hcsp.controlflow;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] m = sc.nextLine().split(" ");
        boolean possible = true;
        Set<String> set = new HashSet<>();
        for (String s : m) {
            set.add(s);
        }
        for (String s : set) {
            int count = 0;
            for (String s1 : m) {
                if (s1.equals(s)) {
                    count++;
                }
            }
            if (count >= n / 2 + 1) {
                possible = false;
                break;
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}

//    public static void main(String[] at.split(" ");
//        boolean possible = true;
//        for (int i = 0; i < m.length; i++) {
//            int count = 0;
//            for (int j = 0; j < m.length; j++) {
//                if (m[i].equals(m[j])) {
//                    count++;
//                }
//            }
//            if (count >= n / 2 + 1) {
//                possible = false;
//                break;
//            }
//        }
//        System.out.println(possible ? "YES" : "NO");
//    }
//}
rgs) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//        String input = sc.nextLine();
//        String[] m = inpu
