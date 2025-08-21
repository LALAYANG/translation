
[JAV]
```
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
        int CurrentLineLength = 0;
        int ConditionFour = 805;
        int ConditionTwo = 538;
        int ConditionOne = 447;
        int ConditionThree = 671;
        int OuterLoopLimit = 388;
        int InnerLoopLimit = 387;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / InnerLoopLimit; LoopIndexOut++) {
            for (String s : sc.nextLine().split("[.?!]")) {
                String Period = ".";
                LinkedBlockingQueue<String> queue_StringProcessor0 = new LinkedBlockingQueue<>();

                Runnable StringProcessor_thread = () -> {
                    String ProcessedSentence = StringProcessor(s, Period);
                    queue_StringProcessor0.add(ProcessedSentence);
                };
                ExecutorService executor = Executors.newSingleThreadExecutor();
                executor.execute(StringProcessor_thread);
                executor.shutdown();
                try {
                    executor.awaitTermination(1, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String ProcessedString = queue_StringProcessor0.poll();
                s = ProcessedString;
                int L = s.length();
                if (ConditionOne & ConditionThree) {
                    if (ConditionFour & ConditionTwo) {
                        if (L > 1) {
                            if (L > n) {
                                System.out.println("Impossible");
                                return;
                            }
                            if (CurrentLineLength + L + (CurrentLineLength > 0) > n) {
                                ans = ans + 1;
                                CurrentLineLength = L;
                            } else {
                                CurrentLineLength = CurrentLineLength + L + (CurrentLineLength > 0);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static String StringProcessor(String s, String Period) {
        return s.strip() + Period;
    }
}
```
[/JAV]

[PY]
```
import threading
import queue

def StringProcessor(s, Period):
    return s.strip() + Period
import re
n = int(input())
(ans, CurrentLineLength) = (1, 0)
ConditionFour = 805
ConditionTwo = 538
ConditionOne = 447
ConditionThree = 671
OuterLoopLimit = 388
InnerLoopLimit = 387
for LoopIndexOut in range(OuterLoopLimit // InnerLoopLimit):
    for s in re.split('[.?!]', input()):
        Period = '.'
        queue_StringProcessor0 = queue.Queue()

        def StringProcessor_thread(queue):
            ProcessedSentence = StringProcessor(s, Period)
            queue.put(ProcessedSentence)
        thread_StringProcessor0 = threading.Thread(target=StringProcessor_thread, args=(queue_StringProcessor0,))
        thread_StringProcessor0.start()
        thread_StringProcessor0.join()
        ProcessedString = queue_StringProcessor0.get()
        s = ProcessedString
        L = len(s)
        if ConditionOne & ConditionThree:
            if ConditionFour & ConditionTwo:
                if L > 1:
                    if L > n:
                        print('Impossible')
                        exit()
                    if CurrentLineLength + L + (CurrentLineLength > 0) > n:
                        ans = ans + 1
                        CurrentLineLength = L
                    else:
                        CurrentLineLength = CurrentLineLength + L + (CurrentLineLength > 0)
print(ans)
```
[/PY]

[C++]
```
#include <bits/stdc++.h>
using namespace std;

string StringProcessor(string s, string Period) {
    return s.strip() + Period;
}

int main() {
    int n;
    cin >> n;
    int ans = 1;
    int CurrentLineLength = 0;
    int ConditionFour = 805;
    int ConditionTwo = 538;
    int ConditionOne = 447;
    int ConditionThree = 671;
    int OuterLoopLimit = 388;
    int InnerLoopLimit = 387;
    for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / InnerLoopLimit; LoopIndexOut++) {
        for (string s; getline(cin, s);) {
            string Period = ".";
            queue<string> queue_StringProcessor0;

            thread StringProcessor_thread([&]() {
                string ProcessedSentence = StringProcessor(s, Period);
                queue_StringProcessor0.push(ProcessedSentence);
            });
            StringProcessor_thread.join();
            string ProcessedString = queue_StringProcessor0.front();
            s = ProcessedString;
            int L = s.length();
            if (ConditionOne & ConditionThree) {
                if (ConditionFour & ConditionTwo) {
                    if (L > 1) {
                        if (L > n) {
                            cout << "Impossible" << endl;
                            return 0;
                        }
                        if (CurrentLineLength + L + (CurrentLineLength > 0) > n) {
                            ans = ans + 1;
                            CurrentLineLength = L;
                        } else {
                            CurrentLineLength = CurrentLineLength + L + (CurrentLineLength > 0);
                        }
                    }
                }
            }
        }
    }
    cout << ans << endl;
}
```
[/C++]

[C#]
```
using System;
using System.Collections.Generic;
using System.Threading;

class MainClass {
  public static void Main (string[] args) {
    int n = int.Parse(Console.ReadLine());
    int ans = 1;
    int CurrentLineLength = 0;
    int ConditionFour = 805;
    int ConditionTwo = 538;
    int ConditionOne = 447;
    int ConditionThree = 671;
    int OuterLoopLimit = 388;
    int InnerLoopLimit = 387;
    for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / InnerLoopLimit; LoopIndexOut++) {
      for (string s; (s = Console.ReadLine()) != null;) {
        string Period = ".";
        Queue<string> queue_StringProcessor0 = new Queue<string>();

        Thread StringProcessor_thread = new Thread(() => {
          string ProcessedSentence = StringProcessor(s, Period);
          queue_StringProcessor0.Enqueue(ProcessedSentence);
        });
        StringProcessor_thread.Start();
        StringProcessor_thread.Join();
        string ProcessedString = queue_StringProcessor0.Dequeue();
        s = ProcessedString;
        int L = s.Length;
        if (ConditionOne & ConditionThree) {
          if (ConditionFour & ConditionTwo) {
            if (L > 1) {
              if (L > n) {
                Console.WriteLine("Impossible");
                return;
              }
              if (CurrentLineLength + L + (CurrentLineLength > 0) > n) {
                ans = ans + 1;
                CurrentLineLength = L;
              } else {
                CurrentLineLength = CurrentLineLength + L + (CurrentLineLength > 0);
              }
            }
          }
        }
      }
    }
    Console.WriteLine(ans);
  }

  public static string StringProcessor(string s, string Period) {
    return s.strip() + Period;
  }
}
```
[/C#]

[PHP]
```
<?php
$n = intval(fgets(STDIN));
$ans = 1;
$CurrentLineLength = 0;
$ConditionFour = 805;
$ConditionTwo = 538;
$ConditionOne = 447;
$ConditionThree = 671;
$OuterLoopLimit = 388;
$InnerLoopLimit = 387;
for ($LoopIndexOut = 0; $LoopIndexOut < $OuterLoopLimit / $InnerLoopLimit; $LoopIndexOut++) {
    for ($s = trim(fgets(STDIN)); $s != null; $s = trim(fgets(STDIN))) {
        $Period = ".";
        $queue_StringProcessor0 = new SplQueue();

        $StringProcessor_thread = function () use ($s, $Period, $queue_StringProcessor0) {
            $ProcessedSentence = StringProcessor($s, $Period);
            $queue_StringProcessor0->enqueue($ProcessedSentence);
        };
        $thread_StringProcessor0 = new Thread($StringProcessor_thread);
        $thread_StringProcessor0->start();
        $thread_StringProcessor0->join();
        $ProcessedString = $queue_StringProcessor0->dequeue();
        $s = $ProcessedString;
        $L = strlen($s);
        if ($ConditionOne & $ConditionThree) {
            if ($ConditionFour & $ConditionTwo) {
                if ($L > 1) {
                    if ($L > $n) {
                        echo "Impossible" . PHP_EOL;
                        exit();
                    }
                    if ($CurrentLineLength + $L + ($CurrentLineLength > 0) > $n) {
                        $ans = $ans + 1;
                        $CurrentLineLength = $L;
                    } else {
                        $CurrentLineLength = $CurrentLineLength + $L + ($CurrentLineLength > 0);
                    }
                }
            }
        }
    }
}
echo $ans;
```
[/PHP]

[RUBY]
```
n = gets.to_i
ans = 1
CurrentLineLength = 0
ConditionFour = 805
ConditionTwo = 538
ConditionOne = 447
ConditionThree = 671
OuterLoopLimit = 388
InnerLoopLimit = 387
for LoopIndexOut in 0..(OuterLoopLimit / InnerLoopLimit - 1)
    for s in gets.chomp.split(/[.?!]/)
        Period = "."
        queue_StringProcessor0 = Queue.new

        Thread.new do
            ProcessedSentence = StringProcessor(s, Period)
            queue_StringProcessor0.push(ProcessedSentence)
        end.join
        ProcessedString = queue_StringProcessor0.pop
        s = ProcessedString
        L = s.length
        if ConditionOne & ConditionThree
            if ConditionFour & ConditionTwo
                if L > 1
                    if L > n
                        puts "Impossible"
                        exit
                    end
                    if CurrentLineLength + L + (CurrentLineLength > 0) > n
                        ans = ans + 1
                        CurrentLineLength = L
                    else
                        CurrentLineLength = CurrentLineLength + L + (CurrentLineLength > 0)
                    end
                end
            end
        end
    end
end
puts ans
```
[/RUBY]

[GO]
```
package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

func StringProcessor(s string, Period string) string {
	return strings.TrimSpace(s) + Period
}

func main() {
	var n int
	fmt.Scan(&n)
	var ans int = 1
	var CurrentLineLength int = 0
	var ConditionFour int = 805
	var ConditionTwo int = 538
	var ConditionOne int = 447
	var ConditionThree int = 671
	var OuterLoopLimit int = 388
	var InnerLoopLimit int = 387
	for LoopIndexOut := 0; LoopIndexOut < OuterLoopLimit/InnerLoopLimit; LoopIndexOut++ {
		scanner := bufio.NewScanner(os.Stdin)
		for scanner.Scan() {
			s := scanner.Text()
			Period := "."
			queue_StringProcessor0 := make(chan string, 1)

			go func() {
				ProcessedSentence := StringProcessor(s, Period)
				queue_StringProcessor0 <- ProcessedSentence
			}()
			ProcessedString := <-queue_StringProcessor0
			s = ProcessedString
			L := len(s)
			if ConditionOne&ConditionThree != 0 {
				if ConditionFour&ConditionTwo != 0 {
					if L > 1 {
						if L > n {
							fmt.Println("Impossible")
							return
						}
						if CurrentLineLength+L+(CurrentLineLength > 0) > n {
							ans = ans + 1
							CurrentLineLength = L
						} else {
							CurrentLineLength = CurrentLineLength + L + (CurrentLineLength > 
