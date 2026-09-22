class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
  return atmost(nums,k)-atmost(nums,k-1);
    }
  private int atmost(int[] nums,int k)
  {
    int n=nums.length;
    int count=0;
    int left=0;
  
          HashMap<Integer,Integer> map=new HashMap<>();
        for(int j=0;j<n;j++)
        {
          
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(map.size()>k)
            {
                map.put(nums[left],map.get(nums[left])-1);
            
              if(map.get(nums[left])==0){
                map.remove(nums[left]);
              }
            left++;
        }
  
        count+=j-left+1;
        
    }
    return count;
    }
}


