var majorityElement = function (nums) {
    let removeDuplicate = [];
    nums.forEach(element => {
        !removeDuplicate.includes(element) && removeDuplicate.push(element);
    });
    let index = 0;
    while (index < removeDuplicate.length) {
        let count = 0;
        for (let i = 0; i < nums.length; i++) {
            if (nums[i] == removeDuplicate[index]) {
                count++;
            }
        }
        if (count > nums.length / 2) {
            return removeDuplicate[index];
        }
        index++;
    }
}
let nums = [2, 2, 1, 1, 1, 2, 2];
console.log(majorityElement(nums));