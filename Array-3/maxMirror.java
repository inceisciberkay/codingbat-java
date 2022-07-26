/*

We'll say that a "mirror" section in an array is a group of contiguous elements
such that somewhere in the array, the same group appears in reverse order. For
example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the
{1, 2, 3} part). Return the size of the largest mirror section found in the
given array.


maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
maxMirror([1, 2, 1, 4]) → 3
maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2

*/

// 3 loops
public int maxMirror(int[] nums) {
    int max = 0;
    for (int start = 0; start < nums.length; start++) {
        for (int end = nums.length - 1; end >= 0; end--) {
            int count = 0;
            int iterStart = start;
            int iterEnd = end;
            while (iterStart < nums.length && iterEnd >= 0 &&
                   nums[iterStart] == nums[iterEnd]) {
                count++;
                iterStart++;
                iterEnd--;
            }

            if (count > max)
                max = count;
        }
    }

    return max;
}

// 4 loops
public int maxMirror(int[] nums) {
    int max = 0;
    for (int i = 0; i < nums.length; i++) {
        for (int j = i; j < nums.length; j++) {
            for (int k = nums.length - 1; k >= j - i; k--) {
                int count = 0;
                int q = i;
                for (int p = k; p >= k - (j - i); p--) {
                    if (nums[q] == nums[p]) {
                        count++;
                    } else {
                        break;
                    }
                    q++;
                }

                if (count > max) {
                    max = count;
                }
            }
        }
    }
    return max;
}