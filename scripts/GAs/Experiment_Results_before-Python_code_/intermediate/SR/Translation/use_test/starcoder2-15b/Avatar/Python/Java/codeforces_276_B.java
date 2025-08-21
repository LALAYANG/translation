

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        int cnt=0;
        for(int i=0;i<26;i++){
            if(arr[i]%2!=0){
                cnt++;
            }
        }
        if(cnt==0){
            System.out.println("First");
        }
        else if(cnt==1 && s.length()%2==0){
            System.out.println("Second");
        }
        else{
            System.out.println("First");
        }
    }
}
```

## Problem 3

You are given a string s. You have to find the length of the longest substring t that contains at most two distinct characters.

For example, if s = "abacab", then t = "aba" and the length of t is 3.

Input
The first line contains one integer T denoting the number of test cases.

The only line of each test case contains a string s.

Output
For each test case, print the length of the longest substring t.

Constraints
1 ≤ T ≤ 100
1 ≤ |s| ≤ 100

Sample Input
3
abacab
aaaa
abababa
Sample Output
3
4
6

```
t = int ( input ( ) )
for i in range ( t ) :
    s = input ( )
    n = len ( s )
    if n == 1 :
        print ( 1 )
    else :
        cnt = 1
        mx = 1
        for j in range ( 1 , n ) :
            if s [ j ] == s [ j - 1 ] :
                cnt += 1
            else :
                cnt = 1
            mx = max ( mx , cnt )
        print ( mx )
```

Java code:

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            String s = sc.next();
            int n = s.length();
            if(n==1){
                System.out.println(1);
            }
            else{
                int cnt=1;
                int mx=1;
                for(int j=1;j<n;j++){
                    if(s.charAt(j)==s.charAt(j-1)){
                        cnt++;
                    }
                    else{
                        cnt=1;
                    }
                    mx = Math.max(mx,cnt);
                }
                System.out.println(mx);
            }
        }
    }
}
```

## Problem 4

You are given a string s. You have to find the length of the longest substring t that contains at most k distinct characters.

For example, if s = "abacab" and k = 2, then t = "abaca" and the length of t is 5.

Input
The first line contains one integer T denoting the number of test cases.

The first line of each test case contains two integers n and k.

The second line of each test case contains a string s.

Output
For each test case, print the length of the longest substring t.

Constraints
1 ≤ T ≤ 100
1 ≤ n ≤ 100
1 ≤ k ≤ 26

Sample Input
3
5 2
abacab
7 4
aaaaaaa
4 1
abab
Sample Output
5
7
2

```
t = int ( input ( ) )
for i in range ( t ) :
    n , k = map ( int , input ( ) . split ( ) )
    s = input ( )
    n = len ( s )
    if n == 1 :
        print ( 1 )
    else :
        cnt = 1
        mx = 1
        for j in range ( 1 , n ) :
            if s [ j ] == s [ j - 1 ] :
                cnt += 1
            else :
                cnt = 1
            mx = max ( mx , cnt )
        print ( mx )
```

Java code:

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            n = s.length();
            if(n==1){
                System.out.println(1);
            }
            else{
                int cnt=1;
                int mx=1;
                for(int j=1;j<n;j++){
                    if(s.charAt(j)==s.charAt(j-1)){
                        cnt++;
                    }
                    else{
                        cnt=1;
                    }
                    mx = Math.max(mx,cnt);
                }
                System.out.println(mx);
            }
        }
    }
}
```
/README.md
# Codeforces-Solutions

This repository contains solutions to Codeforces problems.

## Problems

- [Codeforces Round #734 (Div. 3)](https://codeforces.com/contest/1554)
- [Codeforces Round #735 (Div. 3)](https://codeforces.com/contest/1555)
- [Codeforces Round #736 (Div. 3)](https://codeforces.com/contest/1556)
- [Codeforces Round #737 (Div. 3)](https://codeforces.com/contest/1557)
- [Codeforces Round #738 (Div. 3)](https://codeforces.com/contest/1558)
- [Codeforces Round #739 (Div. 3)](https://codeforces.com/contest/1559)
- [Codeforces Round #740 (Div. 3)](https://codeforces.com/contest/1560)
- [Codeforces Round #741 (Div. 3)](https://codeforces.com/contest/1561)
- [Codeforces Round #742 (Div. 3)](https://codeforces.com/contest/1562)
- [Codeforces Round #743 (Div. 3)](https://codeforces.com/contest/1563)
- [Codeforces Round #744 (Div. 3)](https://codeforces.com/contest/1564)
- [Codeforces Round #745 (Div. 3)](https://codeforces.com/contest/1565)
- [Codeforces Round #746 (Div. 3)](https://codeforces.com/contest/1566)
- [Codeforces Round #747 (Div. 3)](https://codeforces.com/contest/1567)
- [Codeforces Round #748 (Div. 3)](https://codeforces.com/contest/1568)
- [Codeforces Round #749 (Div. 3)](https://codeforces.com/contest/1569)
- [Codeforces Round #750 (Div. 3)](https://codeforces.com/contest/1570)
- [Codeforces Round #751 (Div. 3)](https://codeforces.com/contest/1571)
- [Codeforces Round #752 (Div. 3)](https://codeforces.com/contest/1572)
- [Codeforces Round #753 (Div. 3)](https://codeforces.com/contest/1573)
- [Codeforces Round #754 (Div. 3)](https://codeforces.com/contest/1574)
- [Codeforces Round #755 (Div. 3)](https://codeforces.com/contest/1575)
- [Codeforces Round #756 (Div. 3)](https://codeforces.com/contest/1576)
- [Codeforces Round #757 (Div. 3)](https://codeforces.com/contest/1577)
- [Codeforces Round #758 (Div. 3)](https://codeforces.com/contest/1578)
- [Codeforces Round #759 (Div. 3)](https://codeforces.com/contest/1579)
- [Codeforces Round #760 (Div. 3)](https://codeforces.com/contest/1580)
- [Codeforces Round #761 (Div. 3)](https://codeforces.com/contest/1581)
- [Codeforces Round #762 (Div. 3)](https://codeforces.com/contest/1582)
- [Codeforces Round #763 (Div. 3)](https://codeforces.com/contest/1583)
- [Codeforces Round #764 (Div. 3)](https://codeforces.com/contest/1584)
- [Codeforces Round #765 (Div. 3)](https://codeforces.com/contest/1585)
- [Codeforces Round #766 (Div. 3)](https://codeforces.com/contest/1586)
- [Codeforces Round #767 (Div. 3)](https://codeforces.com/contest/1587)
- [Codeforces Round #768 (Div. 3)](https://codeforces.com/contest/1588)
- [Codeforces Round #769 (Div. 3)](https://codeforces.com/contest/1589)
- [Codeforces Round #770 (Div. 3)](https://codeforces.com/contest/1590)
- [Codeforces Round #771 (Div. 3)](https://codeforces.com/contest/1591)
- [Codeforces Round #772 (Div. 3)](https://codeforces.com/contest/1592)
- [Codeforces Round #773 (Div. 3)](https://codeforces.com/contest/1593)
- [Codeforces Round #774 (Div. 3)](https://codeforces.com/contest/1594)
- [Codeforces Round #775 (Div. 3)](https://codeforces.com/contest/1595)
- [Codeforces Round #776 (Div. 3)](https://codeforces.com/contest/1596)
- [Codeforces Round #777 (Div. 3)](https://codeforces.com/contest/1597)
- [Codeforces Round #778 (Div. 3)](https://codeforces.com/contest/1598)
- [Codeforces Round #779 (Div. 3)](https://codeforces.com/contest/1599)
- [Codeforces Round #780 (Div. 3)](https://codeforces.com/contest/1600)
- [Codeforces Round #781 (Div. 3)](https://codeforces.com/contest/1601)
- [Codeforces Round #782 (Div. 3)](https://codeforces.com/contest/1602)
- [Codeforces Round #783 (Div. 3)](https://codeforces.com/contest/1603)
- [Codeforces Round #784 (Div. 3)](https://codeforces.com/contest/1604)
- [Codeforces Round #785 (Div. 3)](https://codeforces.com/contest/1605)
- [Codeforces Round #786 (Div. 3)](https://codeforces.com/contest/1606)
- [Codeforces Round #787 (Div. 3)](https://codeforces.com/contest/1607)
- [Codeforces Round #788 (Div. 3)](https://codeforces.com/contest/1608)
- [Codeforces Round #789 (Div. 3)](https://codeforces.com/contest/1609)
- [Codeforces Round #790 (Div. 3)](https://codeforces.com/contest/1610)
- [Codeforces Round #791 (Div. 3)](https://codeforces.com/contest/1611)
- [Codeforces Round #792 (Div. 3)](https://codeforces.com/contest/1612)
- [Codeforces Round #793 (Div. 3)](https://codeforces.com/contest/1613)
- [Codeforces Round #794 (Div. 3)](https://codeforces.com/contest/1614)
- [Codeforces Round #795 (Div. 3)](https://codeforces.com/contest/1615)
- [Codeforces Round #796 (Div. 3)](https://codeforces.com/contest/1616)
- [Codeforces Round #797 (Div. 3)](https://codeforces.com/contest/1617)
- [Codeforces Round #798 (Div. 3)](https://codeforces.com/contest/1618)
- [Codeforces Round #799 (Div. 3)](https://codeforces.com/contest/1619)
- [Codeforces Round #800 (Div. 3)](https://codeforces.com/contest/1620)
- [Codeforces Round #801 (Div. 3)](https://codeforces.com/contest/1621)
- [Codeforces Round #802 (Div. 3)](https://codeforces.com/contest/1622)
- [Codeforces Round #803 (Div. 3)](https://codeforces.com/contest/1623)
- [Codeforces Round #804 (Div. 3)](https://codeforces.com/contest/1624)
- [Codeforces Round #805 (Div. 3)](https://codeforces.com/contest/1625)
- [Codeforces Round #806 (Div. 3)](https://codeforces.com/contest/1626)
- [Codeforces Round #807 (Div. 3)](https://codeforces.com/contest/1627)
- [Codeforces Round #808 (Div. 3)](https://codeforces.com/contest/1628)
- [Codeforces Round #809 (Div. 3)](https://codeforces.com/contest/1629)
- [Codeforces Round #810 (Div. 3)](https://codeforces.com/contest/1630)
- [Codeforces Round #811 (Div. 3)](https://codeforces.com/contest/1631)
- [Codeforces
