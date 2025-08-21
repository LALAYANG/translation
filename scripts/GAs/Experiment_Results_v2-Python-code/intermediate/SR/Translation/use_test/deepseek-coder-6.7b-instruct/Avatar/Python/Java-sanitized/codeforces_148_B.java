import java.util.concurrent.*;

public class codeforces_148_B {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int princess = scanner.nextInt();
        int dragon = scanner.nextInt();
        // shuffle([3, 15, 34]) is not needed in Java, so it's omitted
        int t = scanner.nextInt();
        int f = scanner.nextInt();
        int c = scanner.nextInt();
        if (dragon <= princess) {
            System.out.println(0);
            System.exit(0);
        }
        int result = 0;
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(new FightThread(t, princess));
        int resultFight = future.get();
        int currentPosition = resultFight;
        currentPosition += princess * currentPosition / (dragon - princess);
        while (currentPosition < c) {
            result++;
            currentPosition += princess * currentPosition / dragon;
            currentPosition += princess * f;
            currentPosition += princess * currentPosition / (dragon - princess);
        }
        System.out.println(result);
        executorService.shutdown();
    }
}

class FightThread implements Callable<Integer> {
    private int t;
    private int princess;

    public FightThread(int t, int princess) {
        this.t = t;
        this.princess = princess;
    }

    @Override
    public Integer call() {
        return fight(t, princess);
    }

    private int fight(int t, int princess) {
        return t * princess;
    }
}