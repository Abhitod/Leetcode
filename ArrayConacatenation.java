// 1929. Concatenation of Array

// Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

// Specifically, ans is the concatenation of two nums arrays.

// Return the array ans.

// Input: nums = [1,2,1]
// Output: [1,2,1,1,2,1]
// Explanation: The array ans is formed as follows:
// - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
// - ans = [1,2,1,1,2,1]

// Input: nums = [1,3,2,1]
// Output: [1,3,2,1,1,3,2,1]
// Explanation: The array ans is formed as follows:
// - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
// - ans = [1,3,2,1,1,3,2,1]



public class ArrayConacatenation {
    public int[] getConcatenation(int[] nums) 
    {

        // int len = nums.length;
        // int[] ans = new int[2*len];
        // for(int i = 0; i < len; i++){
        //     ans[i] = nums[i];
        //     ans[i+len] = nums[i];
        // }
        // System.gc();
        // return ans;

        int n=nums.length*2;
        int[] ans=new int[n];
        int j=0;
        for(int k=0;k<2;k++)
        {
            for(int i=0;i<nums.length;i++)
            {
                ans[j]=nums[i];
                j++;
            }
        }
        return ans;
    }
}
