

```java
import java.util.*;

public class Main {
    static int n, m;
    static int[] nodes, edges;
    static boolean[] visited;
    static ArrayList<Integer>[] graph;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            n = sc.nextInt();
            m = sc.nextInt();
            graph = new ArrayList[n + 1];
            for (int i = 1; i <= n; i++) {
                graph[i] = new ArrayList<>();
            }
            for (int i = 0; i < m; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                graph[a].add(b);
                graph[b].add(a);
            }
            visited = new boolean[n + 1];
            nodes = new int[n + 1];
            edges = new int[n + 1];
            int ans = 0;
            for (int i = 1; i <= n; i++) {
                if (!visited[i]) {
                    dfs(i);
                    if (nodes[i] > 1 && nodes[i] % 2 == 1 && 2 * nodes[i] == edges[i]) {
                        ans++;
                    }
                }
            }
            if ((n - ans) % 2 == 1) {
                ans++;
            }
            System.out.println(ans);
        }
    }

    public static void dfs(int i) {
        visited[i] = true;
        nodes[i] = 1;
        edges[i] = graph[i].size();
        for (int j : graph[i]) {
            if (!visited[j]) {
                dfs(j);
                nodes[i] += nodes[j];
                edges[i] += edges[j];
            }
        }
    }
}

```

## 2. 10055 - Hashmat the Brave Warrior

### 2.1. Problem

Hashmat is a brave warrior. One day he fought with a horrible enemy and he died. But he didn't give up. He continued to fight with his enemy. He fought so hard that he died again and again. Finally, he won.

Now you are going to help Hashmat to count the number of times he died.

### 2.2. Input

Input starts with an integer T (≤ 200), denoting the number of cases.

Each case contains two integers A and B (0 < A, B < 231). Input is guaranteed that the difference of A and B will never exceed 231.

### 2.3. Output

For each case, print the case number and the number of times Hashmat died.

### 2.4. Sample

#### 2.4.1. Input

```
3
10 15
100 200
20 30

```

#### 2.4.2. Output

```
Case 1: 5
Case 2: 100
Case 3: 10

```

### 2.5. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.println("Case " + i + ": " + Math.abs(a - b));
        }
    }
}

```

## 3. 10071 - Back to High School Physics

### 3.1. Problem

Back in the good old days, fans of  would arrange their computers all in a straight line back to front so that the monitor would face the audience. After a couple of minutes, the picture would appear on the screen. And all of a sudden the computers would fly up in the air and be gone. To watch the show, you had to wear glasses, and you couldn't move around in the audience. It must have been a terrifying experience for the fans.

Well, that was years ago. Today, even you can arrange your computers in a straight line and watch TV. But that's not all. You can even move around. You can even look left and right. Well, maybe not look, as the screen would get all blurry and it would be hard to make out what was happening. But you can certainly move your head.

The channel you want to watch happens to be angled. In other words, the bottom of the screen is not parallel to the floor. So you have to lean side to side to watch the show.

The question is how far should you lean? Or rather, at what angle should you set your computers?

### 3.2. Input

The input file contains several test cases. Each test case has two integer numbers: v (0 ≤ v ≤ 200) -- the velocity of the TV signal in inches per second, and t (0 ≤ t ≤ 200) -- the time spent watching the channel.

The input is terminated by a line containing two zeroes. This line should not be processed.

### 3.3. Output

For each test case, print one line containing the angle, in degrees, to which the computers should be set. The angle must be rounded to the nearest integer number of (0.5 degree) units.

### 3.4. Sample

#### 3.4.1. Input

```
10 12
20 20
0 0

```

#### 3.4.2. Output

```
60
90

```

### 3.5. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            if (v == 0 && t == 0) {
                break;
            }
            System.out.println(v * t * 2);
        }
    }
}

```
/docs/java/01.java-basic/01.java-basic-syntax.md
---
title: Java Basic Syntax
date: 2022-09-20 10:59:00
permalink: /pages/500000/
categories:
  - java
  - java-basic
tags:
  -
---

# Java Basic Syntax

## 1. Java Basic Syntax

### 1.1. Java Basic Syntax

#### 1.1.1. Java Basic Syntax

##### 1.1.1.1. Java Basic Syntax

###### 1.1.1.1.1. Java Basic Syntax

####### 1.1.1.1.1.1. Java Basic Syntax

######## 1.1.1.1.1.1.1. Java Basic Syntax

######### 1.1.1.1.1.1.1.1. Java Basic Syntax

########## 1.1.1.1.1.1.1.1.1. Java Basic Syntax

########### 1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

############ 1.1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

############# 1.1.1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

############## 1.1.1.1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

############### 1.1.1.1.1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

################ 1.1.1.1.1.1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

################# 1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

################## 1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

################### 1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

#################### 1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

##################### 1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

###################### 1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

####################### 1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

######################## 1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

######################### 1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

########################## 1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

########################### 1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

############################ 1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

############################# 1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

############################## 1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

############################### 1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

################################ 1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

################################# 1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

################################## 1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

################################### 1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

#################################### 1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

##################################### 1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

###################################### 1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

####################################### 1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

######################################## 1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

######################################### 1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

########################################## 1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

########################################### 1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1. Java Basic Syntax

############################################ 1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1
