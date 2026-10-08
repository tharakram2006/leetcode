class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
   
       int low = 1;
        int high = 0;

        // Maximum possible answer
        for (int q : quantities) {
            high = Math.max(high, q);
        }

        while (low < high) {

            int mid = low + (high - low) / 2;

            int stores = 0;

            for (int q : quantities) {
                stores += Math.ceil((double)q /(double) mid);

            

            if (stores > n) {
                    break;
                }
            }

            if (stores <= n) {
                
                high = mid;
            } else {
                
                low = mid + 1;
            }
        }

        return low; 
      }
}