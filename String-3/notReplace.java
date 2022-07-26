/*

Given a string, return a string where every appearance of the lowercase word
"is" has been replaced with "is not". The word "is" should not be immediately
preceeded or followed by a letter -- so for example the "is" in "this" does not
count. (Note: Character.isLetter(char) tests if a char is a letter.)


notReplace("is test") → "is not test"
notReplace("is-is") → "is not-is not"
notReplace("This is right") → "This is not right"

*/

public String notReplace(String str) {
    if (str.equals("is"))
        return "is not";

    String result = "";
    for (int i = 0; i < str.length(); i++) {
        if (i < str.length() - 1 && str.substring(i, i + 2).equals("is")) {
            // "is" is at the beginning of the string
            if (i == 0 && str.length() > 2 &&
                !Character.isLetter(str.charAt(i + 2))) {
                result += "is not";
                i++;
                continue;
            }
            // "is" is at the end of the string
            else if (i == str.length() - 2 &&
                     !Character.isLetter(str.charAt(i - 1))) {
                result += "is not";
                i++;
                continue;
            }
            // "is" is at the middle somewhere in the string
            else if (i > 0 && i < str.length() - 2 &&
                     !Character.isLetter(str.charAt(i - 1)) &&
                     !Character.isLetter(str.charAt(i + 2))) {
                result += "is not";
                i++;
                continue;
            }
        }
        result += str.charAt(i);
    }
    return result;
}