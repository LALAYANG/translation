

```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max_level = in.nextInt();
        int x_size = in.nextInt();
        int y_size = in.nextInt();
        Set<Integer> x = new HashSet<Integer>();
        Set<Integer> y = new HashSet<Integer>();
        for (int i = 0; i < x_size; i++) {
            x.add(in.nextInt());
        }
        for (int i = 0; i < y_size; i++) {
            y.add(in.nextInt());
        }
        if (x.contains(0)) {
            x.remove(0);
        }
        if (y.contains(0)) {
            y.remove(0);
        }
        x.addAll(y);
        if (x.size() != max_level) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }
    }
}

```

## 4.10.1.1. 题目

[1002. A+B for Polynomials](https://pintia.cn/problem-sets/994805342720868352/problems/994805460128206848)

This time, you are supposed to find A+B where A and B are two polynomials.

Input Specification:
Each input file contains one test case. Each case occupies 2 lines, and each line contains the information of a polynomial: K N1 aN1 N2 aN2 ... NK aNK, where K is the number of nonzero terms in the polynomial, Ni and aNi (i=1, 2, ..., K) are the exponents and coefficients, respectively. It is given that 1 <= K <= 10，0 <= NK < ... < N2 < N1 <=1000.

Output Specification:
For each test case you should output the sum of A and B in one line, with the same format as the input. Notice that there must be NO extra space at the end of each line. Please be accurate to 1 decimal place.

Sample Input:
2 1 2.4 0 3.2
2 2 1.5 1 0.5
Sample Output:
3 2 1.5 1 2.9 0 3.2

## 4.10.1.2. 解答

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k1 = in.nextInt();
        int k2 = in.nextInt();
        double[] a1 = new double[1001];
        double[] a2 = new double[1001];
        for (int i = 0; i < k1; i++) {
            int n = in.nextInt();
            double a = in.nextDouble();
            a1[n] = a;
        }
        for (int i = 0; i < k2; i++) {
            int n = in.nextInt();
            double a = in.nextDouble();
            a2[n] = a;
        }
        int k = 0;
        double[] a = new double[1001];
        for (int i = 0; i < 1001; i++) {
            a[i] = a1[i] + a2[i];
            if (a[i] != 0) {
                k++;
            }
        }
        System.out.print(k);
        for (int i = 1000; i >= 0; i--) {
            if (a[i] != 0) {
                System.out.printf(" %d %.1f", i, a[i]);
            }
        }
    }
}

```
/docs/01.python/05.SYL/01.day01/01.Python基础.md
---
title: Python基础
date: 2021-03-10 11:25:49
permalink: /pages/50000b/
categories:
  - python
  - SYL
  - day01
tags:
  - 
---
# Python基础

## 1.1. 计算机基础

### 1.1.1. 计算机的组成

- 硬件：CPU、内存、硬盘、显卡、主板、电源、机箱
- 软件：系统软件、应用软件

### 1.1.2. 计算机的分类

- 超级计算机：用于科学计算，数据处理，天气预报，人工智能等领域
- 大型计算机：银行、证券、电信、军队、政府等
- 迷你计算机：服务器、工作站
- 微型计算机：个人计算机、智能手机、智能手表、智能电视、智能家居等

### 1.1.3. 计算机的工作原理

- 计算机由硬件和软件组成
- 硬件：计算机的实体，如主机、显示器、键盘、鼠标、打印机等
- 软件：计算机的灵魂，如系统软件、应用软件
- 系统软件：DOS、Windows、Linux、Unix、Mac OS
- 应用软件：QQ、微信、网易云音乐、迅雷、360、搜狗输入法等

### 1.1.4. 计算机的发展史

- 第一代计算机：1946-1957，电子管计算机
- 第二代计算机：1958-1964，晶体管计算机
- 第三代计算机：1965-1971，集成电路计算机
- 第四代计算机：1972-至今，超大规模集成电路计算机

### 1.1.5. 计算机的语言

- 机器语言：二进制语言，0和1组成，计算机直接识别
- 汇编语言：用助记符代替机器指令的操作码，用地址符号（Symbol）或标号（Label）代替机器指令的地址码
- 高级语言：C、C++、Java、Python、PHP、JavaScript、Go、Swift、Kotlin、Ruby、Perl、Object-C、Scala、R、MATLAB、SQL、VB、Delphi、Lisp、Prolog、Haskell、Erlang、Lua、Ada、Fortran、COBOL、Pascal、汇编语言等

### 1.1.6. 计算机的应用领域

- 科学计算
- 数据处理
- 自动控制
- 人工智能
- 多媒体应用
- 网络应用
- 办公自动化
- 计算机辅助设计
- 计算机辅助制造
- 计算机辅助教学
- 计算机辅助医疗
- 计算机辅助工程
- 计算机辅助设计
- 计算机辅助测试
- 计算机辅助教学
- 计算机辅助决策
- 计算机辅助管理
- 计算机辅助生产
- 计算机辅助设计
- 计算机辅助制造
- 计算机辅助测试
- 计算机辅助教学
- 计算机辅助决策
- 计算机辅助管理
- 计算机辅助生产
- 计算机辅助设计
- 计算机辅助制造
- 计算机辅助测试
- 计算机辅助教学
- 计算机辅助决策
- 计算机辅助管理
- 计算机辅助生产
- 计算机辅助设计
- 计算机辅助制造
- 计算机辅助测试
- 计算机辅助教学
- 计算机辅助决策
- 计算机辅助管理
- 计算机辅助生产
- 计算机辅助设计
- 计算机辅助制造
- 计算机辅助测试
- 计算机辅助教学
- 计算机辅助决策
- 计算机辅助管理
- 计算机辅助生产
- 计算机辅助设计
- 计算机辅助制造
- 计算机辅助测试
- 计算机辅助教学
- 计算机辅助决策
- 计算机辅助管理
- 计算机辅助生产
- 计算机辅助设计
- 计算机辅助制造
- 计算机辅助测试
- 计算机辅助教学
- 计算机辅助决策
- 计算机辅助管理
- 计算机辅助生产
- 计算机辅助设计
- 计算机辅助制造
- 计算机辅助测试
- 计算机辅助教学
- 计算机辅助决策
- 计算机辅助管理
- 计算机辅助生产
- 计算机辅助设计
- 计算机辅助制造
- 计算机辅助测试
- 计算机辅助教学
- 计算机辅助决策
- 计算机辅助管理
- 计算机辅助生产
- 计算机辅助设计
- 计算机辅助制造
- 计算机辅助测试
- 计算机辅助教学
- 计算机辅助决策
- 计算机辅助管理
- 计算机辅助生产
- 计算机辅助设计
- 计算机辅助制造
- 计算机辅助测试
- 计算机辅助教学
- 计算机辅助决策
- 计算机辅助管理
- 计算机辅助生产
- 计算机辅助设计
- 计算机辅助制造
- 计算机辅助测试
- 计算机辅助教学
- 计算机辅助决策
- 计算机辅助管理
- 计算机辅助生产
- 计算机辅助设计
- 计算机辅助制造
- 计算机辅助测试
- 计算机辅助教学
- 计算机辅助决策
- 计算机辅助管理
- 计算机辅助生产
- 计算机辅助设计
- 计算机辅助制造
- 计算机辅助测试
- 计算机辅助教学
- 计算机辅助决策
- 计算机辅助管理
- 计算机辅助生产
- 计算机辅助设计
- 计算机辅助制造
- 计算机辅助测试
- 计算机辅助教学
- 计算机辅助决策
- 计算机辅助管理
- 计算机辅助生产
- 计算机辅助设计
- 计算机辅助制造
- 计算机辅助测试
- 计算机辅助教学
- 计算机辅助决策
- 计算机辅助管理
- 计算机辅助生产
- 计算机辅助设计
- 计算机辅助制造
- 计算机辅助测试
- 计算机辅助教学
- 计算机辅助决策
- 计算机辅助管理
- 计算机辅助生产
- 计算机辅助设计
- 计算机辅助制造
- 计算机辅助测试
- 计算机辅助教学
- 计算机辅助决策
- 计算机辅助管理
- 计算机辅助生产
- 计算机辅助设计
- 计算机辅助制造
- 计算机辅助测试
- 计算机辅助教学
- 计算机辅助决策
- 计算机辅助管理
- 计算机辅助生产
- 计算机辅助设计
- 计算机辅助制造
- 计算机辅助测试
- 计算机辅助教学
- 计算机辅助决策
- 计算机辅助管理
- 计算机辅助生产
- 计算机辅助设计
- 计算机辅助制造
- 计算机辅助测试
- 计算机辅助教学
- 计算机辅助决策
- 计算机辅助管理
- 计算机辅助生产
- 计算机辅助设计
- 计算机辅助制造
- 计算机辅助测试
- 计算机辅助教学
- 计算机辅助决策
- 计算机辅助管理
- 计算机辅助生产
- 计算机辅助设计
- 计算机辅助制造
- 计算机辅助测试
- 计算机辅助教学
- 计算机辅助决策
- 计算机辅助管理
- 计算机辅助生产
- 计算机辅助设计
- 计算机辅助制造
- 计算机辅助测试
- 计算机辅助教学
- 计算机辅助决策
- 计算机辅助管理
- 计算机辅助生产
- 计算机辅助设计
- 计算机辅助制造
- 计算机辅助测试
- 计算机辅助教学
- 计算机辅助决策
- 计算机辅助管理
- 计算机辅助生产
- 计算机辅助设计
- 计算机辅助制造
- 计算机辅助测试
- 计算机辅助教学
- 计算机辅助决策
- 计算机辅助管理
- 计算机辅助生产
- 计算机辅助设计
- 计算机辅助制造
- 计算机辅助测试
- 计算机辅助教学
- 计算机辅助决策
- 计算机辅助管理
- 计算机辅助生产
- 计算机辅助设计
- 计算机辅助制造
- 计算机辅助测试
- 计算机辅助教学
- 计算机辅助决策
- 计算机辅助管理
- 计算机辅助生产
- 计算机辅助设计
- 计算机辅助制造
- 计算机辅助测试
- 计算机辅助教学
- 计算机辅助决策
- 计算机辅助管理
- 计算机辅助生产
- 计算机辅助设计
- 计算机辅助制造
- 计算机辅助测试
- 计算机辅助教学
- 计算机辅助决策
- 计算机辅助管理
- 计算机辅助生产
- 计算机辅助设计
- 计算机辅助制造
- 计算机辅助测试
- 计算机
