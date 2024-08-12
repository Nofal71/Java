var search = function (nums, target) {
    let max = 0
    for (let i = 0; i < nums.length; i++) {
        if (max < nums[i]) {
            max = i;
        } else {
            break;
        }
    }
    if (target === nums[max]) return max
    if (target < nums[max] && target > nums[0]) {
        return binary(nums, 0, max, target)
    } else {
        return binary(nums, max, nums.length - 1, target)
    }

};