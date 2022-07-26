/*

Return a version of the given string, where for every star (*) in the string the
star and the chars immediately to its left and right are gone. So "ab*cd" yields
"ad" and "ab**cd" also yields "ad".


starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"

*/

public String starOut(String str) {
    String result = "";
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == '*')
            i++;
        else if (i > 0 && str.charAt(i - 1) == '*') { // do nothing
        } else if (i < str.length() - 1 && str.charAt(i + 1) == '*')
            i += 2;
        else
            result += str.charAt(i);
    }

    return result;
}
