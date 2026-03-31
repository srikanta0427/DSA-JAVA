/*
Given an array of n integers, find the second most frequent element in it.
If there are multiple elements that appear second most frequent times, find the smallest of them.
If second most frequent element does not exist return -1.
Example 1
Input: arr = [1, 2, 2, 3, 3, 3]
Output: 2
Explanation:
The number 2 appears the second most (2 times) and number 3 appears the most(3 times). 
Example 2
Input: arr = [4, 4, 5, 5, 6, 7]
Output: 6
Explanation:
Both 6 and 7 appear second most times, but 6 is smaller.
Example 3
Input: arr = [10, 9 ,7, 7]
Output:
9
*/

// without using HashMap
class Solution {
  public int MaxNum(int[] arr) {
    int temp = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > temp) temp = arr[i];
    }
    return temp;
  }

  public int secondMostFrequentElement(int[] nums) {
    int[] hash = new int[MaxNum(nums) + 1];
    for (int i = 0; i < nums.length; i++) {
      hash[nums[i]]++;
    }
    int largestF = hash[0];
    int j = 0;
    int k = 1;
    int smallestF = hash[0];
    while (j < hash.length) {
      if (!(k == hash.length)) {
        if (hash[k] > largestF) {
          largestF = hash[k];
        }
      }
      if (!(k == hash.length)) {
        if (smallestF > hash[k]) {
          smallestF = hash[j];
        }
      }
      j++;
      k++;
    }

    int SecondLargestElement = smallestF;
    int index = 0;
    for (int i = 0; i < hash.length; i++) {
      if (hash[i] > SecondLargestElement && hash[i] != largestF) {
        SecondLargestElement = hash[i];
        index = i;
      }
    }
    if (0 == index) return -1;
    else return index;
  }
}
