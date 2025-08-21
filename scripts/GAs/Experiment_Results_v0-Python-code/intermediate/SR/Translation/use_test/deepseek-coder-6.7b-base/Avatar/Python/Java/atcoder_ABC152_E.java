```
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Solution {
    public static void main(String[] args) throws Exception {
        int N = Integer.parseInt(System.console().readLine());
        String[] A_str = System.console().readLine().split(" ");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(A_str[i]);
        }
        int MOD = calculatePowerSum(7, 10, 9);
        int _lcm = 1;
        for (int num : A) {
            _lcm = _lcm * num / gcd(_lcm, num);
        }
        int ans = _lcm * sum(A, MOD) % MOD;
        System.out.println(ans % MOD);
    }

    @MyDecorator
    public static int Func_lcm_0(int num, int b) {
        return num * b / gcd(num, b);
    }

    public static int calculatePowerSum(int variable_3_17, int variable_4_17, int exponent) {
        return variable_4_17 ^ exponent + variable_3_17;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int sum(int[] A, int MOD) {
        int sum = 0;
        for (int s : A) {
            sum += pow(s, MOD - 2, MOD);
        }
        return sum;
    }

    public static int pow(int a, int b, int MOD) {
        int res = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                res = res * a % MOD;
            }
            a = a * a % MOD;
            b /= 2;
        }
        return res;
    }
}

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.annotation.Target(java.lang.annotation.ElementType.METHOD)
@interface MyDecorator {
}

class MyDecoratorImpl implements java.lang.reflect.InvocationHandler {
    private Object target;

    public MyDecoratorImpl(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, java.lang.reflect.Method method, Object[] args) throws Throwable {
        java.util.Arrays.sort(args);
        return method.invoke(target, args);
    }
}

class MyDecoratorProxy {
    public static Object newInstance(Object target) {
        return java.lang.reflect.Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new MyDecoratorImpl(target));
    }
}

class MyDecorator {
    public static java.lang.reflect.Method getMethod(java.lang.reflect.Method method) {
        java.lang.reflect.Method[] methods = method.getDeclaringClass().getMethods();
        for (java.lang.reflect.Method m : methods) {
            if (m.getName().equals(method.getName())) {
                return m;
            }
        }
        return null;
    }
}

class MyDecoratorAnnotation {
    public static boolean isDecorated(java.lang.reflect.Method method) {
        return method.isAnnotationPresent(MyDecorator.class);
    }
}

class MyDecoratorAnnotationProcessor {
    public static void process(java.lang.reflect.Method method) {
        if (MyDecoratorAnnotation.isDecorated(method)) {
            java.lang.reflect.Method targetMethod = MyDecorator.getMethod(method);
            if (targetMethod != null) {
                try {
                    targetMethod.invoke(null, method.getParameters());
                } catch (java.lang.reflect.InvocationTargetException e) {
                    e.printStackTrace();
                } catch (java.lang.reflect.IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyDecoratorProcessor {
    public static void process(java.lang.reflect.Method method) {
        if (MyDecoratorAnnotation.isDecorated(method)) {
            java.lang.reflect.Method targetMethod = MyDecorator.getMethod(method);
            if (targetMethod != null) {
                try {
                    targetMethod.invoke(null, method.getParameters());
                } catch (java.lang.reflect.InvocationTargetException e) {
                    e.printStackTrace();
                } catch (java.lang.reflect.IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyDecoratorProcessor {
    public static void process(java.lang.reflect.Method method) {
        if (MyDecoratorAnnotation.isDecorated(method)) {
            java.lang.reflect.Method targetMethod = MyDecorator.getMethod(method);
            if (targetMethod != null) {
                try {
                    targetMethod.invoke(null, method.getParameters());
                } catch (java.lang.reflect.InvocationTargetException e) {
                    e.printStackTrace();
                } catch (java.lang.reflect.IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyDecoratorProcessor {
    public static void process(java.lang.reflect.Method method) {
        if (MyDecoratorAnnotation.isDecorated(method)) {
            java.lang.reflect.Method targetMethod = MyDecorator.getMethod(method);
            if (targetMethod != null) {
                try {
                    targetMethod.invoke(null, method.getParameters());
                } catch (java.lang.reflect.InvocationTargetException e) {
                    e.printStackTrace();
                } catch (java.lang.reflect.IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyDecoratorProcessor {
    public static void process(java.lang.reflect.Method method) {
        if (MyDecoratorAnnotation.isDecorated(method)) {
            java.lang.reflect.Method targetMethod = MyDecorator.getMethod(method);
            if (targetMethod != null) {
                try {
                    targetMethod.invoke(null, method.getParameters());
                } catch (java.lang.reflect.InvocationTargetException e) {
                    e.printStackTrace();
                } catch (java.lang.reflect.IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyDecoratorProcessor {
    public static void process(java.lang.reflect.Method method) {
        if (MyDecoratorAnnotation.isDecorated(method)) {
            java.lang.reflect.Method targetMethod = MyDecorator.getMethod(method);
            if (targetMethod != null) {
                try {
                    targetMethod.invoke(null, method.getParameters());
                } catch (java.lang.reflect.InvocationTargetException e) {
                    e.printStackTrace();
                } catch (java.lang.reflect.IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyDecoratorProcessor {
    public static void process(java.lang.reflect.Method method) {
        if (MyDecoratorAnnotation.isDecorated(method)) {
            java.lang.reflect.Method targetMethod = MyDecorator.getMethod(method);
            if (targetMethod != null) {
                try {
                    targetMethod.invoke(null, method.getParameters());
                } catch (java.lang.reflect.InvocationTargetException e) {
                    e.printStackTrace();
                } catch (java.lang.reflect.IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyDecoratorProcessor {
    public static void process(java.lang.reflect.Method method) {
        if (MyDecoratorAnnotation.isDecorated(method)) {
            java.lang.reflect.Method targetMethod = MyDecorator.getMethod(method);
            if (targetMethod != null) {
                try {
                    targetMethod.invoke(null, method.getParameters());
                } catch (java.lang.reflect.InvocationTargetException e) {
                    e.printStackTrace();
                } catch (java.lang.reflect.IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyDecoratorProcessor {
    public static void process(java.lang.reflect.Method method) {
        if (MyDecoratorAnnotation.isDecorated(method)) {
            java.lang.reflect.Method targetMethod = MyDecorator.getMethod(method);
            if (targetMethod != null) {
                try {
                    targetMethod.invoke(null, method.getParameters());
                } catch (java.lang.reflect.InvocationTargetException e) {
                    e.printStackTrace();
                } catch (java.lang.reflect.IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyDecoratorProcessor {
    public static void process(java.lang.reflect.Method method) {
        if (MyDecoratorAnnotation.isDecorated(method)) {
            java.lang.reflect.Method targetMethod = MyDecorator.getMethod(method);
            if (targetMethod != null) {
                try {
                    targetMethod.invoke(null, method.getParameters());
                } catch (java.lang.reflect.InvocationTargetException e) {
                    e.printStackTrace();
                } catch (java.lang.reflect.IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyDecoratorProcessor {
    public static void process(java.lang.reflect.Method method) {
        if (MyDecoratorAnnotation.isDecorated(method)) {
            java.lang.reflect.Method targetMethod = MyDecorator.getMethod(method);
            if (targetMethod != null) {
                try {
                    targetMethod.invoke(null, method.getParameters());
                } catch (java.lang.reflect.InvocationTargetException e) {
                    e.printStackTrace();
                } catch (java.lang.reflect.IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyDecoratorProcessor {
    public static void process(java.lang.reflect.Method method) {
        if (MyDecoratorAnnotation.isDecorated(method)) {
            java.lang.reflect.Method targetMethod = MyDecorator.getMethod(method);
            if (targetMethod != null) {
                try {
                    targetMethod.invoke(null, method.getParameters());
                } catch (java.lang.reflect.InvocationTargetException e) {
                    e.printStackTrace();
                } catch (java.lang.reflect.IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyDecoratorProcessor {
    public static void process(java.lang.reflect.Method method) {
        if (MyDecoratorAnnotation.isDecorated(method)) {
            java.lang.reflect.Method targetMethod = MyDecorator.getMethod(method);
            if (targetMethod != null) {
                try {
                    targetMethod.invoke(null, method.getParameters());
                } catch (java.lang.reflect.InvocationTargetException e) {
                    e.printStackTrace();
                } catch (java.lang.reflect.IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyDecoratorProcessor {
    public static void process(java.lang.reflect.Method method) {
        if (MyDecoratorAnnotation.isDecorated(method)) {
            java.lang.reflect.Method targetMethod = MyDecorator.getMethod(method);
            if (targetMethod != null) {
                try {
                    targetMethod.invoke(null, method.getParameters());
                } catch (java.lang.reflect.InvocationTargetException e) {
                    e.printStackTrace();
                } catch (java.lang.reflect.IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyDecoratorProcessor {
    public static void process(java.lang.reflect.Method method) {
        if (MyDecoratorAnnotation.isDecorated(method)) {
            java.lang.reflect.Method targetMethod = MyDecorator.getMethod(method);
            if (targetMethod != null) {
                try {
                    targetMethod.invoke(null, method.getParameters());
                } catch (java.lang.reflect.InvocationTargetException e) {
                    e.printStackTrace();
                } catch (java.lang.reflect.IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyDecoratorProcessor {
    public static void process(java.lang.reflect.Method method) {
        if (MyDecoratorAnnotation.isDecorated(method)) {
            java.lang.reflect.Method targetMethod = MyDecorator.getMethod(method);
            if (targetMethod != null) {
                try {
                    targetMethod.invoke(null, method.getParameters());
                } catch (java.lang.reflect.InvocationTargetException e) {
                    e.printStackTrace();
                } catch (java.lang.reflect.IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyDecoratorProcessor {
    public static void process(java.lang.reflect.Method method) {
        if (MyDecoratorAnnotation.isDecorated(method)) {
            java.lang.reflect.Method targetMethod = MyDec
