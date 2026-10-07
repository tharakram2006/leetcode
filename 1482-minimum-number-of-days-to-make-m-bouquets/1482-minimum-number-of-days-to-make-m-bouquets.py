class Solution:
    def minDays(self, bloomDay: List[int], m: int, k: int) -> int:
        if m*k>len(bloomDay):
            return -1
        else:
            low, high=1, max(bloomDay)
            while low<=high:
                mid=(low+high)//2
                ctr=0
                kctr=0
                for i in bloomDay:
                    if i<=mid:
                        ctr+=1
                        if ctr==k:
                            kctr+=1
                            ctr=0
                    else:
                        ctr=0
                if kctr>=m:
                    high=mid-1
                else:
                    low=mid+1
        return low