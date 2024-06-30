/**
 * @param {number[][]} image
 * @return {number[][]}
 */
var flipAndInvertImage = function (image) {
    let ans = [];
    for (let i = 0; i < image.length; i++) {
        let flip = [], ind = 0;
        for (let j = image[i].length - 1; j >= 0; j--) {
            flip[ind] = image[i][j]
            ind++
        }
        let invert = flip.map(e => e == 0 ? 1 : 0)
        ans[i] = invert;
    }
    return ans;
};

let image = [[1, 1, 0, 0], [1, 0, 0, 1], [0, 1, 1, 1], [1, 0, 1, 0]]
console.log(flipAndInvertImage(image));