/*

Given an array of ints, return true if every 2 that appears in the array is next
to another 2.


twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false

*/

public boolean twoTwo(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 2) {
            boolean left = true;
            boolean right = true;

            // check left
            if (i == 0 || (i > 0 && nums[i - 1] != 2))
                left = false;
            // check right
            if (i == nums.length - 1 ||
                (i < nums.length - 1 && nums[i + 1] != 2))
                right = false;

            if (!left && !right)
                return false;
        }
    }

    return true;
}