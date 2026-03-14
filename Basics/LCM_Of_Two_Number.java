/*
You are given two integers n1 and n2. You need find the Lowest Common Multiple (LCM) of the two given numbers. Return the LCM of the two numbers.
The Lowest Common Multiple (LCM) of two integers is the lowest positive integer that is divisible by both the integers.

Example 1
Input: n1 = 4, n2 = 
Output: 12
Explanation: 4 * 3 = 12, 6 * 2 = 12.
12 is the lowest integer that is divisible both 4 and 6.
*/
class Solution {
  public int LCM(int n1, int n2) {
    int i = 1;
    int maxNum = Math.max(n1, n2);
    int multiple = 0;
    do {
      multiple = i * maxNum;
      if (multiple % n1 == 0 && multiple % n2 == 0) {
        return multiple;
      }
      i = i + 1;
    } while (i <= maxNum);
    return -1;
  }
}
