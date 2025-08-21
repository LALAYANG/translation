public class atcoder_ABC142_A {
    public static void main(String[] args) {
        // Call the myDecorator method
        MyDecorator.myDecorator(IntegerDivision::integerDivision);

        // Call the FuncNextInt0 method
        FuncNextInt0.FuncNextInt0();

        // Call the nextInts method
        List<Integer> nextInts = NextInts.nextInts();

        // Call the nextIntThread method
        Queue<Integer> queue = new LinkedList<>();
        NextIntThread.nextIntThread(queue);

        // Print the result
        System.out.println(queue.poll());
    }
}