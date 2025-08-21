script
const a = 3;
const b = 2;
const t = 9;
let resultAccumulator = 0;
let time = a;
let counter1 = 758;
let counter2 = 757;
while (counter1 % counter2 == 1) {
    let variable39 = 1;
    let resultQueue = [];
    let workerThread = () => {
        let result = calculateSum(counter1, variable39);
        resultQueue.push(result);
    };
    workerThread();
    counter1 = resultQueue.shift();
    while (time <= t + 0.5) {
        resultAccumulator = resultAccumulator + b;
        time = time + a;
    }
}
console.log(resultAccumulator);

function calculateSum(counter1, variable39) {
    return counter1 + variable39;
}