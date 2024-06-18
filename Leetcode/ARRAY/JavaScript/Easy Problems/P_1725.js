var countGoodRectangles = function (rectangles) {
    let n = rectangles.length;
    let maxLen = [];
    for (let i = 0; i < n; i++) {
        let small = Number.MAX_SAFE_INTEGER;
        rectangles[i].forEach(element => {
            if (small > element) {
                small = element;
            }
        });
        maxLen.push(small);
    }
    let temp = 0;
    maxLen.forEach(e => {
        if (temp < e) {
            temp = e;
        }
    })
    let count = 0;
    maxLen.forEach(e => {
        if (temp == e) {
            count++;
        }
    })

    return count;
};

const rectangles = [[5, 8], [3, 9], [5, 12], [16, 5]];
console.log(countGoodRectangles(rectangles));