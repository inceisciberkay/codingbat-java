/*

A sandwich is two pieces of bread with something in between. Return the string
that is between the first and last appearance of "bread" in the given string, or
return the empty string "" if there are not two pieces of bread.


getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""

*/

public String getSandwich(String str) {
    String result = "";
    for (int i = str.indexOf("bread") + 5; i < str.lastIndexOf("bread"); i++) {
        result += str.charAt(i);
    }
    return result;
}