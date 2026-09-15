class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
         

        int n= nums.length;
        int maxcount=0;
int j=0;
        int count=0;
while(j<n)

        {
    if(nums[j]==1)
    {
        count++;
j++;
    }
    else{
        maxcount=Math.max(count,maxcount);
        count=0;
        j++;
    }
        }
        return Math.max(count,maxcount);
    }
}