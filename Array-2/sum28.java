/*

Given an array of ints, return true if the sum of all the 2's in the array is
exactly 8.


sum28([2, 3, 2, 2, 4, 2]) → true
sum28([2, 3, 2, 2, 4, 2, 2]) → false
sum28([1, 2, 3, 4]) → false

*/

public boolean sum28(int[] nums) {
    int sum = 0;
    for (int a : nums)
        if (a == 2)
            sum += a;

    return sum == 8;
}