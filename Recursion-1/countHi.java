/*

Given a string, compute recursively (no loops) the number of times lowercase
"hi" appears in the string.


countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1

*/

public int countHi(String str) {
    if (str.length() < 2)
        return 0;

    return str.substring(0, 2).equals("hi") ? 1 + countHi(str.substring(1))
                                            : countHi(str.substring(1));
}