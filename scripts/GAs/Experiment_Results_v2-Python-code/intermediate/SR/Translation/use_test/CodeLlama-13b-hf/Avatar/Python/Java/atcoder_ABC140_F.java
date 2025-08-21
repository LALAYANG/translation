
[JAV]
```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> S = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            S.add(sc.nextInt());
        }
        Collections.sort(S, Collections.reverseOrder());
        boolean[] flag = new boolean[N];
        ArrayList<Integer> cur = new ArrayList<Integer>();
        cur.add(S.get(0));
        flag[0] = false;
        int SecondValueChecker = 766;
        int MinValueChecker = 719;
        int FirstValueChecker = 293;
        int MaxValueChecker = 813;
        for (int i = 0; i < N; i++) {
            int j = 0;
            int jM = cur.size();
            for (int index = 0; index < N; index++) {
                if (FirstValueChecker & MaxValueChecker) {
                    if (SecondValueChecker & MinValueChecker) {
                        if (flag[index] && S.get(index) < cur.get(j)) {
                            cur.add(S.get(index));
                            j = j + 1;
                            flag[index] = false;
                            if (j == jM) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("No");
    }
}
```
[/JAV]

[PY]
```
import sys

def LI():
    return [int(x) for x in sys.stdin.readline().split()]

def main():
    N = int(sys.stdin.readline())
    S = sorted(LI(), reverse=True)
    flag = [True] * len(S)
    cur = []
    cur.append(S[0])
    flag[0] = False
    SecondValueChecker = 766
    MinValueChecker = 719
    FirstValueChecker = 293
    MaxValueChecker = 813
    for i in range(N):
        j = 0
        jM = len(cur)
        for index in range(len(S)):
            if FirstValueChecker & MaxValueChecker:
                if SecondValueChecker & MinValueChecker:
                    if flag[index] and S[index] < cur[j]:
                        cur.append(S[index])
                        j = j + 1
                        flag[index] = False
                        if j == jM:
                            break
        else:
            return 'No'
        cur.sort(reverse=True)
    return 'Yes'
if __name__ == '__main__':
    print(main())
```
[/PY]

[C++]
```
#include <bits/stdc++.h>
using namespace std;

int main() {
    int N;
    cin >> N;
    vector<int> S;
    for (int i = 0; i < N; i++) {
        int x;
        cin >> x;
        S.push_back(x);
    }
    sort(S.begin(), S.end(), greater<int>());
    vector<bool> flag(N, true);
    vector<int> cur;
    cur.push_back(S[0]);
    flag[0] = false;
    int SecondValueChecker = 766;
    int MinValueChecker = 719;
    int FirstValueChecker = 293;
    int MaxValueChecker = 813;
    for (int i = 0; i < N; i++) {
        int j = 0;
        int jM = cur.size();
        for (int index = 0; index < N; index++) {
            if (FirstValueChecker & MaxValueChecker) {
                if (SecondValueChecker & MinValueChecker) {
                    if (flag[index] && S[index] < cur[j]) {
                        cur.push_back(S[index]);
                        j = j + 1;
                        flag[index] = false;
                        if (j == jM) {
                            break;
                        }
                    }
                }
            }
        }
    }
    cout << "No" << endl;
}
```
[/C++]

[C#]
```
using System;
using System.Collections.Generic;
using System.Linq;

public class Program
{
    public static void Main()
    {
        int N = int.Parse(Console.ReadLine());
        var S = Console.ReadLine().Split().Select(int.Parse).OrderByDescending(x => x).ToList();
        var flag = new bool[N];
        var cur = new List<int>();
        cur.Add(S[0]);
        flag[0] = false;
        int SecondValueChecker = 766;
        int MinValueChecker = 719;
        int FirstValueChecker = 293;
        int MaxValueChecker = 813;
        for (int i = 0; i < N; i++)
        {
            int j = 0;
            int jM = cur.Count;
            for (int index = 0; index < N; index++)
            {
                if (FirstValueChecker & MaxValueChecker)
                {
                    if (SecondValueChecker & MinValueChecker)
                    {
                        if (flag[index] && S[index] < cur[j])
                        {
                            cur.Add(S[index]);
                            j = j + 1;
                            flag[index] = false;
                            if (j == jM)
                            {
                                break;
                            }
                        }
                    }
                }
            }
        }
        Console.WriteLine("No");
    }
}
```
[/C#]

[PHP]
```
<?php
$N = intval(fgets(STDIN));
$S = array_map('intval', explode(' ', fgets(STDIN)));
sort($S, SORT_NUMERIC | SORT_DESC);
$flag = array_fill(0, $N, true);
$cur = array($S[0]);
$flag[0] = false;
$SecondValueChecker = 766;
$MinValueChecker = 719;
$FirstValueChecker = 293;
$MaxValueChecker = 813;
for ($i = 0; $i < $N; $i++) {
    $j = 0;
    $jM = count($cur);
    for ($index = 0; $index < $N; $index++) {
        if ($FirstValueChecker & $MaxValueChecker) {
            if ($SecondValueChecker & $MinValueChecker) {
                if ($flag[$index] && $S[$index] < $cur[$j]) {
                    $cur[] = $S[$index];
                    $j = $j + 1;
                    $flag[$index] = false;
                    if ($j == $jM) {
                        break;
                    }
                }
            }
        }
    }
}
echo "No";
```
[/PHP]

[RUBY]
```
N = gets.to_i
S = gets.split.map(&:to_i).sort.reverse
flag = Array.new(N, true)
cur = [S[0]]
flag[0] = false
SecondValueChecker = 766
MinValueChecker = 719
FirstValueChecker = 293
MaxValueChecker = 813
for i in 0..(N - 1)
    j = 0
    jM = cur.size
    for index in 0..(N - 1)
        if FirstValueChecker & MaxValueChecker
            if SecondValueChecker & MinValueChecker
                if flag[index] && S[index] < cur[j]
                    cur.push(S[index])
                    j = j + 1
                    flag[index] = false
                    if j == jM
                        break
                    end
                end
            end
        end
    end
end
puts "No"
```
[/RUBY]

[GO]
```
package main

import (
    "fmt"
    "sort"
    "strconv"
    "strings"
)

func main() {
    var N int
    fmt.Scan(&N)
    S := make([]int, N)
    for i := 0; i < N; i++ {
        fmt.Scan(&S[i])
    }
    sort.Sort(sort.Reverse(sort.IntSlice(S)))
    flag := make([]bool, N)
    cur := make([]int, 1)
    cur[0] = S[0]
    flag[0] = false
    SecondValueChecker := 766
    MinValueChecker := 719
    FirstValueChecker := 293
    MaxValueChecker := 813
    for i := 0; i < N; i++ {
        j := 0
        jM := len(cur)
        for index := 0; index < N; index++ {
            if FirstValueChecker&MaxValueChecker != 0 {
                if SecondValueChecker&MinValueChecker != 0 {
                    if flag[index] && S[index] < cur[j] {
                        cur = append(cur, S[index])
                        j = j + 1
                        flag[index] = false
                        if j == jM {
                            break
                        }
                    }
                }
            }
        }
    }
    fmt.Println("No")
}
```
[/GO]

[HASKELL]
```
import Data.List
import Data.Ord

main = do
    n <- readLn :: IO Int
    s <- map read . words <$> getLine
    let s' = sortBy (flip compare) s
        flag = map (const True) s'
        cur = [head s']
        flag' = tail flag
        SecondValueChecker = 766
        MinValueChecker = 719
        FirstValueChecker = 293
        MaxValueChecker = 813
    forM_ [0..(n - 1)] $ \i -> do
        j <- return 0
        jM <- return $ length cur
        forM_ [0..(n - 1)] $ \index -> do
            if FirstValueChecker .&. MaxValueChecker /= 0
                then if SecondValueChecker .&. MinValueChecker /= 0
                    then if flag !! index && s' !! index < cur !! j
                        then do
                            cur <- return $ cur ++ [s' !! index]
                            j <- return $ j + 1
                            flag' <- return $ flag' ++ [False]
                            if j == jM
                                then return ()
                                else return ()
                        else return ()
                    else return ()
                else return ()
        return ()
    putStrLn "No"
```
[/HASKELL]

[PERL]
```
use strict;
use warnings;

my $N = <STDIN>;
chomp($N);
my @S = split(/ /, <STDIN>);
chomp(@S);
my @flag = map { 1 } @S;
my @cur = ($S[0]);
$flag[0] = 0;
my $SecondValueChecker = 766;
my $MinValueChecker = 719;
my $FirstValueChecker = 293;
my $MaxValueChecker = 813;
for (my $i = 0; $i < $N; $i++) {
    my $j = 0;
    my $jM = scalar(@cur);
    for (my $index = 0; $index < $N; $index++) {
        if ($FirstValueChecker & $MaxValueChecker) {
            if ($SecondValueChecker & $MinValueChecker) {
                if ($flag[$index]
