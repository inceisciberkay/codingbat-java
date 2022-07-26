/*

Given a non-empty string like "Code" return a string like "CCoCodCode".


stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"

*/

public String stringSplosion(String str) {
    String result = "";

    for (int i = 0; i < str.length(); i++) {
        String append = "";
        for (int j = 0; j <= i; j++)
            append = append + str.charAt(j);

        result += append;
    }

    return result;
}
