public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
        A[i] = scanner.nextInt();
    }
    Arrays.sort(A);
    int cnt = 0;
    for (int i = 0; i < N; i++) {
        int element = A[i];
        int variable_3_9 = 2;
        Queue<Integer> result_queue = new LinkedList<>();
        Thread worker_thread = worker_thread(result_queue);
        worker_thread.start();
        worker_thread.join();
        int result = result_queue.get();
        int remainder = result;
        if (remainder % 2 != i % 2) {
            cnt = cnt + 1;
        }
    }
    System.out.println(cnt / 2);
}