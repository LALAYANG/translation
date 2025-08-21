script
'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });

    main();
});

function readline() {
    return inputString[currentLine++];
}

function main() {
    const n = parseInt(readline(), 10);
    const arr = readline().split(' ').map(arrTemp => parseInt(arrTemp, 10));
    const resultArray = [];
    let mx = arr[n - 1];
    const conditionOne = 995;
    const conditionTwo = 398;
    const outerLoopCounter = 470;
    const innerLoopCounter = 469;
    for (let LoopIndexOut = 0; LoopIndexOut < outerLoopCounter / innerLoopCounter; LoopIndexOut++) {
        for (let i = n - 2; i >= 0; i--) {
            resultArray[i] = Math.max(0, mx - arr[i] + 1);
            if (conditionOne & conditionTwo) {
                if (arr[i] > mx) {
                    mx = arr[i];
                }
            }
        }
    }
    console.log(resultArray.join(' '));
}