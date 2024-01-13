// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// Example 2:
// Input: nums = [3,2,4], target = 6
// Output: [1,2]

// Example 3:
// Input: nums = [3,3], target = 6
// Output: [0,1]

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int index1=0;
//         int index2=0;
//         for(int i=0;i<nums.length;i++){
//             for(int j=0;j<nums.length;j++){
//                 if(i!=j){
//                     if(nums[i]+nums[j]==target){
//                     index1=i;
//                     index2=j;
//                 }
//                 }
//             }
//         }
//         int[] arr={index1,index2};
//         return arr;
//     }
// }

import java.util.*;
class TwoSums{
    public int[] twoSum(int[] nums, int target) {
        int index1=0;
        int index2=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    if(nums[i]+nums[j]==target){
                    index1=i;
                    index2=j;
                }
                }
            }
        }
        int[] arr={index1,index2};
        return arr;
    }
    public static void main(String[] args){
        TwoSums twoSumsInstance = new TwoSums();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int[] result = twoSumsInstance.twoSum(arr, t);
        System.out.println(Arrays.toString(result));
    }
}