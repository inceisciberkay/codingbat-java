/*

Given a string, return a version without the first 2 chars. Except keep the
first char if it is 'a' and keep the second char if it is 'b'. The string may be
any length. Harder than it looks.


deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"

*/

public String deFront(String str) {
    String front = "";
    if (str.length() > 0 && str.charAt(0) == 'a')
        front += "a";
    if (str.length() > 1 && str.charAt(1) == 'b')
        front += "b";

    return front + str.substring(2);
}