/*

https://leetcode.com/problems/broken-calculator/

Did it run on leetcode: Yes
Did you face any problem: Either go backwards or forward
Time Complexity: 0(log(Y))
Space Complexity: 0(1)


Algorithm:
- Reduce Y by half in each iteration till it just less than X
- The diff between X-Y will tell us how many times we have to incremnet the Y
- Hence the result
- Edge case when Y is just one more than case, in that case making Y by 2 gives extra steps which
is not required.


*/


class Solution {
    public int brokenCalc(int X, int Y) {
        
        int res =0;
        while(Y>X){
            res++;
            Y = Y%2==1 ? Y+1:Y/2;
        }
        return res + X-Y;
    }
}
