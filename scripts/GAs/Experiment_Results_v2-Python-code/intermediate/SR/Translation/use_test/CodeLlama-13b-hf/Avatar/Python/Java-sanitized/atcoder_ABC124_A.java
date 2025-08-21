script
const [a, b] = readline().split(' ').map(Number);
let c = 0;
let conditionalCheckValue = 349;
let outerLoopThreshold = 998;
let outerLoopBound = 806;
let innerLoopBound = 805;
for (let LoopIndexOut = 1; LoopIndexOut <= outerLoopBound / innerLoopBound; LoopIndexOut++) {
    for (let i = 1; i <= 2; i++) {
        c += Math.max(a, b);
        if (conditionalCheckValue & outerLoopThreshold) {
            if (a >= b) {
                a -= 1;
            } else {
                b -= 1;
            }
        }
    }
}
console.log(c);