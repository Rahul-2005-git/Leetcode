class Solution {
    public int subarraySum(int[] nums, int k) {

    //    int []prefix=new int[nums.length];
    //     prefix[0]=nums[0];
    //    for(int i=1;i<nums.length;i++){
    //     prefix[i]=prefix[i-1]+nums[i];
    //    }


    // HashMap<Integer,Integer> map=new HashMap<>();
    //    for(int i=0;i<nums.length;i++){
    //     map.put(prefix[i],map.getOrDefault(prefix[i],0)+1);
    //    }

    //    int ans=0;
    //     for(int i=0;i<nums.length;i++){
    //         if(map.containsKey(prefix[i]-k)){
    //             ans+=map.get(prefix[i]-k);
    //         }
    //     }
    //     return ans;

    HashMap<Integer, Integer> map = new HashMap<>();

map.put(0, 1);

int sum = 0;
int ans = 0;

for (int num : nums) {

    sum += num;

    if (map.containsKey(sum - k)) {
        ans += map.get(sum - k);
    }

    map.put(sum, map.getOrDefault(sum, 0) + 1);
}

return ans;

    }
}