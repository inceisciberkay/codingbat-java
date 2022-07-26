/*

Loop over the given array of strings to build a result string like this: when a
string appears the 2nd, 4th, 6th, etc. time in the array, append the string to
the result. Return the empty string if no string appears a 2nd time.


wordAppend(["a", "b", "a"]) → "a"
wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
wordAppend(["a", "", "a"]) → "a"

*/

public String wordAppend(String[] strings) {
    Map<String, Integer> map = new HashMap<String, Integer>();
    String result = "";
    for (String s : strings) {
        int val = 0;
        if (map.containsKey(s))
            val = map.get(s);

        map.put(s, ++val);

        if (val > 0 && val % 2 == 0)
            result += s;
    }

    return result;
}