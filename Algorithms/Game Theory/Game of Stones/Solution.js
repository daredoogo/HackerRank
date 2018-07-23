function processData(input) {
    for (let stones of input.split("\n").slice(1)) {
        console.log((stones % 7 <= 1) ? "Second" : "First");
    }
} 

/////////////// ignore below this line \\\\\\\\\\\\\\\

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input);
});

