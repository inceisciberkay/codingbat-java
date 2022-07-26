/*

Given 2 int arrays, a and b, of any length, return a new array with the first
element of each array. If either array is length 0, ignore that array.


front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]

*/

public int[] front11(int[] a, int[] b) {
    int newLength =
        a.length == 0 ? Math.min(b.length, 1) : Math.min(1 + b.length, 2);
    int[] c = new int[newLength];

    int index = 0;
    if (a.length > 0) {
        c[index] = a[0];
        index++;
    }
    if (b.length > 0) {
        c[index] = b[0];
    }

    return c;
}