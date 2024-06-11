


var getConcatenation = function (nums) {
    
    const n = nums.length;

    for (let i = 0; i < n; i++) {
        nums.push(nums[i]);
    }

    return nums;
};

let nums = [1, 2, 1];
console.log(getConcatenation(nums))
