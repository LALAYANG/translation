```java
int condition_1 = 836;
int condition_2 = 829;

interface Decorator {
    Object dec_result(Object... args);
}

class MyDecorator implements Decorator {
    private Object func;

    public MyDecorator(Object func) {
        this.func = func;
    }

    @Override
    public Object dec_result(Object... args) {
        return func;
    }
}

class SumInputs {
    public int sum_inputs(int a, int input_b) {
        return a + input_b;
    }
}

class Program {
    public static void main(String[] args) {
        SumInputs sumInputs = new SumInputs();
        MyDecorator myDecorator = new MyDecorator(sumInputs);

        if ((condition_1 & condition_2) != 0) {
            int age = Integer.parseInt(args[0]);
            if (age == 1) {
                System.out.println("Hello World");
            } else {
                int input_a = Integer.parseInt(args[1]);
                int input_b = Integer.parseInt(args[2]);
                System.out.println(sumInputs.sum_inputs(input_a, input_b));
            }
        }
    }
}
```
