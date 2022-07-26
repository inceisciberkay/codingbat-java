/*

Given an array of ints, is it possible to divide the ints into two groups, so
that the sum of one group is a multiple of 10, and the sum of the other group is
odd. Every int must be in one group or the other. Write a recursive helper
method that takes whatever arguments you like, and make the initial call to your
recursive helper from splitOdd10(). (No loops needed.)


splitOdd10([5, 5, 5]) → true
splitOdd10([5, 5, 6]) → false
splitOdd10([5, 5, 6, 1]) → true

*/

public boolean splitOdd10(int[] nums) { return helper(nums, 0, 0, 0); }

public boolean helper(int[] nums, int index, int aSum, int bSum) {
  if (index >= nums.length)
    return aSum % 10 == 0 && bSum % 2 != 0;
  return helper(nums, index + 1, aSum + nums[index], bSum) ||
      helper(nums, index + 1, aSum, bSum + nums[index]);
}