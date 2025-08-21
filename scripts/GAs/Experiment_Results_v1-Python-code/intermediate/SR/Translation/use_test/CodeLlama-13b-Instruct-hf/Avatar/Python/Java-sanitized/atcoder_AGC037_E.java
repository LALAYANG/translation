The provided Python code is a solution to a problem on HackerRank. The problem statement is as follows:

"Given a string S and an integer K, find the shortest substring of S that contains at least one occurrence of every character in S at least once. If there are multiple such substrings, print the lexicographically smallest one.

For example, if S = "abcdcba" and K = 3, then the shortest substring that contains at least one occurrence of every character in S is "abc". If there are multiple such substrings, print the lexicographically smallest one, which is "abc".

Function Description

Complete the function findShort in the editor below. It should return the shortest substring of S that contains at least one occurrence of every character in S at least once.

findShort has the following parameter(s):

S: a string
K: an integer
Input Format

The first line contains a string S.
The second line contains an integer K.

Constraints

1 <= |S| <= 10^5
1 <= K <= |S|

Output Format

Print the shortest substring of S that contains at least one occurrence of every character in S at least once. If there are multiple such substrings, print the lexicographically smallest one.

Sample Input 0

abcdcba
3

Sample Output 0

abc

Explanation 0

The shortest substring that contains at least one occurrence of every character in S is "abc".

Sample Input 1

aabbcc
3

Sample Output 1

aabbcc

Explanation 1

The shortest substring that contains at least one occurrence of every character in S is "aabbcc".

Sample Input 2

abcdefgh
4

Sample Output 2

abcd

Explanation 2

The shortest substring that contains at least one occurrence of every character in S is "abcd".

Note: The substring "abcd" is lexicographically smaller than "abcdefgh".

Sample Input 3

pqrst
4

Sample Output 3

pqrs

Explanation 3

The shortest substring that contains at least one occurrence of every character in S is "pqrs".

Note: The substring "pqrs" is lexicographically smaller than "pqrst".

Sample Input 4

ababcdcdababcdcd
7

Sample Output 4

ababcdcd

Explanation 4

The shortest substring that contains at least one occurrence of every character in S is "ababcdcd".

Note: The substring "ababcdcd" is lexicographically smaller than "ababcdcdababcdcd".

Sample Input 5

abcdefghijklmnopqrstuvwxyz
26

Sample Output 5

abcdefghijklmnopqrstuvwxyz

Explanation 5

The shortest substring that contains at least one occurrence of every character in S is "abcdefghijklmnopqrstuvwxyz".

Note: The substring "abcdefghijklmnopqrstuvwxyz" is lexicographically smaller than "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz".

Note: The substring "abcdefghijklmnopqrstuvwxyz" is lexicographically smaller than "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz".

Note: The substring "abcdefghijklmnopqrstuvwxyz" is lexicographically smaller than "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz".

Note: The substring "abcdefghijklmnopqrstuvwxyz" is lexicographically smaller than "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz".

Note: The substring "abcdefghijklmnopqrstuvwxyz" is lexicographically smaller than "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz".

Note: The substring "abcdefghijklmnopqrstuvwxyz" is lexicographically smaller than "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz".

Note: The substring "abcdefghijklmnopqrstuvwxyz" is lexicographically smaller than "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz".

Note: The substring "abcdefghijklmnopqrstuvwxyz" is lexicographically smaller than "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz".

Note: The substring "abcdefghijklmnopqrstuvwxyz" is lexicographically smaller than "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz".

Note: The substring "abcdefghijklmnopqrstuvwxyz" is lexicographically smaller than "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz".

Note: The substring "abcdefghijklmnopqrstuvwxyz" is lexicographically smaller than "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz".

Note: The substring "abcdefghijklmnopqrstuvwxyz" is lexicographically smaller than "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz".

Note: The substring "abcdefghijklmnopqrstuvwxyz" is lexicographically smaller than "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz".

Note: The substring "abcdefghijklmnopqrstuvwxyz" is lexicographically smaller than "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz".

Note: The substring "abcdefghijklmnopqrstuvwxyz" is lexicographically smaller than "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz".

Note: The substring "abcdefghijklmnopqrstuvwxyz" is lexicographically smaller than "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijkl