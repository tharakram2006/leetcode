class Solution {
    public int shipWithinDays(int[] weights, int days) {
      int low=0;
      int high=0;
     for(int w:weights)
     {
        low=Math.max(low,w);
        high+=w;
     }  
      while(low<high)
      {
        int mid=(low+high)/2;
        int required_day=1;
        int currentsum=0;
        for(int w:weights)
        {
      if(currentsum+w>mid)
      {
        required_day++;
        currentsum=0;
        }
        currentsum+=w;
        }
      
      if(required_day<=days)
      {
        high=mid;
      }
      else{
        low=mid+1;
      }
      }
          return low;
    }
}                         