class Solution {
    public int maxDepth(String s) {
        int count=0;
        int max=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
        map.put('(',map.getOrDefault('(',0)+1);

        max=Math.max(max,map.get('('));
        }
        else if(c==')')
        {
        map.put('(',map.getOrDefault('(',0)-1);
        }
        }
        return max;
    }
}