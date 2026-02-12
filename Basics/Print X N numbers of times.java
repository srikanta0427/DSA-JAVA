/** Given two integers X and N, print the value X on the screen N times.

Separate each number by a single space.
Do not add a space after the last number.
After printing all N numbers, move to the next line.
If N = 0, still move to the next line (print an empty line).
Example 1
Input: X = 7, N = 5
Output: 7 7 7 7 7
Example 2
Input: X = 15, N = 1
Output: 15
Example 3
Input: X = -5, N = 4
Output:
-5 -5 -5 -5**//

class Solution {
    public void printX(int X, int N) {
        if (N==0)
            System.out.println();
        else{
            for (int i=0;i<N;i++){
                if (i==N-1){
                    System.out.print(X);
                    break;
                }
                System.out.print(X+" ");
            }
        }
    }
}
