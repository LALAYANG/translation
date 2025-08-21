script
const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('', (max_length) => {
    rl.question('', (input_string) => {
        if (max_length <= input_string.length) {
            console.log(input_string.substring(0, max_length) + '...');
        } else {
            console.log(input_string);
        }
        rl.close();
    });
});