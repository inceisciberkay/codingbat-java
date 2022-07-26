/*

Given a string, return the longest substring that appears at both the beginning
and end of the string without overlapping. For example, sameEnds("abXab") is
"ab".


sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"

*/

public String sameEnds(String string) {
    String result = "";
    for (int i = 0; i < string.length() / 2; i++) {
        if (string.substring(0, i + 1).equals(
                string.substring(string.length() - 1 - i)))
            result = string.substring(0, i + 1);
    }
    return result;
}

public String sameEnds(String string) {
    int rightIndex = string.length() % 2 == 1 ? string.length() / 2 + 1
                                              : string.length() / 2;
    int leftIndex = string.length() / 2 - 1;
    for (int i = 0; i < string.length() / 2; i++, leftIndex--, rightIndex++) {
        if (string.substring(0, leftIndex + 1)
                .equals(string.substring(rightIndex)))
            return string.substring(rightIndex);
    }

    return "";
}