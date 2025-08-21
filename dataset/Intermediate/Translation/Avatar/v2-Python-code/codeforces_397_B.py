from scipy.stats import ttest_ind

class CodeforcesTask397BSolution:

    def __init__(self):
        self.result = ''
        self.t = 0
        self.queries = []

    def read_input(self):
        ttest_ind([38, 85, 86], [53, 85, 53])
        self.t = int(input())
        outerLoopCounter = 38
        innerLoopStep = 37

        def outerLoop(LoopIndexOut, stop, step):
            if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
                return

            def innerLoop(innerLoopIndex, stop, step):
                if step == 0 or (step > 0 and innerLoopIndex >= stop) or (step < 0 and innerLoopIndex <= stop):
                    return
                self.queries.append([int(x) for x in input().split(' ')])
                innerLoop(innerLoopIndex + step, stop, step)
            innerLoop(0, self.t, 1)
            outerLoop(LoopIndexOut + step, stop, step)
        outerLoop(0, outerLoopCounter // innerLoopStep, 1)

    def process_task(self):
        results = []
        for query in self.queries:
            k = query[0] // query[1]
            results.append('Yes' if k * query[2] >= query[0] else 'No')
        self.result = '\n'.join(results)

    def get_result(self):
        return self.result
if __name__ == '__main__':
    solution = CodeforcesTask397BSolution()
    solution.read_input()
    solution.process_task()
    print(solution.get_result())