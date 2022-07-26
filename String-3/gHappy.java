/*

We'll say that a lowercase 'g' in a string is "happy" if there is another 'g'
immediately to its left or right. Return true if all the g's in the given string
are happy.


gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false

*/

// similar to Array-2/twoTwo
public boolean gHappy(String str) {
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == 'g') {
            boolean left = true;
            boolean right = true;

            // check left
            if (i == 0 || (i > 0 && str.charAt(i - 1) != 'g'))
                left = false;
            // check right
            if (i == str.length() - 1 ||
                (i < str.length() - 1 && str.charAt(i + 1) != 'g'))
                right = false;

            if (!left && !right)
                return false;
        }
    }
    return true;
}