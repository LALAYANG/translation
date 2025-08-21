

```java
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int expectedListLength = sc.nextInt();
        Set<Integer> firstInputList = new HashSet<>();
        Set<Integer> y = new HashSet<>();
        for (int i = 0; i < expectedListLength; i++) {
            firstInputList.add(sc.nextInt());
        }
        for (int i = 0; i < expectedListLength; i++) {
            y.add(sc.nextInt());
        }
        if (firstInputList.contains(0)) {
            firstInputList.remove(0);
        }
        if (y.contains(0)) {
            y.remove(0);
        }
        Set<Integer> z = new HashSet<>(firstInputList);
        z.addAll(y);
        if (z.size() != expectedListLength) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }
    }
}
```

## 10. Theatre Square

Theatre Square in the capital city of Berland has a rectangular shape with the size n × m meters. On the occasion of the city's anniversary, a decision was taken to pave the Square with square granite flagstones. Each flagstone is of the size a × a.

What is the least number of flagstones needed to pave the Square? It's allowed to cover the surface larger than the Theatre Square, but the Square has to be covered. It's not allowed to break the flagstones. The sides of flagstones should be parallel to the sides of the Square.

Input
The input contains three positive integer numbers in the first line: n,  m and a (1 ≤  n, m, a ≤ 109).

Output
Write the needed number of flagstones.

Sample test(s)
input
6 6 4
output
4

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();
        System.out.println((n / a + (n % a == 0 ? 0 : 1)) * (m / a + (m % a == 0 ? 0 : 1)));
    }
}
```

## 11. Word Capitalization

Capitalization is writing a word with its first letter as a capital letter. Your task is to capitalize the given word.

Note, that during capitalization all the letters except the first one remains unchanged.

Input
A single line contains a non-empty word. This word consists of lowercase and uppercase English letters. The length of the word will not exceed 103.

Output
Output the given word after capitalization.

Sample test(s)
input
ApPLe
output
ApPLe

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(Character.toUpperCase(s.charAt(0)) + s.substring(1));
    }
}
```

## 12. Way Too Long Words

Sometimes some words like "localization" or "internationalization" are so long that writing them many times in one text is quite tiresome.

Let's consider a word too long, if its length is strictly more than 10 characters. All too long words should be replaced with a special abbreviation.

This abbreviation is made like this: we write down the first and the last letter of a word and between them we write the number of letters between the first and the last letters. That number is in decimal system and doesn't contain any leading zeroes.

Thus, "localization" will be spelt as "l10n", and "internationalization» will be spelt as "i18n".

You are suggested to automatize the process of changing the words with abbreviations. At that all too long words should be replaced by the abbreviation and the words that are not too long should not undergo any changes.

Input
The first line contains an integer n (1 ≤ n ≤ 100). Each of the following n lines contains one word. All the words consist of lowercase Latin letters and possess the lengths of from 1 to 100 characters.

Output
Print n lines. The i-th line should contain the result of replacing of the i-th word from the input data.

Sample test(s)
input
4
word
localization
internationalization
pneumonoultramicroscopicsilicovolcanoconiosis
output
word
l10n
i18n
p43s

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.length() > 10) {
                System.out.println(s.charAt(0) + String.valueOf(s.length() - 2) + s.charAt(s.length() - 1));
            } else {
                System.out.println(s);
            }
        }
    }
}
```

## 13. Petya and Strings

Petya loves presents. His mum bought him two strings of the same size for his birthday. The strings consist of uppercase and lowercase Latin letters. Now Petya wants to compare those two strings lexicographically. The letters' case does not matter, that is an uppercase letter is considered equivalent to the corresponding lowercase letter. Help Petya perform the comparison.

Input
Each of the first two lines contains a bought string. The strings' lengths range from 1 to 100 inclusive. It is guaranteed that the strings are of the same length and also consist of uppercase and lowercase Latin letters.

Output
If the first string is less than the second one, print "-1". If the second string is less than the first one, print "1". If the strings are equal, print "0". Note that the letters' case is not taken into consideration when the strings are compared.

Sample test(s)
input
aaaa
aaaA
output
0
input
abs
Abz
output
-1
input
abcdefg
AbCdEfF
output
1

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next().toLowerCase();
        String s2 = sc.next().toLowerCase();
        if (s1.compareTo(s2) < 0) {
            System.out.println("-1");
        } else if (s1.compareTo(s2) > 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
```

## 14. String Task

Petya started to attend programming lessons. On the first lesson his task was to write a simple program. The program was supposed to do the following: in the given string, consisting if uppercase and lowercase Latin letters, it:

deletes all the vowels,
inserts a character "." before each consonant,
replaces all uppercase consonants with corresponding lowercase ones.
Vowels are letters "A", "O", "Y", "E", "U", "I", and the rest are consonants. The program's input is exactly one string, it should return the output as a single string, resulting after the program's processing the initial string.

Help Petya cope with this easy task.

Input
The first line represents input string of Petya's program. This string only consists of uppercase and lowercase Latin letters and its length is from 1 to 100, inclusive.

Output
Print the resulting string. It is guaranteed that this string is not empty.

Sample test(s)
input
tour
output
.t.r
input
Codeforces
output
.c.d.f.r.c.s
input
aBAcAba
output
.b.c.b

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u' || c == 'Y' || c == 'y') {
                continue;
            }
            sb.append('.');
            sb.append(Character.toLowerCase(c));
        }
        System.out.println(sb.toString());
    }
}
```

## 15. Twins

A pair of positive integers is called a twins if they are both prime and their difference is exactly 2. For example, 3 and 5 are twins, 5 and 7 are also twins.

Your task is to find the number of twins among the given set of integers.

Input
The first line contains the number of integers n (1 ≤ n ≤ 100). The second line contains n integers a1, a2, ..., an (1 ≤ ai ≤ 100).

Output
Print the number of twins among the given set of integers.

Sample test(s)
input
3
1 7 11
output
1
input
4
2 4 6 8
output
0

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isPrime(a[i]) && isPrime(a[j]) && a[j] - a[i] == 2) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```

## 16. Next Round

"Contestant who earns a score equal to or greater than the k-th place finisher's score will advance to the next round, as long as the contestant earns a positive score..." — an excerpt from contest rules.

A total of n participants took part in the contest (n ≥ k), and you already know their scores. Calculate how many participants will advance to the next round.

Input
The first line of the input contains two integers n and k (1 ≤ k ≤ n ≤ 50) separated by a single space.

The second line contains n space-separated integers a1, a2, ..., an (0 ≤ ai ≤ 100), where ai is the score earned by the participant who got the i-th place. The given sequence is non-increasing (that is, for all i from 1 to n - 1 the following condition is fulfilled: ai ≥ ai + 1).

Output
Output the number of participants who advance to the next round.

Sample test(s)
input
8 5
10 9 8 7 7 7 5 5
output
6
input
4 2
0 0 0 0
output
0

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= a[k - 1] && a[i] > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 17. Bit++

The classic programming language of Bitland is Bit++. This language is so peculiar and complicated.

The language is that peculiar as it has exactly one variable, called x. Also, there are two operations:

Operation ++ increases the value of variable x by 1.
Operation -- decreases the value of variable x by 1.
A statement in language Bit++ is a sequence, consisting of exactly one operation and one variable x. The statement is written without spaces, that is, it can only contain characters "+", "-", "X". Executing a statement means applying the operation it contains.

A program in Bit++ is a sequence of statements, each of them needs to be executed. Executing a program means executing all the statements it contains.

You're given a program in language Bit++. The initial value of x is 0. Execute the program and find its final value (the value of the variable when this program is executed).

Input
The first line contains a single integer n (1 ≤
