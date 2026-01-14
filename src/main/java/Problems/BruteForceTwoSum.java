package Problems;
/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        You can return the answer in any order.
        Example 1:

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/

public class BruteForceTwoSum {
    public int[] indices(int[] nums,int target){
        int sum=0; int[] index = new int[2];
     for(int i=0;i<nums.length;i++){
         for(int j=i+1;j<nums.length;j++){
             sum = nums[i] + nums[j];
             if(sum==target) {
                return index=new int[]{i,j};
             }
         }
     }
        return new int[0];
    }
    public static void main(String[] args) {
        BruteForceTwoSum s = new BruteForceTwoSum();
        int[] result = s.indices(new int[]{2, 7, 11, 15}, 9);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
