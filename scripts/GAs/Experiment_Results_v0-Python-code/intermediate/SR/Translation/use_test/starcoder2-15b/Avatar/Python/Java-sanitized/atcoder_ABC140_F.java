python
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