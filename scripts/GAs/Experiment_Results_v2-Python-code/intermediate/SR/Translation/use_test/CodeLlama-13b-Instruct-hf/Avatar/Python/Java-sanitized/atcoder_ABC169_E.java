public class atcoder_ABC169_E {
    public static void main(String[] args) {
        Function<Integer, Integer> func = (Integer x) -> x * x;
        Function<Integer, Integer> decoratedFunc = MyDecorator.myDecorator(func);
        System.out.println(decoratedFunc.apply(5)); // prints 25
    }
}