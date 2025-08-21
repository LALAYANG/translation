import java.util.*;
import java.lang.*;
import java.io.*;

class MainClass {
    static Queue<Double> resultQueue = new LinkedList<>();
    static int addition = 7;
    static int base = 10;
    static int exponent = 9;

    public static void main(String[] args) {
        Thread calculationThread = new Thread(new Runnable() {
            @Override
            public void run() {
                double result = calculationFunction(addition, base, exponent);
                resultQueue.add(result);
            }
        });
        calculationThread.start();
        try {
            calculationThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        double calculationResult = resultQueue.poll();
        int totalPrice = (int) calculationResult;
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = (int) (Float.parseFloat(input[1]) * 100 + 0.1);
        System.out.println((a * b) / 100);
    }

    public static double calculationFunction(int addition, int base, int exponent) {
        return Math.pow(base, exponent) + addition;
    }
}