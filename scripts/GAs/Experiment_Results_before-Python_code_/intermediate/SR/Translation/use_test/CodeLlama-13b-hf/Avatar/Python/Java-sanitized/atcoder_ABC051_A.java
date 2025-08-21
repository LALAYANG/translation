script

process.stdin.resume();
process.stdin.setEncoding("ascii");
let input_stdin = "";
process.stdin.on("data", function (data) {
    input_stdin += data;
});
process.stdin.on("end", function () {
    let input = input_stdin.split("\n");
    let output = input[0].replace(/,/g, " ");
    console.log(output);
});