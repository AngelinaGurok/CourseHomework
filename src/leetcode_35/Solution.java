package leetcode_35;

/*Given a sorted array of distinct integers and a target value, return the index if the target
 is found. If not, return the index where it would be if it were inserted in order.
        You must write an algorithm with O(log n) runtime complexity.*/
public class Solution{


    static public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        int middle = (start + end)/2;
        while (start <= end){
            if(nums[middle] == target){
                return middle;
            }
            if(nums[middle] > target){
                end = middle -1;
                middle = (start + end)/2;
            } else {
                start = middle + 1;
                middle = (start + end)/2;
            }
        }
        return start;
    }

}
