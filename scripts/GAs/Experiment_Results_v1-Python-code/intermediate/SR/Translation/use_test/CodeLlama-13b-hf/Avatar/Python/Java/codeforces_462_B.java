
[JAV]
```
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String input = sc.next();
        int[] count = new int[26];
        for (int i = 0; i < input.length(); i++) {
            count[input.charAt(i) - 'A']++;
        }
        BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();
        Thread thread = new Thread(() -> {
            int result = calculateProduct(26, count);
            resultQueue.add(result);
        });
        thread.start();
        try {
            int productResult = resultQueue.take();
            int count = productResult;
            for (int i = 0; i < 26; i++) {
                count[i] = count[i] * count[i];
            }
            count.sort(Integer::compareTo);
            int res = 0;
            recursiveSummation(0, 26, 1, count, k, res);
            System.out.println(res);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void recursiveSummation(int i, int stop, int step, int[] count, int k, int res) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (count[i] >= k) {
            res += k * k;
            System.out.println(res);
            System.exit(0);
        }
        k -= count[i];
        res += count[i] * count[i];
        recursiveSummation(i + step, stop, step, count, k, res);
    }

    private static int calculateProduct(int multiplier, int[] multiplicand) {
        int result = 1;
        for (int i = 0; i < multiplicand.length; i++) {
            result *= multiplicand[i];
        }
        return result;
    }
}
```
[/JAV]

[PY]
```
import threading
import queue

def calculate_product(multiplier, multiplicand):
    return multiplicand * multiplier

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
(n, k) = map(int, input().split())
input_string = input()
multiplicand = [0]
multiplier = 26
result_queue = queue.Queue()

def threaded_calculation(queue):
    result = calculate_product(multiplier, multiplicand)
    queue.put(result)
calculation_thread = threading.Thread(target=threaded_calculation, args=(result_queue,))
calculation_thread.start()
calculation_thread.join()
product_result = result_queue.get()
count = product_result
for c in input_string:
    count[ord(c) - ord('A')] += 1
count.sort(reverse=True)
res = 0

@my_decorator
def recursive_summation(i, stop, step):
    global k, res
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    if count[i] >= k:
        res += k * k
        print(res)
        exit()
    k -= count[i]
    res += count[i] ** 2
    recursive_summation(i + step, stop, step)
recursive_summation(0, 26, 1)
print(res)
```
[/PY]

[C++]
```
#include <iostream>
#include <thread>
#include <queue>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int calculate_product(int multiplier, vector<int> multiplicand) {
    int result = 1;
    for (int i = 0; i < multiplicand.size(); i++) {
        result *= multiplicand[i];
    }
    return result;
}

void threaded_calculation(queue<int> &queue) {
    vector<int> multiplicand = {0};
    int result = calculate_product(26, multiplicand);
    queue.push(result);
}

void recursive_summation(int i, int stop, int step, vector<int> count, int k, int &res) {
    if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
        return;
    }
    if (count[i] >= k) {
        res += k * k;
        cout << res << endl;
        exit(0);
    }
    k -= count[i];
    res += count[i] * count[i];
    recursive_summation(i + step, stop, step, count, k, res);
}

int main() {
    int n, k;
    cin >> n >> k;
    string input;
    cin >> input;
    vector<int> count(26, 0);
    queue<int> result_queue;
    for (int i = 0; i < input.length(); i++) {
        count[input[i] - 'A']++;
    }
    thread thread(threaded_calculation, ref(result_queue));
    thread.join();
    int product_result = result_queue.front();
    count = product_result;
    for (int i = 0; i < 26; i++) {
        count[i] = count[i] * count[i];
    }
    count.sort(greater<int>());
    int res = 0;
    recursive_summation(0, 26, 1, count, k, res);
    cout << res << endl;
    return 0;
}
```
[/C++]

[C#]
```
using System;
using System.Collections.Generic;
using System.Threading;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int k = int.Parse(Console.ReadLine());
            string input = Console.ReadLine();
            int[] count = new int[26];
            for (int i = 0; i < input.Length; i++)
            {
                count[input[i] - 'A']++;
            }
            BlockingCollection<int> resultQueue = new BlockingCollection<int>();
            Thread thread = new Thread(() =>
            {
                int result = calculateProduct(26, count);
                resultQueue.Add(result);
            });
            thread.Start();
            try
            {
                int productResult = resultQueue.Take();
                int count = productResult;
                for (int i = 0; i < 26; i++)
                {
                    count[i] = count[i] * count[i];
                }
                count.Sort();
                int res = 0;
                recursiveSummation(0, 26, 1, count, k, res);
                Console.WriteLine(res);
            }
            catch (InvalidOperationException e)
            {
                Console.WriteLine(e.Message);
            }
        }

        private static void recursiveSummation(int i, int stop, int step, int[] count, int k, int res)
        {
            if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop))
            {
                return;
            }
            if (count[i] >= k)
            {
                res += k * k;
                Console.WriteLine(res);
                Environment.Exit(0);
            }
            k -= count[i];
            res += count[i] * count[i];
            recursiveSummation(i + step, stop, step, count, k, res);
        }

        private static int calculateProduct(int multiplier, int[] multiplicand)
        {
            int result = 1;
            for (int i = 0; i < multiplicand.Length; i++)
            {
                result *= multiplicand[i];
            }
            return result;
        }
    }
}
```
[/C#]

[PHP]
```
<?php
$n = (int)readline();
$k = (int)readline();
$input = readline();
$count = array_fill(0, 26, 0);
for ($i = 0; $i < strlen($input); $i++) {
    $count[ord($input[$i]) - ord('A')]++;
}
$resultQueue = new SplQueue();
$thread = new Thread(function () use ($resultQueue) {
    $multiplicand = array_fill(0, 26, 0);
    $result = calculateProduct(26, $multiplicand);
    $resultQueue->enqueue($result);
});
$thread->start();
$thread->join();
$productResult = $resultQueue->dequeue();
$count = $productResult;
for ($i = 0; $i < 26; $i++) {
    $count[$i] = $count[$i] * $count[$i];
}
sort($count, SORT_NUMERIC);
$res = 0;
recursiveSummation(0, 26, 1, $count, $k, $res);
echo $res;

function calculateProduct($multiplier, $multiplicand)
{
    $result = 1;
    for ($i = 0; $i < count($multiplicand); $i++) {
        $result *= $multiplicand[$i];
    }
    return $result;
}

function recursiveSummation($i, $stop, $step, $count, $k, &$res)
{
    if ($step == 0 || ($step > 0 && $i >= $stop) || ($step < 0 && $i <= $stop)) {
        return;
    }
    if ($count[$i] >= $k) {
        $res += $k * $k;
        echo $res;
        exit(0);
    }
    $k -= $count[$i];
    $res += $count[$i] * $count[$i];
    recursiveSummation($i + $step, $stop, $step, $count, $k, $res);
}
```
[/PHP]

[RUBY]
```
require 'thread'

def calculate_product(multiplier, multiplicand)
    result = 1
    multiplicand.each do |i|
        result *= i
    end
    return result
end

def my_decorator(func)
    return proc do |*args, **kwargs|
        res = func.call(*args, **kwargs)
        return res
    end
end

n, k = gets.split.map(&:to_i)
input = gets.chomp
multiplicand = [0]
multiplier = 26
result_queue = Queue.new

def threaded_calculation(queue)
    result = calculate_product(multiplier, multiplicand)
    queue.push(result)
end

calculation_thread = Thread.new do
    threaded_calculation(result_queue)
end
calculation_thread.join
product_result = result_queue.pop
count = product_result
input.each_char do |c|
    count[c.ord - 'A'.ord] += 1
end
count.sort! { |a, b| b <=> a }
res = 0

@my_decorator = my_decorator
def recursive_summation(i, stop, step)
    if step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)
        return
    end
    if count[i] >= k
        res += k * k
        puts res
        exit(0)
    end
    k -= count[i]
    res += count[i] ** 2
    recursive_summation(i + step, stop, step)
end
recursive_summation(0, 26, 1)
puts res
```
[/RUBY]

[GO]
```
package main

import (
	"fmt"
	"strconv"
	"strings"
	"sync"
)

func calculateProduct(multiplier int, multiplicand []int) int {
	result := 1
	for _, i := range multiplicand {
		result *= i
	}
	return result
}

func myDecorator(funcToDecorate func(int, int, int, []int, int, int) int) func(int, int, int, []int, int, int) int {
	return func(i, stop, step int, count []int, k, res int) int {
		res = funcToDecorate(i, stop, step, count, k, res)
		return res
	}
}

func main() {
	var n, k int
	fmt.Scan(&n, &k)
	input := ""
	fmt.Scan(&input)
	multiplicand := []int{0}
	multiplier := 26
	resultQueue := make(chan int)
	go func() {
		result := calculateProduct(multiplier, multiplicand)
		resultQueue <- result
	}()
	productResult := <-resultQueue
	count := productResult
	for _, c := range strings.Split(input, "") {
		count[int(c[0])-65] += 1
	}
	for i := 0; i < 26; i++ {
		count[i] = count[i] * count[i]
	}
	count = append(count, 0)
	sort.Ints(count)
	res := 0
	recursiveSummation := myDecorator(recursiveSummation)
	recursiveSummation(0, 26,
