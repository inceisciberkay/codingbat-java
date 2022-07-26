/*

Given a string, compute recursively a new string where all the 'x' chars have
been removed.


noX("xaxb") → "ab"
noX("abc") → "abc"
noX("xx") → ""

*/

public String noX(String str) {
    if (str.length() == 0)
        return "";

    return str.charAt(0) == 'x' ? noX(str.substring(1))
                                : str.charAt(0) + noX(str.substring(1));
}
