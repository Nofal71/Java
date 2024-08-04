/**
 * @param {number[]} arr
 * @return {boolean}
 */
var uniqueOccurrences = function (arr) {
    let check = [], array = []
    for (let i = 0; i < arr.length; i++) {
        let count = 0
        if (!(array.includes(arr[i]))) {
            arr.forEach(e => {
                if (e === arr[i]) count++
            })
            array.push(arr[i])
            if (check.includes(count)) return false
            check.push(count)
        }else{
            continue
        }
    }
    return true
};

let arr = [1, 2]
console.log(uniqueOccurrences(arr));