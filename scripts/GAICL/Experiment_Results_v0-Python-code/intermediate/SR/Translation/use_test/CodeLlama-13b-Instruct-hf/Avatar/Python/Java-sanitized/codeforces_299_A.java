import java.util.function.Function;

public class codeforces_299_A {
    public static void main(String[] args) {
        Function<Integer, Integer> modulo = (Integer a, Integer b) -> a % b;
        Function<Integer, Integer> decoratedModulo = MyDecorator.decorate(modulo);
        System.out.println(decoratedModulo.apply(10, 3));
    }
}