

```java

```
/src/main/java/com/hackerrank/algorithms/implementation/SockMerchant.java
package com.hackerrank.algorithms.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SockMerchant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
        in.close();
    }

    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> socks = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (socks.containsKey(ar[i])) {
                socks.put(ar[i], socks.get(ar[i]) + 1);
            } else {
                socks.put(ar[i], 1);
            }
        }
        int pairs = 0;
        for (Map.Entry<Integer, Integer> entry : socks.entrySet()) {
            pairs += entry.getValue() / 2;
        }
        return pairs;
    }

    static int sockMerchant2(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
         }
        }
        return pairs;
    }
}
           if (ar[i] == ar[j]) {
                    pairs++;
                }
            }
        /src/main/java/com/hackerrank/algorithms/implementation/GradingStudents.java
package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class GradingStudents {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");

        in.close();
    }

    static int[] solve(int[] grades){
        int[] result = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i];
            if (grade < 38) {
                result[i] = grade;
            } else {
                int nextMultiple = (grade / 5 + 1) * 5;
                if (nextMultiple - grade < 3) {
                    result[i] = nextMultiple;
                } else {
                    result[i] = grade;
                }
            }
        }
        return result;
    }
}
/src/main/java/com/hackerrank/algorithms/implementation/AppleAndOrange.java
package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class AppleAndOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++)  }
        System.out.println(orangeCount);
    }
}
{
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apple, orange);
        in.close();
    }

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int appleCount = 0;
        for (int i = 0; i < apples.length; i++) {
            if (a + apples[i] >= s && a + apples[i] <= t) {
                appleCount++;
            }
        }
        System.out.println(appleCount);
        int orangeCount = 0;
        for (int i = 0; i < oranges.length; i++) {
            if (b + oranges[i] >= s && b + oranges[i] <= t) {
                orangeCount++;
            }
      /src/main/java/com/hackerrank/algorithms/implementation/BetweenTwoSets.java
package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class BetweenTwoSets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }

    static int getTotalX(int[] a, int[] b) {
        int total = 0;
        int min = a[0];
        int max = b[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        for (int i = 1; i < b.length; i++) {
            if (b[i] > max) {
                max = b[i];
            }
        }
        for (int i = min; i <= max; i++) {
            boolean divisible = true;
            for (int j = 0; j < a.length; j++) {
                if (i % a[j] != 0) {
                    divisible = false;
                    break;
                }
            }
            if (divisible) {
                for (int j = 0; j < b.length; j++) {
                    if (b[j] % i != 0) {
                        divisible = false;
                        break;
                    }
                }
            }
            if (divisible) {
                total++;
            }
        }
        return total;
    }
}
/src/main/java/com/hackerrank/algorithms/implementation/DivisibleSumPairs.java
package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class DivisibleSumPairs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
        in.close();
    }

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((ar[i] + ar[j]) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
  }
        return result;
    }
}
/src/main/java/com/hackerrank/algorithms/implementation/BirthdayChocolate.java
package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class BirthdayChocolate {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
        in.close();
    }

    static int solve(int n, int[] s, int d, int m){
        int result = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < i + m; j++) {
                if (j < n) {
                    sum += s[j];
                }
            }
            if (sum == d) {
                result++;
            }
      /src/main/java/com/hackerrank/algorithms/implementation/BreakingTheRecords.java
package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class BreakingTheRecords {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i=0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int[] result = getRecord(score);
        System.out.println(result[0] + " " + result[1]);
        in.close();
    }

    static int[] getRecord(int[] s){
        int[] result = new int[2];
        int min = s[0];
        int max = s[0];
        for (int i = 1; i < s.length; i++) {
             }
            if (s[i] > max) {
                max = s[i];
                result[0]++;
            }
        }
        return result;
    }
}
 if (s[i] < min) {
                min = s[i];
                result[1]++;
                continue;
          /src/main/java/com/hackerrank/algorithms/implementation/MigratoryBirds.java
package com.hackerrank.algorithms.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MigratoryBirds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
        in.close();
    }

    static int migratoryBirds(int n, int[] ar) {
        Map<Integer, Integer> birds = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (birds.containsKey(ar[i])) {
                birds.put(ar[i], birds.get(ar[i]) + 1);
            } else {
                birds.put(ar[i], 1);
            }
        }
        int max = 0;
        int maxBird = 0;
        for (Map.Entry<Integer, Integer> entry : birds.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxBird = entry.getKey();
            }
        }
        return maxBird;
    }
}
/src/main/java/com/hackerrank/algorithms/implementation/BonAppetit.java
package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class BonAppetit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        bonAppetit(n, k, ar, b);
        in.close();
    }

    static void bonAppetit(int n, int k, int[] ar, int b) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i != k) {
                sum += ar[i];
            }
        }
        int actual = sum / 2;
        if (actual == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - actual);
        }
    }

    static  0; i < n; i++) {
            if (i != k) {
                sum += ar[i];
            }
        }
        int actual = sum / 2;
        if (actual == b) {
            return "Bon Appetit";
        } else {
            return String.valueOf(b - actual);
        }
    }
}
String bonAppetit2(int n, int k, int[] ar, int b) {
        int sum =/src/main/java/com/hackerrank/algorithms/implementation/Kangaroo.java
package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class Kangaroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
        in.close();
    }

    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 <= v2) {
            return "NO";
        }
        int distance = x2 - x1;
        int speed = v1 - v2;
        if (distance % speed == 0) {
            return "YES";
        }
        return "NO";
    }
}
/src/main/java/com/hackerrank/algorithms/implementation/DrawingBook.java
package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class D  }
        return result;
    }
}
rawingBook {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
        in.close();
    }

    static int solve(int n, int p){
        int result = 0;
        if (n % 2 == 0) {
            if (p == n) {
                return 0;
            }
            if (p == 1) {
                return 0;
            }
            if (p % 2 == 0) {
                result = p / 2;
            } else {
                result = (p - 1) / 2;
            }
        } else {
            if (p == n) {
                return 0;
            }
            if (p == 1) {
                return 0;
            }
            if (p % 2 == 0) {
                result = p / 2;
            } else {
                result = (p - 1) / 2;
            }
            if (result > (n - p) / 2) {

            }
      
