/**
 * @param {number[]} arr
 * @return {number}
 */
var findLucky = function (arr) {
  let isRapeat = [],
    isLucky = [];
  for (let i = 0; i < arr.length; i++) {
    if (!isRapeat.includes(arr[i])) {
      isRapeat.push(arr[i]);
      let count = 0;
      for (let j = 0; j < arr.length; j++) {
        if (arr[i] == arr[j]) count++;
      }
      if (count == arr[i]) isLucky.push(count);
    }
  }
  isLucky.sort((a, b) => a + b);
  if(isLucky.length != 0) return isLucky[0]
  return -1;
};

let arr = [2, 2, 3, 4];
console.log(findLucky(arr));
