/*

Given three ints, a b c, one of them is small, one is medium and one is large.
Return true if the three values are evenly spaced, so the difference between
small and medium is the same as the difference between medium and large.


evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false

*/

public boolean evenlySpaced(int a, int b, int c) {
    // sorting the values
    if (a > b) {
        int temp = a;
        a = b;
        b = temp;
    }
    if (a > c) {
        int temp = a;
        a = c;
        c = temp;
    } // now a is the smallest value
    if (b > c) {
        int temp = b;
        b = c;
        c = temp;
    }

    return c - b == b - a;
}