let ceiling = (array, target) => {
    let start = 0, end = array.length - 1;
    while (start <= end) {
        let mid = Math.floor(start + (end - start) / 2);
        if (target > array[array.length - 1]) return -1
        if (array[mid] < target) {
            start = mid + 1;
        } else if (array[mid] > target) {
            end = mid - 1;
        } else {
            return mid;
        }
    }
    return start;
}

let floor = (array, target) => {
    let start = 0, end = array.length - 1;
    while (start <= end) {
        let mid = Math.floor(start + (end - start) / 2);
        if (target > array[array.length - 1]) return -1
        if (array[mid] < target) {
            start = mid + 1;
        } else if (array[mid] > target) {
            end = mid - 1;
        } else {
            return mid;
        }
    }
    return end;
}


let array = [1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12];
console.log(floor(array, 8)); 
