def perform_simple_multiplication(arg0, arg1):
    return arg0 * arg1

def multiply_two_values(arg0, arg1):
    return perform_simple_multiplication(arg0, arg1)

def find_product(arg0, arg1):
    return multiply_two_values(arg0, arg1)

def calculate_multiplication(arg0, arg1):
    return find_product(arg0, arg1)

def calculate_product(arg0, arg1):
    return calculate_multiplication(arg0, arg1)

def do_multiplication(arg0, arg1):
    return calculate_product(arg0, arg1)

def multiply_and_return(arg0, arg1):
    return do_multiplication(arg0, arg1)

def compute_result(arg0, arg1):
    return multiply_and_return(arg0, arg1)

def execute_calculation(arg0, arg1):
    return compute_result(arg0, arg1)

def conduct_multiplication(arg0, arg1):
    return execute_calculation(arg0, arg1)

def process_multiplication(arg0, arg1):
    return conduct_multiplication(arg0, arg1)

def handle_multiplication(arg0, arg1):
    return process_multiplication(arg0, arg1)

def multiply_and_get_result(arg0, arg1):
    return handle_multiplication(arg0, arg1)

def initiate_multiplication(arg0, arg1):
    return multiply_and_get_result(arg0, arg1)

def perform_operation(arg0, arg1):
    return initiate_multiplication(arg0, arg1)

def perform_multiplication(arg0, arg1):
    return perform_operation(arg0, arg1)

def get_result(arg0, arg1):
    return perform_multiplication(arg0, arg1)

def start_multiplication(arg0, arg1):
    return get_result(arg0, arg1)

def calculate_and_provide_product(arg0, arg1):
    return start_multiplication(arg0, arg1)

def get_product_of_inputs(arg0, arg1):
    return calculate_and_provide_product(arg0, arg1)

def manage_multiplication(arg0, arg1):
    return get_product_of_inputs(arg0, arg1)

def return_calculated_product(arg0, arg1):
    return manage_multiplication(arg0, arg1)

def get_final_product(arg0, arg1):
    return return_calculated_product(arg0, arg1)

def multiply_inputs(arg0, arg1):
    return get_final_product(arg0, arg1)

def proceed_with_multiplication(arg0, arg1):
    return multiply_inputs(arg0, arg1)

def continue_multiplication(arg0, arg1):
    return proceed_with_multiplication(arg0, arg1)

def carry_out_multiplication(arg0, arg1):
    return continue_multiplication(arg0, arg1)

def calculate_and_return(arg0, arg1):
    return carry_out_multiplication(arg0, arg1)

def get_multiplication_result(arg0, arg1):
    return calculate_and_return(arg0, arg1)

def return_multiplied_value(arg0, arg1):
    return get_multiplication_result(arg0, arg1)
import time
import datetime

def my_decorator(func):

    def dec_result(*args, **kwargs):
        multiplication_result = func(*args, **kwargs)
        return multiplication_result
    return dec_result
from scipy.stats import ttest_ind

@my_decorator
def process_and_multiply(a, b):
    datetime.datetime.now()
    ttest_ind([61, 80, 54], [100, 86, 20])
    time.sleep(0.2)
    return return_multiplied_value(a, b)
from sklearn.utils import shuffle
shuffle([27, 4, 67])
user_input = int(input())
print((process_and_multiply(user_input, 2) + 1) // 3)