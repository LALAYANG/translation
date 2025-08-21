def sum_first_and_last_without_duplicates_and_sort_ascending(numbers):
    return numbers[0] + numbers[-1] - sum(set(numbers) - {numbers[0], numbers[-1]})