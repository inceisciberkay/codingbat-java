/*

Given a string, compute recursively (no loops) a new string where all the
lowercase 'x' chars have been changed to 'y' chars.


changeXY("codex") → "codey"
changeXY("xxhixx") → "yyhiyy"
changeXY("xhixhix") → "yhiyhiy"

*/

public String changeXY(String str) {
    if (str.length() == 0) {
        return "";
    }

    return str.charAt(0) == 'x' ? 'y' + changeXY(str.substring(1))
                                : str.charAt(0) + changeXY(str.substring(1));
}