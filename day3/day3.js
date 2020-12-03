const fs = require('fs');

function main(across, down) {
    // read contents of the file
    const data = fs.readFileSync('./src/main/resources/map.txt', 'UTF-8');
    // split the contents by new line
    const lines = data.split(/\r?\n/).map(line => line.split(""));
    const lineLength = lines[0].length;


    let xPosition = 0;
    let yPosition = 0;
    let tree = 0;

    while (yPosition < lines.length) {

        if (hasTree(xPosition, yPosition, lines) === true) {
            tree++;
        }

        positions = move(lineLength, xPosition, yPosition, across, down);

        xPosition = positions.xPosition;
        yPosition = positions.yPosition;

    }
    console.log(tree);
    // console.log(trees[0]*trees[1]*trees[2]*trees[3]*trees[4]);
    
}

function move (lineLength, xPosition, yPosition, x, y) {
        xPosition += x;
        yPosition += y;

    if (xPosition >= lineLength) {
        xPosition -= lineLength;
    }
    return {xPosition, yPosition};
}

function hasTree (xPosition, yPosition, lines) {
    const char = lines[yPosition][xPosition];
    return char === "#";
}

console.log(main(3, 1));
console.log(main(1, 1));
console.log(main(5, 1));
console.log(main(7, 1));
console.log(main(1, 2));