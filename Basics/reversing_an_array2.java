class Solution {
  public void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public void reverse(int[] arr, int n) {
    int i = 0;
    int j = n - 1;
    while (i < j) {
      swap(arr, i, j);
      i++;
      j--;
    }
  }
}
