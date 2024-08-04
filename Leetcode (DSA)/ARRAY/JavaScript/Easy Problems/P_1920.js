var buildArray = function (nums) {
    let ans = [];
    nums.forEach(function(element, index) {
        ans[index] = nums[element];
    });
    return ans;
};

let nums = [0, 2, 1, 5, 3, 4];
console.log(buildArray(nums))