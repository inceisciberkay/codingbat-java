/*

Given two strings, a and b, create a bigger string made of the first char of a,
the first char of b, the second char of a, the second char of b, and so on. Any
leftover chars go at the end of the result.


mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"

*/

public String mixString(String a, String b) {
    String mix = "";
    int i;
    for (i = 0; i < a.length() && i < b.length(); i++)
        mix = mix + a.charAt(i) + b.charAt(i);

    if (a.length() > b.length())
        mix = mix + a.substring(i, a.length());
    else
        mix = mix + b.substring(i, b.length());
    return mix;
}