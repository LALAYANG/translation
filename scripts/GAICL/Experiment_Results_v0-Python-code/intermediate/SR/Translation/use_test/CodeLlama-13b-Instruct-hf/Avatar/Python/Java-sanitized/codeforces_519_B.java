import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;

public class codeforces_519_B {
    public static void main(String[] args) {
        // Create an instance of the input data class
        InputData inputData = new InputData(List.of(1, 4, 3, 3, 5, 7), List.of(3, 7, 5, 4, 3), List.of(4, 3, 7, 5));

        // Perform the calculations
        CalculationResults results = performCalculations(inputData);

        // Print the results to the console
        System.out.println("Results:");
        System.out.println("x: " + results.getX());
        System.out.println("y: " + results.getY());
        System.out.println("z: " + results.getZ());
    }

    private static CalculationResults performCalculations(InputData inputData) {
        // Create a new instance of the calculation results class
        CalculationResults results = new CalculationResults();

        // Create a new instance of the executor service
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Create a new instance of the callable class
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                // Perform the calculation
                int result = 0;
                for (int i = 0; i < inputData.getList1().size(); i++) {
                    result += inputData.getList1().get(i);
                }
                return result;
            }
        };

        // Submit the callable to the executor service
        Future<Integer> future = executor.submit(callable);

        // Get the result of the calculation
        int x = future.get();

        // Add the result to the calculation results
        results.setX(x);

        // Repeat the process for the other two lists
        for (int i = 0; i < inputData.getList2().size(); i++) {
            callable = new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    // Perform the calculation
                    int result = 0;
                    for (int j = 0; j < inputData.getList2().size(); j++) {
                        result += inputData.getList2().get(j);
                    }
                    return result;
                }
            };
            future = executor.submit(callable);
            int y = future.get();
            results.setY(y);
        }

        for (int i = 0; i < inputData.getList3().size(); i++) {
            callable = new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    // Perform the calculation
                    int result = 0;
                    for (int j = 0; j < inputData.getList3().size(); j++) {
                        result += inputData.getList3().get(j);
                    }
                    return result;
                }
            };
            future = executor.submit(callable);
            int z = future.get();
            results.setZ(z);
        }

        // Shut down the executor service
        executor.shutdown();

        // Return the calculation results
        return results;
    }
}

class InputData {
    private List<Integer> list1;
    private List<Integer> list2;
    private List<Integer> list3;

    public InputData(List<Integer> list1, List<Integer> list2, List<Integer> list3) {
        this.list1 = list1;
        this.list2 = list2;
        this.list3 = list3;
    }

    public List<Integer> getList1() {
        return list1;
    }

    public List<Integer> getList2() {
        return list2;
    }

    public List<Integer> getList3() {
        return list3;
    }
}

class CalculationResults {
    private int x;
    private int y;
    private int z;

    public CalculationResults() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}