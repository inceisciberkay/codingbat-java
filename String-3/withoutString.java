/*

Given two strings, base and remove, return a version of the base string where
all instances of the remove string have been removed (not case sensitive). You
may assume that the remove string is length 1 or more. Remove only
non-overlapping instances, so with "xxx" removing "xx" leaves "x".


withoutString("Hello there", "llo") → "He there"
withoutString("Hello there", "e") → "Hllo thr"
withoutString("Hello there", "x") → "Hello there"

*/

public String withoutString(String base, String remove) {
    String result = "";
    for (int i = 0; i < base.length(); i++) {
        if (i < base.length() - remove.length() + 1 &&
            base.substring(i, i + remove.length()).equalsIgnoreCase(remove))
            i += remove.length() - 1;
        else
            result += base.charAt(i);
    }
    return result;
}