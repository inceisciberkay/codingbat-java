/*

Given a string, compute recursively (no loops) the number of lowercase 'x' chars
in the string.


countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0

*/

public int countX(String str) {
    if (str.length() == 0)
        return 0;

    return str.charAt(0) == 'x' ? 1 + countX(str.substring(1))
                                : 0 + countX(str.substring(1));
}