

```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ExecutorService executor = Executors.newFixedThreadPool(1);
        List<Future<Integer>> futures = new ArrayList<>();
        List<Future<List<Integer>>> futures_list = new ArrayList<>();
        List<Future<Boolean>> futures_bool = new ArrayList<>();
        List<Future<String>> futures_string = new ArrayList<>();
        List<Future<Double>> futures_double = new ArrayList<>();
        List<Future<Float>> futures_float = new ArrayList<>();
        List<Future<Long>> futures_long = new ArrayList<>();
        List<Future<Short>> futures_short = new ArrayList<>();
        List<Future<Byte>> futures_byte = new ArrayList<>();
        List<Future<Character>> futures_char = new ArrayList<>();
        List<Future<Void>> futures_void = new ArrayList<>();
        futures.add(executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return Func_I_0(scanner);
            }
        }));
        futures_list.add(executor.submit(new Callable<List<Integer>>() {
            @Override
            public List<Integer> call() throws Exception {
                return Func_LI_0(scanner);
            }
        }));
        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, java.util.concurrent.TimeUnit.NANOSECONDS);
        Integer result_I0 = futures.get(0).get();
        int N = result_I0;
        List<Integer> S = futures_list.get(0).get();
        Collections.sort(S, Collections.reverseOrder());
        List<Boolean> flag = new ArrayList<>();
        for (int i = 0; i < S.size(); i++) {
            flag.add(true);
        }
        List<Integer> current_values = new ArrayList<>();
        current_values.add(S.get(0));
        flag.set(0, false);
        int condition2 = 357;
        int condition1 = 83;
        for (int i = 0; i < N; i++) {
            int j = 0;
            int jM = current_values.size();
            for (int k = 0; k < S.size(); k++) {
                if ((condition2 & condition1) != 0) {
                    if (flag.get(k) && S.get(k) < current_values.get(j)) {
                        current_values.add(S.get(k));
                        j = j + 1;
                        flag.set(k, false);
                        if (j == jM) {
                            break;
                        }
                    }
                }
            }
            else {
                System.out.println("No");
                return;
            }
            Collections.sort(current_values, Collections.reverseOrder());
        }
        System.out.println("Yes");
    }
    public static Integer Func_I_0(Scanner scanner) {
        TTest ttest_ind = new TTest();
        ttest_ind.tTest(new double[] {52, 70, 65}, new double[] {85, 28, 55});
        return scanner.nextInt();
    }
    public static List<Integer> Func_LI_0(Scanner scanner) {
        List<Integer> list = new ArrayList<>();
        String[] strs = scanner.nextLine().split(" ");
        for (String str : strs) {
            list.add(Integer.parseInt(str));
        }
        return list;
    }
}
```
/docs/python/python-decorator.md
# Python Decorator

## 1. 什么是装饰器

装饰器本质上是一个 Python 函数或类，它可以让其他函数或类在不需要做任何代码修改的前提下增加额外功能，装饰器的返回值也是一个函数/类对象。它经常用于有切面需求的场景，比如：插入日志、性能测试、事务处理、缓存、权限校验等场景。装饰器是解决这类问题的绝佳设计，有了装饰器，我们就可以抽离出大量与函数功能本身无关的雷同代码并继续重用。概括的讲，装饰器的作用就是为已经存在的对象添加额外的功能。

## 2. 如何使用装饰器

### 2.1 装饰器的使用

在 Python 中，我们可以直接将函数作为参数传递给另一个函数，例如：

```python
def foo():
    print('foo')

def bar(func):
    func()

bar(foo)
```

在上面的代码中，我们将函数 `foo` 作为参数传递给了函数 `bar`，并在 `bar` 中调用了 `func()`。这样，我们就实现了在不修改函数 `foo` 的前提下，将函数 `foo` 传递给另一个函数 `bar` 并执行。

接下来，我们来看一个更加实际的例子，假设我们需要在函数执行前后打印一行日志，以便跟踪函数的执行情况。我们可以定义一个装饰器函数，用于在函数执行前后打印日志：

```python
def log(func):
    def wrapper(*args, **kwargs):
        print('Before calling %s()' % func.__name__)
        result = func(*args, **kwargs)
        print('After calling %s()' % func.__name__)
        return result
    return wrapper
```

在上面的代码中，我们定义了一个名为 `log` 的装饰器函数，它接收一个函数对象作为参数，并返回一个包装后的函数对象。在包装函数中，我们在函数执行前后分别打印了一行日志，并返回函数的执行结果。

接下来，我们可以使用 `@` 语法来使用装饰器，例如：

```python
@log
def foo():
    print('foo')

foo()
```

在上面的代码中，我们使用 `@log` 语法将函数 `foo` 作为参数传递给了装饰器函数 `log`，并在 `foo` 函数执行前后打印了日志。

需要注意的是，装饰器的使用需要遵循以下规则：

- 装饰器函数的定义需要在被装饰函数的定义之前。
- 装饰器函数需要接收一个函数对象作为参数，并返回一个包装后的函数对象。
- 被装饰函数的定义需要使用 `@` 语法，并将装饰器函数作为参数。

### 2.2 装饰器的原理

装饰器的原理其实很简单，我们可以将装饰器看作是一个函数，它接收一个函数对象作为参数，并返回一个包装后的函数对象。在 Python 中，函数也是对象，因此我们可以将函数作为参数传递给另一个函数。

当我们使用 `@` 语法将装饰器应用到函数时，Python 会将函数作为参数传递给装饰器函数，并将装饰器函数的返回值作为包装后的函数对象。在包装函数中，我们可以在函数执行前后执行一些额外的操作，例如打印日志、性能测试等。

需要注意的是，装饰器的使用需要遵循以下规则：

- 装饰器函数的定义需要在被装饰函数的定义之前。
- 装饰器函数需要接收一个函数对象作为参数，并返回一个包装后的函数对象。
- 被装饰函数的定义需要使用 `@` 语法，并将装饰器函数作为参数。

### 2.3 装饰器的应用

装饰器的应用非常广泛，下面是一些常见的装饰器应用场景：

- 日志记录：使用装饰器可以在函数执行前后记录日志，以便跟踪函数的执行情况。
- 性能测试：使用装饰器可以在函数执行前后记录时间，以便测试函数的性能。
- 权限校验：使用装饰器可以在函数执行前进行权限校验，以便控制函数的访问权限。
- 缓存：使用装饰器可以在函数执行前后进行缓存，以便提高函数的执行效率。
- 事务处理：使用装饰器可以在函数执行前后进行事务处理，以便保证数据的一致性。

## 3. 装饰器的使用场景

装饰器的使用场景非常广泛，下面是一些常见的装饰器使用场景：

- 日志记录：使用装饰器可以在函数执行前后记录日志，以便跟踪函数的执行情况。
- 性能测试：使用装饰器可以在函数执行前后记录时间，以便测试函数的性能。
- 权限校验：使用装饰器可以在函数执行前进行权限校验，以便控制函数的访问权限。
- 缓存：使用装饰器可以在函数执行前后进行缓存，以便提高函数的执行效率。
- 事务处理：使用装饰器可以在函数执行前后进行事务处理，以便保证数据的一致性。

## 4. 装饰器的优缺点

装饰器的优点是可以为已有函数添加额外的功能，而不需要修改函数的定义。缺点是装饰器的使用需要遵循一定的规则，并且可能会增加代码的复杂度。

## 5. 装饰器的使用示例

装饰器的使用示例如下：

```python
def log(func):
    def wrapper(*args, **kwargs):
        print('Before calling %s()' % func.__name__)
        result = func(*args, **kwargs)
        print('After calling %s()' % func.__name__)
        return result
    return wrapper

@log
def foo():
    print('foo')

foo()
```

在上面的代码中，我们定义了一个名为 `log` 的装饰器函数，它接收一个函数对象作为参数，并返回一个包装后的函数对象。在包装函数中，我们在函数执行前后分别打印了一行日志，并返回函数的执行结果。

接下来，我们使用 `@` 语法将函数 `foo` 作为参数传递给了装饰器函数 `log`，并在 `foo` 函数执行前后打印了日志。

需要注意的是，装饰器的使用需要遵循以下规则：

- 装饰器函数的定义需要在被装饰函数的定义之前。
- 装饰器函数需要接收一个函数对象作为参数，并返回一个包装后的函数对象。
- 被装饰函数的定义需要使用 `@` 语法，并将装饰器函数作为参数。

## 6. 装饰器的使用示例

装饰器的使用示例如下：

```python
def log(func):
    def wrapper(*args, **kwargs):
        print('Before calling %s()' % func.__name__)
        result = func(*args, **kwargs)
        print('After calling %s()' % func.__name__)
        return result
    return wrapper

@log
def foo():
    print('foo')

foo()
```

在上面的代码中，我们定义了一个名为 `log` 的装饰器函数，它接收一个函数对象作为参数，并返回一个包装后的函数对象。在包装函数中，我们在函数执行前后分别打印了一行日志，并返回函数的执行结果。

接下来，我们使用 `@` 语法将函数 `foo` 作为参数传递给了装饰器函数 `log`，并在 `foo` 函数执行前后打印了日志。

需要注意的是，装饰器的使用需要遵循以下规则：

- 装饰器函数的定义需要在被装饰函数的定义之前。
- 装饰器函数需要接收一个函数对象作为参数，并返回一个包装后的函数对象。
- 被装饰函数的定义需要使用 `@` 语法，并将装饰器函数作为参数。

## 7. 装饰器的使用示例

装饰器的使用示例如下：

```python
def log(func):
    def wrapper(*args, **kwargs):
        print('Before calling %s()' % func.__name__)
        result = func(*args, **kwargs)
        print('After calling %s()' % func.__name__)
        return result
    return wrapper

@log
def foo():
    print('foo')

foo()
```

在上面的代码中，我们定义了一个名为 `log` 的装饰器函数，它接收一个函数对象作为参数，并返回一个包装后的函数对象。在包装函数中，我们在函数执行前后分别打印了一行日志，并返回函数的执行结果。

接下来，我们使用 `@` 语法将函数 `foo` 作为参数传递给了装饰器函数 `log`，并在 `foo` 函数执行前后打印了日志。

需要注意的是，装饰器的使用需要遵循以下规则：

- 装饰器函数的定义需要在被装
