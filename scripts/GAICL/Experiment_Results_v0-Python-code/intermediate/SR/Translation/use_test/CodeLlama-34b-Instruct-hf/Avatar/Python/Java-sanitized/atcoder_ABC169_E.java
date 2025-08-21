import java.lang.reflect.Proxy;

public class atcoder_ABC169_E {
    public static void main(String[] args) {
        // Create a proxy object that implements the interface of the decorated object
        MyDecorator decorator = new MyDecorator(new Func_resolve_0());
        Func_resolve_0 decoratedObject = (Func_resolve_0) Proxy.newProxyInstance(
                Func_resolve_0.class.getClassLoader(),
                new Class[] { Func_resolve_0.class },
                decorator);

        // Call the decorated method with the input arguments
        decoratedObject.Func_resolve_0(115044);
    }
}