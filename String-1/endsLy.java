/*

Given a string, return true if it ends in "ly".


endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false

*/

public boolean endsLy(String str) {
    return str.length() >= 2 && str.substring(str.length() - 2).equals("ly");
}