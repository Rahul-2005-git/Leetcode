class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        

        int tGas=0;
        int tCost=0;
        for(int i=0;i<gas.length;i++){
            tGas+=gas[i];
            tCost+=cost[i];
        }
        if(tCost>tGas)return -1;

        int pos=0;
        int remain=0;
        for(int i=0;i<gas.length;i++){
            remain+=gas[i]-cost[i];
            if(remain<0){
                pos=(i+1)%gas.length;
                remain=0;
                }
        }
        return pos;
    }
}