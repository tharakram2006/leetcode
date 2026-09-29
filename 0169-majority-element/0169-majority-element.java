class Solution {
    public int majorityElement(int[] nums) {
    int k=nums.length/2;
    HashMap<Integer,Integer> map=new  HashMap<>();
    for(int x:nums)
    {
        map.put(x,map.getOrDefault(x,0)+1);
    }
for(int key:map.keySet()){
    if(map.get(key) > k)
    {
     return key;
    }}
return -1;
    }
}