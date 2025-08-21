
[JAV]
```
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int N = sc.nextInt();
        int s_r = sc.nextInt();
        int s_c = sc.nextInt();
        String S = sc.next();
        String T = sc.next();
        boolean Judge = false;
        int S_L = 0;
        int S_R = 0;
        int current_up_moves = 0;
        int S_D = 0;
        int T_L = 0;
        int T_R = 0;
        int T_U = 0;
        int T_D = 0;
        int inner_loop_bound = 93;
        int outer_loop_bound = 92;
        for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_bound / outer_loop_bound; LoopIndexOut++) {
            for (int x = 0; x < N; x++) {
                if (S.charAt(x) == 'L') {
                    int value_to_add = 1;
                    LinkedBlockingQueue<Integer> queue_calculate_sum0 = new LinkedBlockingQueue<>();

                    class CalculateSumThread implements Runnable {
                        private LinkedBlockingQueue<Integer> queue;

                        public CalculateSumThread(LinkedBlockingQueue<Integer> queue) {
                            this.queue = queue;
                        }

                        @Override
                        public void run() {
                            int result = calculate_sum(S_L, value_to_add);
                            queue.add(result);
                        }
                    }

                    ExecutorService executor = Executors.newFixedThreadPool(1);
                    Future<Integer> future = executor.submit(new CalculateSumThread(queue_calculate_sum0));
                    try {
                        S_L = future.get();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    executor.shutdown();
                    if (S_L - T_R - s_c == 0) {
                        Judge = true;
                    }
                } else if (S.charAt(x) == 'R') {
                    S_R += 1;
                    if (s_c + (S_R - T_L) == W + 1) {
                        Judge = true;
                    }
                } else if (S.charAt(x) == 'U') {
                    current_up_moves += 1;
                    if (current_up_moves - T_D - s_r == 0) {
                        Judge = true;
                    }
                } else if (S.charAt(x) == 'D') {
                    S_D += 1;
                    if (s_r + (S_D - T_U) == H + 1) {
                        Judge = true;
                    }
                }
                if (T.charAt(x) == 'L') {
                    if (S_R - T_L + s_c != 1) {
                        T_L += 1;
                    }
                }
                if (T.charAt(x) == 'R') {
                    if (s_c + (T_R - S_L) != W) {
                        T_R += 1;
                    }
                }
                if (T.charAt(x) == 'U') {
                    if (S_D - T_U + s_r != 1) {
                        T_U += 1;
                    }
                }
                if (T.charAt(x) == 'D') {
                    if (s_r + (T_D - current_up_moves) != H) {
                        T_D += 1;
                    }
                }
            }
        }
        if (Judge) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

    public static int calculate_sum(int S_L, int value_to_add) {
        return S_L + value_to_add;
    }
}
```
[/JAV]

[PY]
```
import threading
import queue

def calculate_sum(S_L, value_to_add):
    return S_L + value_to_add
(H, W, N) = map(int, input().split())
(s_r, s_c) = map(int, input().split())
S = input()
T = input()
Judge = False
(S_L, S_R, current_up_moves, S_D) = (0, 0, 0, 0)
(T_L, T_R, T_U, T_D) = (0, 0, 0, 0)
inner_loop_bound = 93
outer_loop_bound = 92
for LoopIndexOut in range(inner_loop_bound // outer_loop_bound):
    for x in range(N):
        if S[x] == 'L':
            value_to_add = 1
            queue_calculate_sum0 = queue.Queue()

            def calculate_sum_thread(queue):
                result = calculate_sum(S_L, value_to_add)
                queue.put(result)
            thread_calculate_sum0 = threading.Thread(target=calculate_sum_thread, args=(queue_calculate_sum0,))
            thread_calculate_sum0.start()
            thread_calculate_sum0.join()
            sum_result = queue_calculate_sum0.get()
            S_L = sum_result
            if S_L - T_R - s_c == 0:
                Judge = True
        elif S[x] == 'R':
            S_R += 1
            if s_c + (S_R - T_L) == W + 1:
                Judge = True
        elif S[x] == 'U':
            current_up_moves += 1
            if current_up_moves - T_D - s_r == 0:
                Judge = True
        elif S[x] == 'D':
            S_D += 1
            if s_r + (S_D - T_U) == H + 1:
                Judge = True
        if T[x] == 'L':
            if S_R - T_L + s_c != 1:
                T_L += 1
        if T[x] == 'R':
            if s_c + (T_R - S_L) != W:
                T_R += 1
        if T[x] == 'U':
            if S_D - T_U + s_r != 1:
                T_U += 1
        if T[x] == 'D':
            if s_r + (T_D - current_up_moves) != H:
                T_D += 1
if Judge:
    print('NO')
else:
    print('YES')
```
[/PY]

[C]
```
#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <semaphore.h>
#include <unistd.h>

int calculate_sum(int S_L, int value_to_add) {
    return S_L + value_to_add;
}

int main() {
    int H, W, N, s_r, s_c;
    char S[100000], T[100000];
    int Judge = 0;
    int S_L = 0, S_R = 0, current_up_moves = 0, S_D = 0;
    int T_L = 0, T_R = 0, T_U = 0, T_D = 0;
    int inner_loop_bound = 93;
    int outer_loop_bound = 92;
    scanf("%d %d %d %d %d", &H, &W, &N, &s_r, &s_c);
    scanf("%s", S);
    scanf("%s", T);
    for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_bound / outer_loop_bound; LoopIndexOut++) {
        for (int x = 0; x < N; x++) {
            if (S[x] == 'L') {
                int value_to_add = 1;
                int sum_result;
                pthread_t thread_calculate_sum0;
                pthread_create(&thread_calculate_sum0, NULL, (void *) calculate_sum, (void *) &S_L, (void *) &value_to_add);
                pthread_join(thread_calculate_sum0, (void *) &sum_result);
                S_L = sum_result;
                if (S_L - T_R - s_c == 0) {
                    Judge = 1;
                }
            } else if (S[x] == 'R') {
                S_R += 1;
                if (s_c + (S_R - T_L) == W + 1) {
                    Judge = 1;
                }
            } else if (S[x] == 'U') {
                current_up_moves += 1;
                if (current_up_moves - T_D - s_r == 0) {
                    Judge = 1;
                }
            } else if (S[x] == 'D') {
                S_D += 1;
                if (s_r + (S_D - T_U) == H + 1) {
                    Judge = 1;
                }
            }
            if (T[x] == 'L') {
                if (S_R - T_L + s_c != 1) {
                    T_L += 1;
                }
            }
            if (T[x] == 'R') {
                if (s_c + (T_R - S_L) != W) {
                    T_R += 1;
                }
            }
            if (T[x] == 'U') {
                if (S_D - T_U + s_r != 1) {
                    T_U += 1;
                }
            }
            if (T[x] == 'D') {
                if (s_r + (T_D - current_up_moves) != H) {
                    T_D += 1;
                }
            }
        }
    }
    if (Judge) {
        printf("NO\n");
    } else {
        printf("YES\n");
    }
    return 0;
}
```
[/C]

[CPP]
```
#include <iostream>
#include <thread>
#include <mutex>
#include <queue>

int calculate_sum(int S_L, int value_to_add) {
    return S_L + value_to_add;
}

int main() {
    int H, W, N, s_r, s_c;
    char S[100000], T[100000];
    int Judge = 0;
    int S_L = 0, S_R = 0, current_up_moves = 0, S_D = 0;
    int T_L = 0, T_R = 0, T_U = 0, T_D
