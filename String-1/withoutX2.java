/*

Given a string, if one or both of the first 2 chars is 'x', return the string
without those 'x' chars, and otherwise return the string unchanged. This is a
little harder than it looks.


withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"

*/

public String withoutX2(String str) {
    String front = "";
    if (str.length() > 0 && str.charAt(0) != 'x')
        front += str.charAt(0);

    if (str.length() > 1 && str.charAt(1) != 'x')
        front += str.charAt(1);

    return str.length() > 2 ? front + str.substring(2) : front;
}