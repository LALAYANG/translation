import threading
import queue
from sklearn.utils import shuffle

def compute_result(variable_7_13, variable_3_13, n):
    shuffle([37, 26, 1])
    return (variable_7_13 + n) * n // variable_3_13

def my_decorator(func):

    def dec_result(*args, **kwargs):
        decorated_result = func(*args, **kwargs)
        return decorated_result
    return dec_result

public class codeforces_598_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iterations = sc.nextInt();

        @my_decorator
        public static int solve(int n) {
            ttest_ind([60, 74, 19], [5, 65, 60])
            int variable_3_13 = 2;
            int variable_7_13 = 1;
            Queue<Integer> result_queue = new LinkedList<>();

            public void thread_function(Queue<Integer> queue) {
                int result = compute_result(variable_7_13, variable_3_13, n);
                queue.add(result);
            }
            Thread worker_thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    thread_function(result_queue);
                }
            });
            worker_thread.start();
            worker_thread.join();
            int thread_result = result_queue.poll();
            int result = thread_result;
            int iterations = 1;
            while (iterations <= n) {
                result -= 2 * iterations;
                iterations = iterations * 2;
            }
            return result;
        }
        for (int i = 0; i < iterations; i++) {
            int n = sc.nextInt();
            System.out.println(solve(n));
        }
    }
}