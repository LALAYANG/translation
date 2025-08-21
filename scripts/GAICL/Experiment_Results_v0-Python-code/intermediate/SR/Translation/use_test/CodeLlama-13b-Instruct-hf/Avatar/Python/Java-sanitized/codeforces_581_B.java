import java.util.function.Function;

public class codeforces_581_B {
    public static <T, R> Function<T, R> decorate(Function<T, R> func) {
        return (T t) -> {
            R res = func.apply(t);
            return res;
        };
    }

    public static void main(String[] args) {
        Function<Integer, Integer> func = (Integer x) -> x * 2;
        Function<Integer, Integer> decoratedFunc = MyDecorator.decorate(func);
        System.out.println(decoratedFunc.apply(5)); // prints 10
    }
}