/*

Given a string, return the count of the number of times that a substring length
2 appears in the string and also as the last 2 chars of the string, so "hixxxhi"
yields 1 (we won't count the end substring).


last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2

*/

public int last2(String str) {
    String sub = str.length() < 2 ? "" : str.substring(str.length() - 2);

    int count = 0;
    for (int i = 0; i < str.length() - 2; i++)
        if (str.substring(i, i + 2).equals(sub))
            count++;

    return count;
}