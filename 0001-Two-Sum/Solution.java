import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len=nums.length;
        int[] res=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<len;i++){
            if(map.containsKey(target-nums[i])==true){
                res[0]=map.get(target-nums[i]);
                res[1]=i;
                return res;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return res;
    }
}