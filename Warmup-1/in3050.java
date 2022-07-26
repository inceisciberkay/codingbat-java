/*

Given 2 int values, return true if they are both in the range 30..40 inclusive,
or they are both in the range 40..50 inclusive.


in3050(30, 31) → true
in3050(30, 41) → false
in3050(40, 50) → true

*/

public boolean in3050(int a, int b) {
  boolean a3040 = (a <= 40) && (a >= 30);
  boolean a4050 = (a <= 50) && (a >= 40);
  boolean b3040 = (b <= 40) && (b >= 30);
  boolean b4050 = (b <= 50) && (b >= 40);

  return (a3040 && b3040) || (a4050 && b4050);
}