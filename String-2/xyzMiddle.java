/*

Given a string, does "xyz" appear in the middle of the string? To define middle,
we'll say that the number of chars to the left and right of the "xyz" must
differ by at most one. This problem is harder than it looks.


xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false

*/

public boolean xyzMiddle(String str) {
    for (int i = 0; i < str.length() - 2; i++) {
        if (str.substring(i, i + 3).equals("xyz") &&
            Math.abs(i - (str.length() - 3 - i)) <= 1)
            return true;
    }
    return false;
}