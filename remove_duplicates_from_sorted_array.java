//Time Complexity : O(n)
//Space Complexity : O(1)
//Used Two pointer technique where both the pointers start at 1
//One pointer(i) is used to traverse the whole array
//Another pointer(j) is used to add the elements in the first part of array

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int j = 1;
        int count = 1;
        
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] == nums[i-1])
            {
                count++;
            }
            else
            {
                count = 1;
            }
            if(count<=2)
            {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}