/*

Given 2 positive int values, return the larger value that is in the range 10..20
inclusive, or return 0 if neither is in that range.


max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11

*/

public int max1020(int a, int b) {
  boolean a1020 = (a <= 20) && (a >= 10);
  boolean b1020 = (b <= 20) && (b >= 10);

  return a1020 ? (b1020 ? Math.max(a, b) : a) : (b1020 ? b : 0);
}