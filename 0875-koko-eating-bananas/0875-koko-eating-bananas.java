class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int low=1;int high=0;int ans=0;
       for(int i=0;i<piles.length;i++)
       {
        
            if(piles[i]>high)
                    {high=piles[i];}
       }
       while(low<=high)
    {
        int mid=(low+high)/2;
  int totalhours=hours(piles,mid);
   
   if(totalhours<=h){
    
    high=mid-1;

   }
   else{
      low=mid+1;
   }
    }
return low;
       } 
    private int  hours(int[] a,int k)
       {
        int totalhors=0;
        for(int i=0;i<a.length;i++){
            totalhors+=Math.ceil((double)a[i]/(double)k);
        }
        return totalhors;
       }
}
