class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map=new HashMap<>();

        int j=0;
        int res=0;

        for(int i=0;i<fruits.length;i++){

            map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);

            
                while(map.size()>2){

                    if(map.get(fruits[j])==1)
                    map.remove(fruits[j]);
                    else{
                        map.put(fruits[j],map.get(fruits[j])-1);
                    }

                    j++;
                }
                int sum=0;
                for(int num:map.values()){
                    sum+=num;
                }
                res=Math.max(res,sum);
            }
        
        return res;

        // int max1=0;
        // int max2=0;

        // for(int m:map.values()){
        //     if(m>max1){
        //         max2=max1;
        //         max1=m;
        //     }else if(m<max1 && m>max2){
        //         max2=m;
        //     }
        // }
        // return max1+max2;



    }
}