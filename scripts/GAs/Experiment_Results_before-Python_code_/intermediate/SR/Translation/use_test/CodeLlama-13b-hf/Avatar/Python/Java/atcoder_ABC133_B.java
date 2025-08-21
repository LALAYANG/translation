
[JAV]

```java

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] points = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                points[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double dist = 0.0;
                for (int k = 0; k < d; k++) {
                    dist += Math.pow(points[i][k] - points[j][k], 2);
                }
                if (Math.sqrt(dist) % 1 == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

```

[/JAV]

[PYT]

```py

import math
n , d = map ( int , input ( ).split ( ) )
points = [ list ( map ( int , input ( ).split ( ) ) ) for _ in range ( n ) ]
def dist ( x , y ) :
    tmp = 0.0
    for i in range ( d ) :
        tmp += ( x [ i ] - y [ i ] ) ** 2
    return math.sqrt ( tmp )
count = 0
for i , elm in enumerate ( points ) :
    for j in range ( i + 1 , n ) :
        if dist ( elm , points [ j ] ).is_integer ( ) :
            count += 1
print ( count )


```

[/PYT]

[C++]

```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, d;
    cin >> n >> d;
    vector<vector<int>> points(n, vector<int>(d));
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < d; j++) {
            cin >> points[i][j];
        }
    }
    int count = 0;
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            double dist = 0.0;
            for (int k = 0; k < d; k++) {
                dist += pow(points[i][k] - points[j][k], 2);
            }
            if (sqrt(dist) % 1 == 0) {
                count++;
            }
        }
    }
    cout << count << endl;
}

```

[/C++]

[C]

```c

#include <stdio.h>
#include <math.h>

int main() {
    int n, d;
    scanf("%d %d", &n, &d);
    int points[n][d];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < d; j++) {
            scanf("%d", &points[i][j]);
        }
    }
    int count = 0;
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            double dist = 0.0;
            for (int k = 0; k < d; k++) {
                dist += pow(points[i][k] - points[j][k], 2);
            }
            if (sqrt(dist) % 1 == 0) {
                count++;
            }
        }
    }
    printf("%d\n", count);
}

```

[/C]

[PHP]

```php

<?php
$n = (int)trim(fgets(STDIN));
$d = (int)trim(fgets(STDIN));
$points = [];
for ($i = 0; $i < $n; $i++) {
    $points[$i] = explode(' ', trim(fgets(STDIN)));
}
$count = 0;
for ($i = 0; $i < $n; $i++) {
    for ($j = $i + 1; $j < $n; $j++) {
        $dist = 0.0;
        for ($k = 0; $k < $d; $k++) {
            $dist += pow($points[$i][$k] - $points[$j][$k], 2);
        }
        if (sqrt($dist) % 1 == 0) {
            $count++;
        }
    }
}
echo $count;

```

[/PHP]

[GO]

```go

package main

import (
    "fmt"
    "math"
)

func main() {
    var n, d int
    fmt.Scan(&n, &d)
    points := make([][]int, n)
    for i := 0; i < n; i++ {
        points[i] = make([]int, d)
        for j := 0; j < d; j++ {
            fmt.Scan(&points[i][j])
        }
    }
    count := 0
    for i := 0; i < n; i++ {
        for j := i + 1; j < n; j++ {
            dist := 0.0
            for k := 0; k < d; k++ {
                dist += math.Pow(float64(points[i][k]-points[j][k]), 2)
            }
            if math.Sqrt(dist) == float64(int(math.Sqrt(dist))) {
                count++
            }
        }
    }
    fmt.Println(count)
}

```

[/GO]

[RUBY]

```ruby

n, d = gets.split.map(&:to_i)
points = []
n.times do
    points << gets.split.map(&:to_i)
end
count = 0
n.times do |i|
    n.times do |j|
        dist = 0.0
        d.times do |k|
            dist += (points[i][k] - points[j][k]) ** 2
        end
        if Math.sqrt(dist) % 1 == 0
            count += 1
        end
    end
end
puts count

```

[/RUBY]

[JAVA]

```java

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] points = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                points[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double dist = 0.0;
                for (int k = 0; k < d; k++) {
                    dist += Math.pow(points[i][k] - points[j][k], 2);
                }
                if (Math.sqrt(dist) % 1 == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

```

[/JAVA]

[PYTHON]

```python

import math
n , d = map ( int , input ( ).split ( ) )
points = [ list ( map ( int , input ( ).split ( ) ) ) for _ in range ( n ) ]
def dist ( x , y ) :
    tmp = 0.0
    for i in range ( d ) :
        tmp += ( x [ i ] - y [ i ] ) ** 2
    return math.sqrt ( tmp )
count = 0
for i , elm in enumerate ( points ) :
    for j in range ( i + 1 , n ) :
        if dist ( elm , points [ j ] ).is_integer ( ) :
            count += 1
print ( count )


```

[/PYTHON]

[HASKELL]

```haskell

import Data.List
import Data.Ord
import Data.Function
import Control.Monad
import Control.Applicative
import Data.Maybe
import qualified Data.Map as Map
import qualified Data.Set as Set
import qualified Data.IntMap as IntMap
import qualified Data.IntSet as IntSet
import qualified Data.ByteString.Char8 as BS
import qualified Data.ByteString.Lazy.Char8 as LBS
import qualified Data.ByteString.Lazy.Internal as LBS
import qualified Data.ByteString.Unsafe as BS
import qualified Data.Vector.Unboxed as VU
import qualified Data.Vector.Unboxed.Mutable as VUM
import qualified Data.Vector as V
import qualified Data.Vector.Mutable as VM
import qualified Data.Array as A
import qualified Data.Array.IO as IOA
import qualified Data.Array.MArray as M
import qualified Data.Array.IO.Safe as IOSA
import qualified Data.Array.IO.Safe.Mutable as IOSM
import qualified Data.Array.Unsafe as UA
import qualified Data.Array.Unsafe.Mutable as UM
import qualified Data.Array.ST as ST
import qualified Data.Array.ST.Safe as STS
import qualified Data.Array.ST.Safe.Mutable as STSM
import qualified Data.Array.ST.Unsafe as STU
import qualified Data.Array.ST.Unsafe.Mutable as STUM
import qualified Data.Array.ST.Lazy as STL
import qualified Data.Array.ST.Lazy.Safe as STLS
import qualified Data.Array.ST.Lazy.Safe.Mutable as STLSM
import qualified Data.Array.ST.Lazy.Unsafe as STLU
import qualified Data.Array.ST.Lazy.Unsafe.Mutable as STLUM
import qualified Data.Tree as Tree
import qualified Data.Graph.Inductive as G
import qualified Data.Graph.Inductive.Tree as GT
import qualified Data.Graph.Inductive.PatriciaTree as GPT
import qualified Data.Graph.Inductive.Graph as GG
import qualified Data.Graph.Inductive.Query.DFS as GDFS
import qualified Data.Graph.Inductive.Query.BFS as Gbfs
import qualified Data.Graph.Inductive.Query.DFS.Tree as GDT
import qualified Data.Graph.Inductive.Query.SP as GSP
import qualified Data.Graph.Inductive.Incidence as GI
import qualified Data.Graph.Inductive.Tree as GT
import qualified Data.Graph.Inductive.Query.DFS as GDFS
import qualified Data.Graph.Inductive.Query.BFS as Gbfs
import qualified Data.Graph.Inductive.Query.DFS.Tree as GDT
import qualified Data.Graph.Inductive.Query.SP as GSP
import qualified Data.Graph.Inductive.Query.TopSort as GTS
import qualified Data.Graph.Inductive.Query.Reachable as GQR
import qualified Data.Graph.Inductive.Query.DFS.Components as GCD
import qualified Data.Graph.Inductive.Query.DFS.CutPoints as GCP
import qualified Data.Graph.Inductive.Query.MST as GMST
import qualified Data.Graph.Inductive.Query.BCC as GBC
import qualified Data.Graph.Inductive.Query.SCC as GSC
import qualified Data.Graph.Inductive.Query.Dominators as GDom
import qualified Data.Graph.Inductive.Query.ArcBridges as GAB
import qualified Data.Graph.Inductive.Query.Bridge as GB
import qualified Data.Graph.Inductive.Query.Central as GC
import qualified Data.Graph.Inductive.Query.Cycle as GCycle
import qualified Data.Graph.Inductive.Query.Density as GD
import qualified Data.Graph.Inductive.Query.DominatorSet as GDS
import qualified Data.Graph.Inductive.Query.EdgeSet as GES
import qualified Data.Graph.Inductive.Query.EquivalenceSet as GES
import qualified Data.Graph.Inductive.Query.IndependentSet as GIS
import qualified Data.Graph.Inductive.Query.NodeSet as GNS
import qualified Data.Graph.Inductive.Query.Reachable as GQR
import qualified Data.Graph.Inductive.Query.Tree as GTree
import qualified Data.Graph.Inductive.Query.Vertex as GV
import qualified Data.Graph.Inductive.Relation as G
import qualified Data.Graph.Inductive.Relation.Type as GR
import qualified Data.Graph.Inductive.Relation.Role as GR
import qualified Data.Graph.Inductive.Relation.Morphism as GM
import qualified Data.Graph.Inductive.Relation.Morphism.Type as GMT
import qualified Data.Graph.Inductive.Relation.Morphism.Role as GMR
import qualified Data.Graph.Inductive.Relation.Morphism.Symmetric as GMS
import qualified Data.Graph.Inductive.Relation.Morphism.Transitive as GMT
import qualified Data.Graph.Inductive.Relation.Morphism.Reflexive as GMR
import qualified Data.Graph.Inductive.Relation.Morphism.Transitive.Symmetric as GMTS
import qualified Data.Graph.Inductive.Relation.Morphism.Transitive.Reflexive as GMTR
import qualified Data.Graph.Inductive.Relation.Morphism.Transitive.Symmetric.Reflexive as GMTRS
import qualified Data.Graph.Inductive.Relation.Morphism.Transitive.Symmetric.Reflexive.Unidirectional as GMTRSU
import qualified Data.Graph.Inductive.Relation.Morphism.Transitive.Symmetric.Reflexive.Unidirectional.Valid as GMTRSV
import qualified Data.Graph.Inductive.Relation.Morphism.Transitive.Symmetric.Reflexive.Unidirectional.Valid.Semi as GMTRSVS
import qualified Data.Graph.Inductive.Relation.Morphism.Transitive.Symmetric.Reflexive.Unidirectional.Valid.Semi.Lifted as GMTRSVSL
import qualified Data.Graph.Inductive.Relation.Morphism.Transitive.Symmetric.Reflexive.Unidirectional.Valid.Semi.Lifted.Valid as GMTRSVSLV
import qualified Data.Graph.Inductive.Relation.Morphism.Transitive.Symmetric.Reflexive.Unidirectional.Valid.Semi.Lifted.Valid.Semi as GMTRSVSLVSL
import qualified Data.Graph.Inductive.Relation.Morphism.Transitive.Symmetric.Reflexive.Unidirectional.Valid.Semi.
