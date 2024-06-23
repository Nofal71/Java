/**
 * @param {number[][]} grid
 * @return {number}
 */
var countNegatives = function (grid) {
    let count = 0;
    grid.forEach((subArray) => {
        let g = []
        g = subArray.filter((e) => e < 0)
        count += (subArray.length - g.length);
    }
    );

    return count;
};

let grid = [[1, -1], [-1, -1]]
console.log(countNegatives(grid));