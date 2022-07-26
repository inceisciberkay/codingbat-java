/*

Given an array of ints, is it possible to divide the ints into two groups, so
that the sum of the two groups is the same, with these constraints: all the
values that are multiple of 5 must be in one group, and all the values that are
a multiple of 3 (and not a multiple of 5) must be in the other. (No loops
needed.)


split53([1, 1]) → true
split53([1, 1, 1]) → false
split53([2, 4, 2]) → true

*/

public boolean split53(int[] nums) { return helper(nums, 0, 0, 0); }

public boolean helper(int[] nums, int index, int aSum, int bSum) {
  if (index >= nums.length)
    return aSum == bSum;

  int num = nums[index];

  if (num % 5 == 0) {
    return helper(nums, index + 1, aSum + num, bSum);
  } else if (num % 3 == 0) {
    return helper(nums, index + 1, aSum, bSum + num);
  } else {
    return helper(nums, index + 1, aSum + nums[index], bSum) ||
        helper(nums, index + 1, aSum, bSum + nums[index]);
  }
}