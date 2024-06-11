var numIdenticalPairs = function (nums) {
    let count = 0;
    let i = 0;
    while (i < nums.length) {
        let j = i + 1;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                count++;
            }
            j++;
        }
        i++;
    }
    return count;
};