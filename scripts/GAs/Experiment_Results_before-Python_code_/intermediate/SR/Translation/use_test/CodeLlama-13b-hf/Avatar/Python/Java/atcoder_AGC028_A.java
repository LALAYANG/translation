
[JAV]

```

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String S = sc.next();
        String T = sc.next();
        char[] list_S = S.toCharArray();
        char[] list_T = T.toCharArray();
        int[] Number_i = new int[N];
        for (int i = 0; i < N; i++) {
            Number_i[i] = i;
        }
        int[] Number_iMN = new int[N];
        for (int i = 0; i < N; i++) {
            Number_iMN[i] = i * M / N;
        }
        int[] Number_j = new int[M];
        for (int j = 0; j < M; j++) {
            Number_j[j] = j;
        }
        int[] Kaburi_j = new int[M];
        for (int j = 0; j < M; j++) {
            Kaburi_j[j] = Number_iMN[j];
        }
        int[] Kaburi_i = new int[M];
        for (int j = 0; j < M; j++) {
            Kaburi_i[j] = Number_j[j];
        }
        int counter = 0;
        int Flag = 0;
        int Kaburi_Size = M;
        while (counter <= Kaburi_Size - 1) {
            if (list_S[Kaburi_i[counter]] == list_T[Kaburi_j[counter]]) {
            } else {
                Flag = 1;
                break;
            }
            counter++;
        }
        int gcd = gcd(N, M);
        if (Flag == 1) {
            System.out.println(-1);
        } else {
            System.out.println(N * M / gcd);
        }
    }

    public static int gcd(int a, int b) {
        while (b > 0) {
            a = a % b;
            a = b;
            b = a % b;
        }
        return a;
    }
}

```

[/JAV]

[PY]

```

import sys

N, M = map(int, sys.stdin.readline().split())
S = sys.stdin.readline().rstrip()
T = sys.stdin.readline().rstrip()
list_S = list(S)
list_T = list(T)
Number_i = [i for i in range(N)]
Number_iMN = []
for i in Number_i:
    Number_iMN.append(i * M / N)
Number_j = [j for j in range(M)]
Kaburi_j = list(set(Number_iMN) & set(Number_j))
Kaburi_i = []
for j in Kaburi_j:
    Kaburi_i.append(int(j * N / M))
counter = 0
Flag = 0
Kaburi_Size = len(Kaburi_i)
while counter <= Kaburi_Size - 1:
    if list_S[int(Kaburi_i[counter])] == list_T[int(Kaburi_j[counter])]:
        pass
    else:
        Flag = 1
        break
    counter += 1
def gcd(a, b):
    while b > 0:
        a, b = b, a % b
    return a
if Flag == 1:
    print(-1)
else:
    print(int(N * M / gcd(N, M)))


```

[/PY]

[GO]

```

package main

import (
	"fmt"
	"strings"
)

func main() {
	var N, M int
	fmt.Scan(&N, &M)
	S := ""
	T := ""
	fmt.Scan(&S)
	fmt.Scan(&T)
	list_S := strings.Split(S, "")
	list_T := strings.Split(T, "")
	Number_i := make([]int, N)
	for i := 0; i < N; i++ {
		Number_i[i] = i
	}
	Number_iMN := make([]int, N)
	for i := 0; i < N; i++ {
		Number_iMN[i] = i * M / N
	}
	Number_j := make([]int, M)
	for j := 0; j < M; j++ {
		Number_j[j] = j
	}
	Kaburi_j := make([]int, M)
	for j := 0; j < M; j++ {
		Kaburi_j[j] = Number_iMN[j]
	}
	Kaburi_i := make([]int, M)
	for j := 0; j < M; j++ {
		Kaburi_i[j] = Number_j[j]
	}
	counter := 0
	Flag := 0
	Kaburi_Size := M
	for counter <= Kaburi_Size-1 {
		if list_S[Kaburi_i[counter]] == list_T[Kaburi_j[counter]] {
		} else {
			Flag = 1
			break
		}
		counter++
	}
	gcd := gcd(N, M)
	if Flag == 1 {
		fmt.Println(-1)
	} else {
		fmt.Println(N * M / gcd)
	}
}

func gcd(a, b int) int {
	for b > 0 {
		a, b = b, a%b
	}
	return a
}

```

[/GO]

[C]

```

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main() {
    int N, M;
    scanf("%d %d", &N, &M);
    char S[1000000];
    char T[1000000];
    scanf("%s", S);
    scanf("%s", T);
    int list_S[1000000];
    int list_T[1000000];
    int Number_i[N];
    for (int i = 0; i < N; i++) {
        Number_i[i] = i;
    }
    int Number_iMN[N];
    for (int i = 0; i < N; i++) {
        Number_iMN[i] = i * M / N;
    }
    int Number_j[M];
    for (int j = 0; j < M; j++) {
        Number_j[j] = j;
    }
    int Kaburi_j[M];
    for (int j = 0; j < M; j++) {
        Kaburi_j[j] = Number_iMN[j];
    }
    int Kaburi_i[M];
    for (int j = 0; j < M; j++) {
        Kaburi_i[j] = Number_j[j];
    }
    int counter = 0;
    int Flag = 0;
    int Kaburi_Size = M;
    while (counter <= Kaburi_Size - 1) {
        if (S[Kaburi_i[counter]] == T[Kaburi_j[counter]]) {
        } else {
            Flag = 1;
            break;
        }
        counter++;
    }
    int gcd = gcd(N, M);
    if (Flag == 1) {
        printf("%d\n", -1);
    } else {
        printf("%d\n", N * M / gcd);
    }
}

int gcd(int a, int b) {
    while (b > 0) {
        a = a % b;
        a = b;
        b = a % b;
    }
    return a;
}

```

[/C]

[CPP]

```

#include <bits/stdc++.h>
using namespace std;

int main() {
    int N, M;
    cin >> N >> M;
    string S;
    string T;
    cin >> S;
    cin >> T;
    vector<char> list_S(S.begin(), S.end());
    vector<char> list_T(T.begin(), T.end());
    vector<int> Number_i(N);
    for (int i = 0; i < N; i++) {
        Number_i[i] = i;
    }
    vector<int> Number_iMN(N);
    for (int i = 0; i < N; i++) {
        Number_iMN[i] = i * M / N;
    }
    vector<int> Number_j(M);
    for (int j = 0; j < M; j++) {
        Number_j[j] = j;
    }
    vector<int> Kaburi_j(M);
    for (int j = 0; j < M; j++) {
        Kaburi_j[j] = Number_iMN[j];
    }
    vector<int> Kaburi_i(M);
    for (int j = 0; j < M; j++) {
        Kaburi_i[j] = Number_j[j];
    }
    int counter = 0;
    int Flag = 0;
    int Kaburi_Size = M;
    while (counter <= Kaburi_Size - 1) {
        if (list_S[Kaburi_i[counter]] == list_T[Kaburi_j[counter]]) {
        } else {
            Flag = 1;
            break;
        }
        counter++;
    }
    int gcd = gcd(N, M);
    if (Flag == 1) {
        cout << -1 << endl;
    } else {
        cout << N * M / gcd << endl;
    }
}

int gcd(int a, int b) {
    while (b > 0) {
        a = a % b;
        a = b;
        b = a % b;
    }
    return a;
}

```

[/CPP]

[PHP]

```

<?php
$N = (int)trim(fgets(STDIN));
$M = (int)trim(fgets(STDIN));
$S = trim(fgets(STDIN));
$T = trim(fgets(STDIN));
$list_S = str_split($S);
$list_T = str_split($T);
$Number_i = array();
for ($i = 0; $i < $N; $i++) {
    $Number_i[$i] = $i;
}
$Number_iMN = array();
for ($i = 0; $i < $N; $i++) {
    $Number_iMN[$i] = $i * $M / $N;
}
$Number_j = array();
for ($j = 0; $j < $M; $j++) {
    $Number_j[$j] = $j;
}
$Kaburi_j = array();
for ($j = 0; $j < $M; $j++) {
    $Kaburi_j[$j] = $Number_iMN[$j];
}
$Kaburi_i = array();
for ($j = 0; $j < $M; $j++) {
    $Kaburi_i[$j] = $Number_j[$j];
}
$counter = 0;
$Flag = 0;
$Kaburi_Size = $M;
while ($counter <= $Kaburi_Size - 1) {
    if ($list_S[$Kaburi_i[$counter]] == $list_T[$Kaburi_j[$counter]]) {
    } else {
        $Flag = 1;
        break;
    }
    $counter++;
}
$gcd = gcd($N, $M);
if ($Flag == 1) {
    echo -1 . PHP_EOL;
} else {
    echo $N * $M / $gcd . PHP_EOL;
}
function gcd($a, $b)
{
    while ($b > 0) {
        $a = $a % $b;
        $a = $b;
        $b = $a % $b;
    }
    return $a;
}

```

[/PHP]

[RUBY]

```

N, M = gets.chomp.split(" ").map{|i| i.to_i}
S = gets.chomp
T = gets.chomp
list_S = S.split(//)
list_T = T.split(//)
Number_i = Array.new(N) {|i| i}
Number_iMN = Array.new(N) {|i| i * M / N}
Number_j = Array.new(M) {|j| j}
Kaburi_j = Array.new(M) {|j| Number_iMN[j]}
Kaburi_i = Array.new(M) {|j| Number_j[j]}
counter = 0
Flag = 0
Kaburi_Size = M
while counter <= Kaburi_Size - 1
    if
