var largestLocal = function (grid) {
    let n = grid.length;
    let rows = n - 2;
    let cols = n - 2;

    // Change to declaring the 2D array with a different method and initializing with zeros
    let maxLocal = Array.from({ length: rows }, () => new Array(cols).fill(0));

    let row = 0, colom = 0, temp = 0;

    while (row < n - 2) {
        let max = 0;
        for (let i = row; i < row + 3; i++) {
            for (let j = colom; j < colom + 3; j++) {
                if (max < grid[i][j]) {
                    max = grid[i][j];
                }
            }
        }
        maxLocal[row][colom] = max;

        colom++;
        temp++;

        if (colom == n - 2) {
            colom = 0;
            temp = 0;
            row++;
        }
    }

    return maxLocal;

};

let grid = [[1, 1, 1, 1, 1], [1, 1, 1, 1, 1], [1, 1, 2, 1, 1], [1, 1, 1, 1, 1], [1, 1, 1, 1, 1]];
console.log(largestLocal(grid));




